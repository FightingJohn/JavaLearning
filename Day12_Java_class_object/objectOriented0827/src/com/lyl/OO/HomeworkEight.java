package com.lyl.OO;

public class HomeworkEight {

	/**
	 * 测试 pulic、 protected、 private、 缺省修饰时的访问权限
	 */
	
	public int pub;
	protected int pro;
	private int pri;
	int def;
	
	//在本类内部测试
	public void setValue(){
		pub = 1;			//ok
		pro = 2;			//ok
		pri = 3;			//ok
		def = 4;			//ok
	}
}

//测试同一个包非子类
class Test{
	public void setValue(){
		HomeworkEight he = new HomeworkEight();
		he.pub = 1;			// ok
		he.pro = 2;			// ok
//		he.pri = 3;			//not ok  提示chage to default 修饰
		he.def = 4;			// ok
	}
}

//测试同一个包中的子类
class Test1 extends HomeworkEight{
	public void setValue(){
		HomeworkEight he = new HomeworkEight();
		he.pub = 1;			// ok
		he.pro = 2;			// ok
//		he.pri = 3;			//not ok  提示chage to protected 修饰
		he.def = 4;			// ok
	}
}
