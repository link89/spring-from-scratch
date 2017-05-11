package com.github.link89.domain;

import com.github.link89.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.util.Assert;

@Configurable
public class SimpleObject {

    @Autowired
    UserMapper userMapper;

    public void autowiredAssert() {
        Assert.notNull(userMapper);
    }
}
