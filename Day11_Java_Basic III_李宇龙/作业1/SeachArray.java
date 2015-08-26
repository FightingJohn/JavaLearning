import java.util.Scanner;

class  SeachArray
{
	/*数组查表法(根据键盘录入索引,查找对应星期)
	*/

	public static void main(String[] args) 
	{
		//初始化String类型数组
		String[] str = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};

		Scanner scan = new Scanner(System.in);

		System.out.println("输入一个数（1——7）：");

		int index = scan.nextInt();

		if(index >= 1 && index <= 7)
			System.out.println(index + "对应：" + str[index-1]);
		else
			System.out.println("输入有误！");
	}
}
