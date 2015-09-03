package com.lyl.homework8;

public class HomeworkEight {

	/**
	 * 异常综合练习
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

//员工类
class Employee{
	private int num;					//编号
	private String name;				//姓名
	private int age;					//年龄
	private double salary;				//工资
	private String idCard;				//身份证号码
	private static int employeeSum = 0;		//员工人数
	private static double salaryTotal = 0;		//员工工资总额 
	

	
	/*设置编号，年龄，姓名；
	  1.如果年龄小于18，抛出年龄低异常；
	  2.如果年龄大于60抛出年龄高异常，
	  3.如果姓名为null或为空字符串，抛出空异常。 */
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
			this.employeeSum++;				//初始化成功则员工总数加1
		}
	
	}
	
	/*设置工资，设置身份证号码；
	 1，如果身份证号为空，抛出身份证非法异常
	 2，如果工资低于600，抛出工资低异常。 */
	
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
			this.salaryTotal += this.salary;			//员工总工资加此员工工资
		}
			
	}
	
	//增加员工工资
	public void addSalary(double addSalary){
		
		this.salary += addSalary;						//加工资
		if(this.salary > this.salaryTotal){
			try {
				throw new SalaryHighException();
			} catch (SalaryHighException e) {

				this.salary -= addSalary;				//把工资恢复到之前
				e.printStackTrace();
			}
		}
	}
	
	//减少员工工资
	public void minusSalary(double minusSalary){
		
		this.salary -= minusSalary;
		if (this.salary < 600){
			try {
				throw new SalaryLowException();
			} catch (SalaryLowException e) {
				
				this.salary += minusSalary;				//把工资恢复到之前
				e.printStackTrace();
			}
		}
	}
	
	//显示员工工资总额
	public void showTotalSalary(){
		
		if(this.salaryTotal == 0)
			try {
				throw new NullException();
			} catch (NullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else
			System.out.println("员工总工资为：" + this.salaryTotal);
	}
	
	//显示员工总数
	public void showTotalEmployee(){
		
		if(this.employeeSum == 0)
			try {
				throw new NullException();
			} catch (NullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else
			System.out.println("员工总数为：" + this.employeeSum);
	}
}