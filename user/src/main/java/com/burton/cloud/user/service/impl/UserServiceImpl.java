package com.burton.cloud.user.service.impl;

import com.burton.cloud.common.base.BaseServiceImpl;
import com.burton.cloud.common.domain.user.User;
import com.burton.cloud.user.repository.UserRepository;
import com.burton.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: 大瞳小沐
 * Date: 2019/3/20
 * Time: 23:12
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Autowired
    private UserRepository userRepository;


}
