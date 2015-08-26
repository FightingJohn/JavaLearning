class ReverseArrary 
{
	/*数组元素逆序 (就是把元素对调)
	arr[0] 互换 arr[arr.length-1]
	arr[1] 互换 arr[arr.length-2]
	...
	用一个中间变量temp存储arr[0],然后arr[0]=arr[arr.length-1]
	最后arr[arr.length-1]=temp,完成互换
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
		int[] arr = {3, 5, 2, 7, 9, 14, 2, 6};

		System.out.println("原始数组为：");

		printArr(arr);

		for(int i = 0; i < arr.length/2; i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}

		System.out.println("逆序数组为：");

		printArr(arr);
	}
}
