class  PraticeTow
{
	/*ͳ��1-1000֮��ͬʱ������������������
	��3������2
	��5������3
	��7������2
	*/
	public static void main(String[] args) 
	{
		int count = 0;    //��¼���������ĸ���

		//����1-1000
		for(int i = 1; i < 1000; i++){
			if(i % 3 == 2 && i % 5 == 3 && i % 7 == 2){
				count++;
			}
		}
		System.out.println("�������������ָ���Ϊ��"+ count);
	}
}
