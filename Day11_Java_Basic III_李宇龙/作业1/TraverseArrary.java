class TraverseArrary 
{
	/*�������(������������е�ÿһ��Ԫ��)
	���ǿ���ͨ�������length���Եõ�����ĳ��ȣ�
	�������ǲ���forѭ����������
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
		//��һ�ֳ�ʼ�����鷽��
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++)
			arr[i] = i+1;

		//�ڶ��ֳ�ʼ�����鷽��
		int[] arr2 = new int[]{2, 4, 6, 8, 10, 2};

		//�����ֳ�ʼ�����鷽��
		int[] arr3 = {5, 6, 2, 3, 1, 10};
		System.out.println("�����Ԫ��Ϊ��");
		printArr(arr);
		printArr(arr2);
		printArr(arr3);
	}
}
