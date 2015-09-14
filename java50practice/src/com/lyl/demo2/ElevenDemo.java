package com.lyl.demo2;

public class ElevenDemo {

	/**
	 * 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
	 * 程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列
	 */
	public static void main(String[] args) {
		
		int count = 0;				//记录满足题意得3位数
		for(int hund = 1; hund < 5; hund++){
			for(int ten = 1; ten < 5; ten++){
				if(hund == ten)
					continue;
				for(int last = 1; last < 5; last++){
					if(last != hund && last != ten){
						System.out.print(hund*100+ten*10+last + " ");
						count++;
					}
				}
			}
		}
		System.out.println();
		System.out.println("一共  "+ count + "个");

	}

}
