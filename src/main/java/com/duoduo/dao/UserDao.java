package com.duoduo.dao;

import com.duoduo.dao.entity.User;
import com.duoduo.dao.entity.UserExample;
import com.duoduo.datasource.DataSource;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);
    @DataSource("write")
    List<User> selectByExample(UserExample example);
    @DataSource("read")
    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}