package com.example.test.mainUtils;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName TestJunit
 * @Author houyuanbo
 * @Date 2021/9/29 10:43
 * @Description TODO 开启单元测试
 * @Version
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestJunit {
    @Autowired
    StringRedisTemplate redisTemplate;

    @org.junit.Test
    public void getLearn(){
        redisTemplate.opsForValue().set("111","333");
        System.out.println("我是单元测试，---------------------");
    }
}
