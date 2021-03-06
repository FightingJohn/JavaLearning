/*某个公司采用公用电话传递数据，数据是四位的整数，
	在传递过程中是加密的，加密规则如下：每位数字都加上5,
	然后用和除以10的余数代替该数字，再将第一位和第四位交
    换，第二位和第三位交换。 请帮忙实现加密功能。
*/
import java.util.Scanner;
class  HomeworkFour
{
	/*如果用一个int型变量存储这传输的4位数，
	加密操作时，需要很多变量，以及取余和除操作，
	所以我们采用int型数组存取这四位数
	*/

	//打印数组所有元素
	private static void printArr(int[] arr){
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) 
	{
		int[] data = new int[4];

		Scanner scan = new Scanner(System.in);

		System.out.println("输入四个正整数（0-9）：");
		for(int i = 0; i < data.length; i++){
			data[i] = scan.nextInt();
		}
		System.out.println("未加密的数据：");
		 printArr(data);

		//加密过程
		for(int i = 0; i < data.length; i++){
			data[i] = (data[i] + 5) % 10;
		}

		for(int i = 0; i < data.length/2; i++){
			int temp = data[i];
			data[i] = data[data.length-1-i];
			data[data.length-1-i] = temp;
		}
		System.out.println("加密后的数据为");
		printArr(data);
	}
}
