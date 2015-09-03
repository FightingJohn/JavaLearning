package com.lyl.homework8;

public class HomeworkEight {

	/**
	 * �쳣�ۺ���ϰ
	 */
	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1, 30, "lisi");
		Employee employee2 = new Employee(2, 23, "zhangsan");
		Employee employee3 = new Employee(3, 45, "wangwu");
		employee3.showTotalEmployee();
		Employee employeeSalary1 = new Employee("457823456", 700);
		Employee employeeSalary2 = new Employee("848572", 900);
		Employee employeeSalary3 = new Employee("10348566", 1700);
		employeeSalary3.showTotalSalary();

	}

}

//Ա����
class Employee{
	private int num;					//���
	private String name;				//����
	private int age;					//����
	private double salary;				//����
	private String idCard;				//���֤����
	private static int employeeSum = 0;		//Ա������
	private static double salaryTotal = 0;		//Ա�������ܶ� 
	

	
	/*���ñ�ţ����䣬������
	  1.�������С��18���׳�������쳣��
	  2.����������60�׳�������쳣��
	  3.�������Ϊnull��Ϊ���ַ������׳����쳣�� */
	public Employee(int num, int age, String name){
		
		if(age < 18)
			try {
				throw new AgeYoungException();
			} catch (AgeYoungException e) {
				
				e.printStackTrace();
				return;
			}
		else if(age > 60)
			try {
				throw new AgeOldException();
			} catch (AgeOldException e) {
				
				e.printStackTrace();
				return;
			}
		else
			this.age = age;
		
		if(name == null || name == "")
			try {
				throw new NameNullException();
			} catch (NameNullException e) {

				e.printStackTrace();
				return;
			}
		else {
			this.name = name;
			this.num = num;
			this.employeeSum++;				//��ʼ���ɹ���Ա��������1
		}
	
	}
	
	/*���ù��ʣ��������֤���룻
	 1��������֤��Ϊ�գ��׳����֤�Ƿ��쳣
	 2��������ʵ���600���׳����ʵ��쳣�� */
	
	public Employee(String idCard, double salary){
		
		if(idCard == null || idCard == ""){
			try {
				throw new IdNotNullException();
			} catch (IdNotNullException e) {

				e.printStackTrace();
				return;
			}
		}
		else
			this.idCard = idCard;
		
		if(salary < 600)
			try {
				throw new SalaryLowException();
			} catch (SalaryLowException e) {

				e.printStackTrace();
				return;
			}
		else{
			this.salary = salary;
			this.salaryTotal += this.salary;			//Ա���ܹ��ʼӴ�Ա������
		}
			
	}
	
	//����Ա������
	public void addSalary(double addSalary){
		
		this.salary += addSalary;						//�ӹ���
		if(this.salary > this.salaryTotal){
			try {
				throw new SalaryHighException();
			} catch (SalaryHighException e) {

				this.salary -= addSalary;				//�ѹ��ʻָ���֮ǰ
				e.printStackTrace();
			}
		}
	}
	
	//����Ա������
	public void minusSalary(double minusSalary){
		
		this.salary -= minusSalary;
		if (this.salary < 600){
			try {
				throw new SalaryLowException();
			} catch (SalaryLowException e) {
				
				this.salary += minusSalary;				//�ѹ��ʻָ���֮ǰ
				e.printStackTrace();
			}
		}
	}
	
	//��ʾԱ�������ܶ�
	public void showTotalSalary(){
		
		if(this.salaryTotal == 0)
			try {
				throw new NullException();
			} catch (NullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else
			System.out.println("Ա���ܹ���Ϊ��" + this.salaryTotal);
	}
	
	//��ʾԱ������
	public void showTotalEmployee(){
		
		if(this.employeeSum == 0)
			try {
				throw new NullException();
			} catch (NullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else
			System.out.println("Ա������Ϊ��" + this.employeeSum);
	}
}