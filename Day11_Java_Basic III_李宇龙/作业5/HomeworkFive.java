/*输入某年某月某日，如何判断这一天是这一年的第几天？使用代码实现*/

import java.util.Scanner;
class  HomeworkFive
{
	/*首先根据年份判断是否为闰年，把闰年月份对应的第几天放在一个
	int型数组内,根据输入的月份可以直接得到对应的天数
	*/
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//int数组保存瑞年每个月对应第几天
		int[] months = {0, 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
		int days = 0;

		System.out.println("输入年份: ");
		int year = scan.nextInt();

		System.out.println("输入月份（1-12）: ");
		int month = scan.nextInt();

		System.out.println("输入几号: ");
		int day = scan.nextInt();

		if(year % 4 != 0){
			days -= 1;
		}
//		System.out.println(days);
		days = days + months[month] + day;
		System.out.println(year +"年"+ month+"月"+ day+"日是这一年的第 "+ days+" 天");
	}
}
