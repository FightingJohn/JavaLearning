class PraticeOne 
{
	/*输出如下条件五位数：
	个位等于万位
	十位等于千位
	个位+十位+千位+万位=百位
	*/
	public static void main(String[] args) 
	{
		int count = 0;   //记录符合要求的五位数

		//遍历所有的五位数
		System.out.println("满足条件的五位书如下：");
		for(int i = 10000; i < 99999; i++){
			//得到个，十，百，千，万的数值
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
		System.out.println("一共有 " + count + " 个");
	}
}
