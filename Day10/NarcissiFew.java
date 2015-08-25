class NarcissiFew
{
	//打印100-999之间的水仙花数（每个位上的数字的 n 次幂之和等于它本身）

	public static void main(String[] args) 
	{
		int count = 0;				//记录水仙花的个数
		//循环遍历100-999
		for(int i = 100; i < 999; i++){
			//获得每个位上的数字
			int unit = i % 10;
			int decade = i / 10 % 10;
			int hundredsPlace = i / 100;
			//各位数值3次幂相加
			int temp = (int)Math.pow(unit, 3) + 
				(int)Math.pow(decade, 3) +
				(int)Math.pow(hundredsPlace, 3);
			if(temp == i){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("水仙花数有 " + count + " 个");
	}
}
