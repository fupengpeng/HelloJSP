package com.jiudianlianxian.entity;

import java.io.Serializable;


/**
 * 
 * Title: User
 * Description: ������һ������
 * Company: �����ŵ�������Ϣ�������޹�˾
 * ProjectName: HelloJSP
 * @author fupengpeng
 * @date 2017��8��11�� ����10:36:42
 *
 */
public class User implements Serializable {

	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
