class NarcissiFew
{
	//��ӡ100-999֮���ˮ�ɻ�����ÿ��λ�ϵ����ֵ� n ����֮�͵���������

	public static void main(String[] args) 
	{
		int count = 0;				//��¼ˮ�ɻ��ĸ���
		//ѭ������100-999
		for(int i = 100; i < 999; i++){
			//���ÿ��λ�ϵ�����
			int unit = i % 10;
			int decade = i / 10 % 10;
			int hundredsPlace = i / 100;
			//��λ��ֵ3�������
			int temp = (int)Math.pow(unit, 3) + 
				(int)Math.pow(decade, 3) +
				(int)Math.pow(hundredsPlace, 3);
			if(temp == i){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("ˮ�ɻ����� " + count + " ��");
	}
}
