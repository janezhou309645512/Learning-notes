package com.bootdo.system.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bootdo.system.dao.UserDao;
import com.bootdo.system.domain.UserDO;
import com.bootdo.system.service.UserService;

//@CacheConfig(cacheNames = "user")
@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userMapper;
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);


    @Override
    public UserDO qurryUserByNo(String userno) {
        // TODO Auto-generated method stub
        return userMapper.getUserByNo(userno);
    }

}
