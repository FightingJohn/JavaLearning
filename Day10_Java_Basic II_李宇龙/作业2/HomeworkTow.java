class HomeworkTow 
{
	/*小芳的妈妈每天给她2.5元钱，她都会存起来，
	但是，每当这一天是存钱的第5天或者5的倍数的话，
	她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱
	*/
	public static void main(String[] args) 
	{
		//经过分析使用循环可以解决问题，
		//采用while循环完成

		int count = 0;						//记录天数
		float money = 0.0f;						//小芳手里的钱
		while(money <= 100){
			count++;
			money += 2.5;
			if(count % 5 == 0)
				money -= 6;
		}
		System.out.println("经过 "+ count +"天，小芳存到100元");
	}
}
