package com.bootdo.system.service;

import org.springframework.stereotype.Service;

import com.bootdo.system.domain.UserDO;

@Service
public interface UserService {

    UserDO qurryUserByNo(String userno);

}
