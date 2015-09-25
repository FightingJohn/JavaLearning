package com.lyl.dao;

import com.lyl.bean.User;

public interface SaveDataInference {
	
	//把用户数据保存到指定文件中
	public boolean saveData(User user);
	
	//查找数据库或者存储文件中，是否含有username
	public boolean findUsername(String username);
	
	//查找数据库或者存储文件中是否有符合的username和与之对应password
	public boolean findUser(String username, String password);

}
