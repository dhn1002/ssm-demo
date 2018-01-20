package com.demo.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDao<T, ID extends Serializable> {
	void save(T arg0);

	void save(Map<String, Object> arg0);

	void saveBatch(List<T> arg0);

	int update(T arg0);

	int update(Map<String, Object> arg0);

	int deleteByPrimaryKey(ID arg0);

	int delete(Map<String, Object> arg0);

	int deleteBatch(ID[] arg0);

	T queryObject(ID arg0);

	List<T> queryList(Map<String, Object> arg0);

	List<T> queryList(ID arg0);

	int queryTotal(Map<String, Object> arg0);

	int queryTotal();
}