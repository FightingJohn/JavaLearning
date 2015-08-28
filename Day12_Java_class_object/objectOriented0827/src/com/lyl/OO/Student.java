package com.lyl.OO;

public class Student {

	/**
	 * 录入学生信息和考试成绩，求所有学生考试成绩的平均值以及其中的最大值和最小值
	 */
	
	private String sNO ;			//学号
	private String sName;			//姓名
	private String sSex;			//性别
	private int sAge;				//年龄
	private float sJava;			//java成绩
	
	//构造方法
	public Student(String sNo, String sName, String sSex, int sAge, float sJava){
		
		this.sNO = sNo;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}
	
	//获得学号，姓名，性别，年龄，java成绩的get方法
	public String getsNO() {
		return sNO;
	}

	public String getsName() {
		return sName;
	}

	public String getsSex() {
		return sSex;
	}

	public int getsAge() {
		return sAge;
	}

	public float getsJava() {
		return sJava;
	}
	
	public static void main(String[] args) {
		float min = 0, max = 0;      	//记录java成绩的最小值和最大值
		float sum = 0, average = 0; 				//记录java成绩的总分和平均值
		
		Student stu1 = new Student("11111", "张三", "男", 20, 61);
		Student stu2 = new Student("22222", "王梅", "女", 19, 74);
		Student stu3 = new Student("33333", "王五", "男", 22, 59);
		Student stu4 = new Student("44444", "小红", "女", 21, 78);
		Student stu5 = new Student("55555", "赵六", "男", 25, 90);
		
		Student[] students = {stu1, stu2, stu3, stu4, stu5};
		min = students[0].sJava;
		max = students[0].sJava;
		for(int i = 0; i < students.length; i++){
			if(min > students[i].getsJava())
				min = students[i].getsJava();
			if(max < students[i].getsJava())
				max = students[i].getsJava();
			sum+=students[i].getsJava();
			System.out.print(students[i].getsNO() + "\t");
			System.out.print(students[i].getsName() + "\t");
			System.out.print(students[i].getsSex() + "\t");
			System.out.print(students[i].getsAge() + "\t");
			System.out.print(students[i].getsJava() + "\t");
			System.out.println();
		}
		average = sum / 5;
		System.out.println("最高的Java成绩为："+ max);
		System.out.println("最低的Java成绩为："+ min);
		System.out.println("平均的Java成绩为："+ average);

	}

}
