import java.util.Scanner;

class MonthToSeason 
{
	/*�����·ݣ������Ӧ�ļ���
	*/

	public static void main(String[] args) 
	{
		//�����·�
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();

		//ʹ��switch����ʵ��
		switch(month){
			case 1:
			case 2:
			case 3:System.out.println("����");
					break;
			case 4:
			case 5:
			case 6:System.out.println("�ļ�");
					break;
			case 7:
			case 8:
			case 9:System.out.println("�＾");
					break;
			case 10:
			case 11:
			case 12:System.out.println("����");
					break;
			default:System.out.println("��������û�� " + month + " ��");
					break;
		}
		
	}
}
