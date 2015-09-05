package thread;

public class ThreadSix {

	/**
	 * 生产者和消费者的例子，难点是多个生产者和多个消费者的
	 */
	public static void main(String[] args) {
		Resourse res = new Resourse();
		Thread t1=new Thread(new producer(res));
		Thread t2=new Thread(new producer(res));
		Thread t3=new Thread(new Consumer(res));
		Thread t4=new Thread(new Consumer(res));
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}

class Resourse{
	private String name;
	private boolean flag=false;
	private int count=0;
	
	public synchronized void set(String name){
		while(flag){//多个相同线程是要用while循环
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.name=name + "-----"+count++;
		
		System.out.println(Thread.currentThread().getName()+"--生产者--"+this.name);
		flag=true;
		this.notifyAll();//打开所有的等待线程
	}
	
	public synchronized void get(){
		while(!flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"-----消费者--------"+this.name);
		flag=false;
		this.notifyAll();
	}
}

class producer implements Runnable{
	private Resourse res;
	public producer(Resourse res) {
		this.res=res;
	}
	public void run(){
		for(int i =0;i<20;i++){
			res.set("商品");
		}
	}
}

class Consumer implements Runnable{
	private Resourse res;
	public Consumer(Resourse res) {
		this.res=res;
	}
	public void run(){
		for(int i =0;i<20;i++){
			res.get();
		}
	}
}


