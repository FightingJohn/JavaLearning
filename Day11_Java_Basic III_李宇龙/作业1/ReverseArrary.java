class ReverseArrary 
{
	/*����Ԫ������ (���ǰ�Ԫ�ضԵ�)
	arr[0] ���� arr[arr.length-1]
	arr[1] ���� arr[arr.length-2]
	...
	��һ���м����temp�洢arr[0],Ȼ��arr[0]=arr[arr.length-1]
	���arr[arr.length-1]=temp,��ɻ���
	*/

	//��ӡ��������Ԫ��
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

		System.out.println("ԭʼ����Ϊ��");

		printArr(arr);

		for(int i = 0; i < arr.length/2; i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}

		System.out.println("��������Ϊ��");

		printArr(arr);
	}
}
