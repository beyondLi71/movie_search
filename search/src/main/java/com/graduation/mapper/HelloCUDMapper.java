package com.graduation.mapper;

import com.graduation.entity.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by beyondLi
 * Date 2018/4/1 4:31
 * Desc .
 */
public interface HelloCUDMapper {
    @Insert("INSERT INTO user (name) VALUES (#{name})")
    void addUser(UserInfo user);
}
