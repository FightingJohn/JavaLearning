class CompareTowData 
{
	/*�Ƚ����������Ƿ���ȡ�
	�������ͷֱ�Ϊ����byte���ͣ�
	����short���ͣ�����int���ͣ�
	����long���ͣ�����main�����н��в���
	*/
	
	//���ú�������ʵ��
	//1.�Ƚ�byte���͵�
	public static void compare(byte a, byte b){
		if(a == b)
			System.out.println("byte: " + a + " ���� " +b);
		else
			System.out.println("byte: " + a + " ������ " +b);
	}

	//2.�Ƚ�short���͵�
	public static void compare(short a, short b){
		if(a == b)
			System.out.println("short: " + a + " ���� " +b);
		else
			System.out.println("short: " + a + " ������ " + b);
	}

	//3.�Ƚ�int���͵�
	public static void compare(int a, int b){
		if(a == b)
			System.out.println("int: " + a + " ���� " +b);
		else
			System.out.println("int: " + a + " ������ " +b);
	}

	//4.�Ƚ�long���͵�
	public static void compare(long a, long b){
		if(a == b)
			System.out.println("long: " + a + " ���� " +b);
		else
			System.out.println("long: " + a + " ������ " +b);
	}


	public static void main(String[] args) 
	{
		byte a = 1, b = 2;
		int ia = 3, ib = 3;
		short sa = 2, sb = 5;
		long fa = 4, fb = 4;

		compare(a, b);
		compare(ia, ib);
		compare(sa, sb);
		compare(fa, fb);
	}
}
