package com.spring.kangsRamen.service;

import com.spring.kangsRamen.model.dto.UserDto;
import com.spring.kangsRamen.model.json.SignInVo;
import com.spring.kangsRamen.model.json.SignUpVo;
import com.spring.kangsRamen.model.json.UpdateUserVo;

public interface UserService {

	public int signUpPhoneCheck(String signUpPhone);
	public int signUpEmailCheck(String signUpEmail);
	public int signUpInsert(SignUpVo signUpVo);
	public int signIn(SignInVo signInVo);
	public UserDto getUser(String signInEmail);
	public int updateUser(UpdateUserVo updateUserVo);
	public int withdraw(int id);
}
