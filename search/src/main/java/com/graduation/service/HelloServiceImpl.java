package com.graduation.service;

import com.graduation.entity.UserInfo;
import com.graduation.mapper.HelloCUDMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by beyondLi
 * Date 2019/3/8 15:48
 * Desc .
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Resource
    HelloCUDMapper helloCUDMapper;

    /**
     * 新增用户
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addInfo() {
        UserInfo user = new UserInfo();
        user.setName("beyondLi");
        helloCUDMapper.addUser(user);
    }
}
