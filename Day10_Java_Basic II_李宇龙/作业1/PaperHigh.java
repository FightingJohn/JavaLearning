class PaperHigh 
{
	/*�ҹ����ɽ������������壺8848m��
	��������һ���㹻���ֽ�ţ����Ϊ��0.01m��
	���ʣ����۵����ٴΣ��Ϳ��Ա�֤��Ȳ��������������ĸ߶�?
	*/

	public static void main(String[] args) 
	{
		int everest = 8848;     //�������������ĸ߶�
		float onePaper = 0.01f; //����һ��ֽ�ĺ��
		int count = 0;			//��¼�۵�����

		while(onePaper <= everest){
			
			onePaper = onePaper * 2;
			count++;
		}
		System.out.println("һ��0.01���׵�ֽ�۵� " + count + "�κ�ĺ�Ȳ��������������");
	}
}
