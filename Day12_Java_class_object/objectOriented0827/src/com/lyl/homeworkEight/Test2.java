package com.lyl.homeworkEight;

import com.lyl.OO.HomeworkEight;

public class Test2 extends HomeworkEight{

	//��ͬ���е�����
	public void setValue(){
		super.pub = 1;		//ok
//		super.pri = 3;		//not ok  ��ʾ chage to protected ����
		super.pro = 2;		//ok
//		super.def = 4;		//not ok  ��ʾ chage to protected ����
		
}

}
