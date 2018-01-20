package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.entity.UserEntity;
import com.demo.service.UserService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public UserEntity queryObject(Integer id) {
		return (UserEntity) this.userDao.queryObject(id);
	}

	public List<UserEntity> queryList(Map<String, Object> map) {
		return this.userDao.queryList(map);
	}

	public int queryTotal(Map<String, Object> map) {
		return this.userDao.queryTotal(map);
	}

	public void save(UserEntity user) {
		this.userDao.save(user);
	}

	public void update(UserEntity user) {
		this.userDao.update(user);
	}

	public void delete(Integer id) {
		this.userDao.deleteByPrimaryKey(id);
	}

	public void deleteBatch(Integer[] ids) {
		this.userDao.deleteBatch(ids);
	}
}
