package com.lyl.OO;

public final class HomeworkNine {

	/**
	 * 关键字 final、 static、 final static 修饰
	 */
	
	final int fx = 1;
	static int sx = 2;
	final static int fsx = 3;
	
	public static void main(String[] args) {
		
		HomeworkNine hn1 = new HomeworkNine();
		HomeworkNine hn2 = new HomeworkNine();
//		hn1.fx = 3;				//报错，提示remove final
		hn1.sx = 4;
//		hn1.fsx = 6;			//报错，提示remove final
		System.out.println("hn1.sx = " + hn1.sx);
		
		System.out.println("hn2修改sx后-------");
//		hn2.fx = 3;				//报错，提示remove final
		hn2.sx = 5;
//		hn2.fsx = 6;			//报错，提示remove final
		System.out.println("hn1.sx = " + hn1.sx);
		System.out.println("hn2.sx = " + hn2.sx);

	}
	
	//父类final修饰的方法
	final void setsx(){
		this.sx = 0;
	}

}
/* 报错  提示去掉 HomeworkNine 的final
class Test extends HomeworkNine{
	
	//覆盖父类的setsx（）方法
//	void setsx(){					//报错，提示去掉父类setsx（）的final修饰符
//		
//	}
}
*/
