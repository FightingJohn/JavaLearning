class HomeworkTow 
{
	/*С��������ÿ�����2.5ԪǮ���������������
	���ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ���
	�����Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ
	*/
	public static void main(String[] args) 
	{
		//��������ʹ��ѭ�����Խ�����⣬
		//����whileѭ�����

		int count = 0;						//��¼����
		float money = 0.0f;						//С�������Ǯ
		while(money <= 100){
			count++;
			money += 2.5;
			if(count % 5 == 0)
				money -= 6;
		}
		System.out.println("���� "+ count +"�죬С���浽100Ԫ");
	}
}
