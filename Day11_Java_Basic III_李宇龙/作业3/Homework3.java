
/*输入数组，最大的与第一个元素交换，
最小的与最后一个元素交换，然后输出数组。
*/
import java.util.Scanner;
class Homework3 
{
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
		Scanner scan = new Scanner(System.in);
		//定义int类型数组
		int[] arr = new int[8];
		System.out.println("输入8个整数：");
		for(int i = 0; i < arr.length; i++){
			arr[i] = scan.nextInt();	
		}
		
		System.out.println("原数组为：");
		printArr(arr);
		int max = arr[0], maxIndex = 0;
		int min = arr[arr.length-1], minIndex = arr.length-1;
		int temp = 0;

		//得到数组最大值
		for(int i = 1; i < arr.length; i++){
			if(max < arr[i]){
				max = arr[i];
				maxIndex = i;
			}
		}

		//得到数组最小值
		for(int i = 0; i < arr.length-1; i++){
			if(min > arr[i]){
				min = arr[i];	
				minIndex = i;
			}
		}

		//最大值与首位交换位置
		if(max == arr[0]){}
		else{
			temp = arr[0];
			arr[0] = arr[maxIndex];
			arr[maxIndex] = temp;
		}

		//最小值与末尾交换位置
		if(min == arr[arr.length-1]){}
		else{
			temp = arr[arr.length-1];
			arr[arr.length-1] = arr[minIndex];
			arr[minIndex] = temp;
		}

		System.out.println("修改后的数组为：");
		printArr(arr);
	}
}
