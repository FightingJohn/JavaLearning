
/*�������飬�������һ��Ԫ�ؽ�����
��С�������һ��Ԫ�ؽ�����Ȼ��������顣
*/
import java.util.Scanner;
class Homework3 
{
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
		Scanner scan = new Scanner(System.in);
		//����int��������
		int[] arr = new int[8];
		System.out.println("����8��������");
		for(int i = 0; i < arr.length; i++){
			arr[i] = scan.nextInt();	
		}
		
		System.out.println("ԭ����Ϊ��");
		printArr(arr);
		int max = arr[0], maxIndex = 0;
		int min = arr[arr.length-1], minIndex = arr.length-1;
		int temp = 0;

		//�õ��������ֵ
		for(int i = 1; i < arr.length; i++){
			if(max < arr[i]){
				max = arr[i];
				maxIndex = i;
			}
		}

		//�õ�������Сֵ
		for(int i = 0; i < arr.length-1; i++){
			if(min > arr[i]){
				min = arr[i];	
				minIndex = i;
			}
		}

		//���ֵ����λ����λ��
		if(max == arr[0]){}
		else{
			temp = arr[0];
			arr[0] = arr[maxIndex];
			arr[maxIndex] = temp;
		}

		//��Сֵ��ĩβ����λ��
		if(min == arr[arr.length-1]){}
		else{
			temp = arr[arr.length-1];
			arr[arr.length-1] = arr[minIndex];
			arr[minIndex] = temp;
		}

		System.out.println("�޸ĺ������Ϊ��");
		printArr(arr);
	}
}
