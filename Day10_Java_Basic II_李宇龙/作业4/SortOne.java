import java.util.Scanner;

class SortOne 
{
	//��ӡ����ĺ���
	private static void printArr(int[] a){
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}


	//����¼��10�������������10������������
	public static void main(String[] args) 
	{
		//����һ������Ϊ10��int��������
		int[] a= new int[10];							

		//����10������
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 10; i++){
			a[i] = scan.nextInt();
		}

		/*��һ�����򷽷�(����).˼�룺��һ�����ں�������������Ƚϣ�
		������ڶԷ����ͽ����˴˵���ֵ���Ƚϵ����һ������Ȼ��ڶ�����
		�͵�һ����һ���ͺ���������Ƚϡ�ֱ�����һ����
		���Բ���forǶ��ѭ�����������
		*/

		for(int i = 0; i < 9; i++){
			for(int j = i+1; j < 10; j++){
				int temp;
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("��С�������������10������");
		printArr(a);
	}
}
