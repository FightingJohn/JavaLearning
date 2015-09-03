package com.lyl.homework8;

//年龄高异常
public class AgeOldException extends Exception {

	public AgeOldException(){
		super("年龄太大");
	}
}
