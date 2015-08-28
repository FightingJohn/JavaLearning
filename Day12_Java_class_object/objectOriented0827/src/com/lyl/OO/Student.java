package com.lyl.OO;

public class Student {

	/**
	 * ¼��ѧ����Ϣ�Ϳ��Գɼ���������ѧ�����Գɼ���ƽ��ֵ�Լ����е����ֵ����Сֵ
	 */
	
	private String sNO ;			//ѧ��
	private String sName;			//����
	private String sSex;			//�Ա�
	private int sAge;				//����
	private float sJava;			//java�ɼ�
	
	//���췽��
	public Student(String sNo, String sName, String sSex, int sAge, float sJava){
		
		this.sNO = sNo;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}
	
	//���ѧ�ţ��������Ա����䣬java�ɼ���get����
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
		float min = 0, max = 0;      	//��¼java�ɼ�����Сֵ�����ֵ
		float sum = 0, average = 0; 				//��¼java�ɼ����ֺܷ�ƽ��ֵ
		
		Student stu1 = new Student("11111", "����", "��", 20, 61);
		Student stu2 = new Student("22222", "��÷", "Ů", 19, 74);
		Student stu3 = new Student("33333", "����", "��", 22, 59);
		Student stu4 = new Student("44444", "С��", "Ů", 21, 78);
		Student stu5 = new Student("55555", "����", "��", 25, 90);
		
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
		System.out.println("��ߵ�Java�ɼ�Ϊ��"+ max);
		System.out.println("��͵�Java�ɼ�Ϊ��"+ min);
		System.out.println("ƽ����Java�ɼ�Ϊ��"+ average);

	}

}
