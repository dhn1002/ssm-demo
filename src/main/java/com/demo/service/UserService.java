package com.demo.service;

import com.demo.entity.UserEntity;
import java.util.List;
import java.util.Map;

public interface UserService
{
  public UserEntity queryObject(Integer paramInteger);

  public List<UserEntity> queryList(Map<String, Object> paramMap);

  public int queryTotal(Map<String, Object> paramMap);

  public void save(UserEntity paramUserEntity);

  public void update(UserEntity paramUserEntity);

  public void delete(Integer paramInteger);

  public void deleteBatch(Integer[] paramArrayOfInteger);
}