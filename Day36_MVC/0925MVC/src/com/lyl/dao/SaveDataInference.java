package com.lyl.dao;

import com.lyl.bean.User;

public interface SaveDataInference {
	
	//���û����ݱ��浽ָ���ļ���
	public boolean saveData(User user);
	
	//�������ݿ���ߴ洢�ļ��У��Ƿ���username
	public boolean findUsername(String username);
	
	//�������ݿ���ߴ洢�ļ����Ƿ��з��ϵ�username����֮��Ӧpassword
	public boolean findUser(String username, String password);

}
