package com.lyl.homework6;

public class ComputeTime {

	/**
	 * 接口练习
	 */
	
	public static void main(String[] args) throws Exception {

		String str = "com.lyl.homework6."+args[0];
		Common com = (Common) Class.forName(str).newInstance();
		int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		int c = Integer.parseInt(args[3]);		
		int sd = com.speed(a, b, c);
		System.out.println(args[0]+"1000公里耗时：" + (1000/sd) + "小时");

	}

}
