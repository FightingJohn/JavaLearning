class MultiplicationTable 
{
	/*打印9 x 9乘法表
	*/
	public static void main(String[] args) 
	{
		//使用for循环嵌套实现
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(i +"*"+ j +"="+ i*j +'\t');
			}
			System.out.println();
		}
	}
}
