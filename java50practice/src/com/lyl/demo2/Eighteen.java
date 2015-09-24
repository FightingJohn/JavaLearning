package com.lyl.demo2;

public class Eighteen {

	/**
	 * 题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。
	 * 已抽签决定比赛名单。有人向队员打听比赛的名单。a说他不和x比，
	 * c说他不和x,z比，请编程序找出三队赛手的名单
	 */
	public static void main(String[] args) {
		
		//表示甲队三人
		char a='\0', b='\0', c='\0';
		//乙队三人代表放入字节数组中
		char[] ch = {'x','y','z'};
		
		//确定c的对手
		for(int i=0; i<3; i++){
			if(ch[i] != 'x' && ch[i] != 'z'){
				c = ch[i];
			}
		}
		
		//确定a的对手
		for(int i=0; i<3; i++){
			if(ch[i] != 'x' && ch[i] != c){
				a = ch[i];
			}
		}
		
		//确定b的对手
		for(int i=0; i<3; i++){
			if(ch[i] != a && ch[i] != c){
				b = ch[i];
			}
		}
		
		System.out.println("a，b，c的对手分别为: "+a+","+b+","+c);
	}

}
