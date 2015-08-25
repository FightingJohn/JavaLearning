class  Demo1
{
	public static void main(String[] args) 
	{
		/*分析：因为byte的取值范围为-128~127 .所有135不在取值范围内
		加上byte强转后会被截取，如下
		0000 0000 0000 0000 0000 0000 | 1000 0111  
		|右边为截取部分。结果为-7，此时为预期结果的补码，减1（1000 0110）
		取反得到原码为1111 1001   十进制为  -121
		*/
		byte b = (byte)135;
		System.out.println(b);
	}
}
