import java.util.Scanner;

class MonthToSeason 
{
	/*输入月份，输出对应的季节
	*/

	public static void main(String[] args) 
	{
		//输入月份
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();

		//使用switch（）实现
		switch(month){
			case 1:
			case 2:
			case 3:System.out.println("春季");
					break;
			case 4:
			case 5:
			case 6:System.out.println("夏季");
					break;
			case 7:
			case 8:
			case 9:System.out.println("秋季");
					break;
			case 10:
			case 11:
			case 12:System.out.println("冬季");
					break;
			default:System.out.println("输入有误，没有 " + month + " 月");
					break;
		}
		
	}
}
