import java.util.Scanner;

class  SeachArray
{
	/*������(���ݼ���¼������,���Ҷ�Ӧ����)
	*/

	public static void main(String[] args) 
	{
		//��ʼ��String��������
		String[] str = {"����һ", "���ڶ�", "������", "������", "������", "������", "������"};

		Scanner scan = new Scanner(System.in);

		System.out.println("����һ������1����7����");

		int index = scan.nextInt();

		if(index >= 1 && index <= 7)
			System.out.println(index + "��Ӧ��" + str[index-1]);
		else
			System.out.println("��������");
	}
}
