package com.lyl.homeworkEight;

import com.lyl.OO.HomeworkEight;

public class Test2 extends HomeworkEight{

	//不同包中的子类
	public void setValue(){
		super.pub = 1;		//ok
//		super.pri = 3;		//not ok  提示 chage to protected 修饰
		super.pro = 2;		//ok
//		super.def = 4;		//not ok  提示 chage to protected 修饰
		
}

}
