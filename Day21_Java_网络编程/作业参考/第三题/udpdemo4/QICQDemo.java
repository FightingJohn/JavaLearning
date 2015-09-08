

public class QICQDemo {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client client =new Client();
		Server server =new Server();
		
		Thread t1 = new Thread(server);
		Thread t2 = new Thread(client);
		
		t1.start();
		t2.start();
		
		//...
		
		
		
		
		

	}

}
