package com.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.demo.entity.UserEntity;

/**
 * 
 * 
 * @author 
 * @email 
 * @date 2017-11-23 15:09:07
 */
@Mapper
public interface UserDao extends BaseDao<UserEntity,Integer> {
	
}
