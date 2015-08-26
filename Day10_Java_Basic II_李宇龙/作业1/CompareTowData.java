class CompareTowData 
{
	/*比较两个数据是否相等。
	参数类型分别为两个byte类型，
	两个short类型，两个int类型，
	两个long类型，并在main方法中进行测试
	*/
	
	//利用函数重载实现
	//1.比较byte类型的
	public static void compare(byte a, byte b){
		if(a == b)
			System.out.println("byte: " + a + " 等于 " +b);
		else
			System.out.println("byte: " + a + " 不等于 " +b);
	}

	//2.比较short类型的
	public static void compare(short a, short b){
		if(a == b)
			System.out.println("short: " + a + " 等于 " +b);
		else
			System.out.println("short: " + a + " 不等于 " + b);
	}

	//3.比较int类型的
	public static void compare(int a, int b){
		if(a == b)
			System.out.println("int: " + a + " 等于 " +b);
		else
			System.out.println("int: " + a + " 不等于 " +b);
	}

	//4.比较long类型的
	public static void compare(long a, long b){
		if(a == b)
			System.out.println("long: " + a + " 等于 " +b);
		else
			System.out.println("long: " + a + " 不等于 " +b);
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
