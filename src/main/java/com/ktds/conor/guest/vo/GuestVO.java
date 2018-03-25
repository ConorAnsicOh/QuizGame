package com.ktds.conor.guest.vo;

import javax.validation.constraints.NotEmpty;

public class GuestVO {

	
	public int id;
	
	@NotEmpty(message="아이디를 입력해주세요.")
	public String userId;
	
	@NotEmpty(message="패스워드를 입력해주세요.")
	public String password;
	
	public String email;
	
	@NotEmpty(message="닉네임을 입력해주세요.")
	public String nickname;

	public String registDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getRegistDate() {
		return registDate;
	}

	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}

}
