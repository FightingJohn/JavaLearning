package com.lyl.homeworkEight;

import com.lyl.OO.HomeworkEight;

public class Test4 {
	
	//不同包中的非子类
	public void setValue(){
		HomeworkEight he = new HomeworkEight();
		he.pub = 1;			// ok
//		he.pro = 2;			// not ok  提示chage to prublic 修饰
//		he.pri = 3;			// not ok  提示chage to prublic 修饰
//		he.def = 4;			// not ok  提示chage to prublic 修饰

	}
}
