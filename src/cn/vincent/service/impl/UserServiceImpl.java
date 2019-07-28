package cn.vincent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.vincent.dao.UserDao;
import cn.vincent.service.UserService;
import cn.vincent.vo.User;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	public void setUserDao(UserDao userDao){
		this.userDao=userDao;
	}
}
