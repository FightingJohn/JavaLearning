class PraticeOne 
{
	/*�������������λ����
	��λ������λ
	ʮλ����ǧλ
	��λ+ʮλ+ǧλ+��λ=��λ
	*/
	public static void main(String[] args) 
	{
		int count = 0;   //��¼����Ҫ�����λ��

		//�������е���λ��
		System.out.println("������������λ�����£�");
		for(int i = 10000; i < 99999; i++){
			//�õ�����ʮ���٣�ǧ�������ֵ
			int unit = i % 10;
			int decade = i / 10 % 10;
			int hundredsPlace = i / 100 % 10;
			int kilobit = i / 1000 % 10;
			int myriabit = i / 10000;
			int temp = unit + decade + kilobit + myriabit;
			if(unit == myriabit && decade == kilobit && temp == hundredsPlace){
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println("һ���� " + count + " ��");
	}
}
