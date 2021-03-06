import java.util.Scanner;

class InsertData 
{
	/*有一个已经排好序的数组。现键盘输入一个数，
	要求按原来的规律将它插入数组中。 并将新的数组输出
	*/

	//打印数组所有元素
	private static void printArr(int[] arr){
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	/*插入方法——直接插入。在升序数组中插入数据，
	欲插入数据与第一个数据开始比较，大于就和下一个数比较
	直到小于一个数(特殊情况，插入数据最大)
	*/
/*	private static void straightInsert(int[] arr)
	{
		int temp = arr[0];
		if(arr[0] > arr[arr.length-1]){
			for(int j = 0; j < arr.length-1; j++)
					arr[j] = arr[j+1];
				arr[arr.length-1] = temp;
				return;
		}
		for(int i = 1; i < arr.length; i++){
			if(arr[0] < arr[i]){
				for(int j = 0; j < i-1; j++)
					arr[j] = arr[j+1];
				arr[i-1] = temp;
				break;
			}
		}
	}
*/
	/*插入方法——折半插入, 在升序数组中插入数据，
	欲插入数据x与 数组中的中间值a[mid]进行比较，如果大于，
	以mid+1为开始，某位为结束，取中间值继续比较。如果小于
	以首位为开始，mid-1为结束取中间值进行比较
	*/
	private static void binInsert(int[] arr)
	{
		int temp = arr[0];
		if(arr[0] > arr[arr.length-1]){
			for(int j = 0; j < arr.length-1; j++)
					arr[j] = arr[j+1];
				arr[arr.length-1] = temp;
				return;
		}

		int low = 1, high = arr.length-1, mid = 0;
		while(low <= high){			
			mid = (low + high) / 2;

			if(arr[0] < arr[mid])
				high = mid - 1;	
			else if(arr[0] > arr[mid])
				low = mid + 1;
			else
				break;
		}
		for(int i = 0; i < mid - 1; i++){
			arr[i] = arr[i+1];
		}
		arr[mid - 1] = temp;
	}


	public static void main(String[] args) 
	{

		System.out.println("输入一个整数：");
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		//定义一个有序(升序)的int型数组
		int[] arr = {2, 5, 6, 8, 10, 14, 17, 20};

		//初始化一个长度为arr.length+1的数组.因为原数组插入一个元素后，长度加1
		int[] arr2 = new int[arr.length + 1];
		arr2[0] = x;								//新数组的第一个元素等于要插入的元素

		//把原数组拷贝到新数组中
		for(int i = 1; i < arr2.length; i++){
			arr2[i] = arr[i-1];
		}

		System.out.print("插入前数组：");
		printArr(arr);
		binInsert(arr2);
		System.out.print(x + " 插入数组后：");
		printArr(arr2);

	}
}
