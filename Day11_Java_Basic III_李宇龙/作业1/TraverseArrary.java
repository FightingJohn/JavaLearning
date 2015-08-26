class TraverseArrary 
{
	/*数组遍历(依次输出数组中的每一个元素)
	我们可以通过数组的length属性得到数组的长度，
	所以我们采用for循环遍历数组
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
		//第一种初始化数组方法
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++)
			arr[i] = i+1;

		//第二种初始化数组方法
		int[] arr2 = new int[]{2, 4, 6, 8, 10, 2};

		//第三种初始化数组方法
		int[] arr3 = {5, 6, 2, 3, 1, 10};
		System.out.println("数组的元素为：");
		printArr(arr);
		printArr(arr2);
		printArr(arr3);
	}
}
