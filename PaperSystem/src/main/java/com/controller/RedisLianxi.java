package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;

public class RedisLianxi {

    @Autowired
    private RedisTemplate redisTemplate; //注入


    @RequestMapping("add")
    public String addStudent(){

        try{
            redisTemplate.opsForValue().set("test", "测试");
            System.out.println("value："+redisTemplate.opsForValue().get("chen"));
        }catch(Exception e){
            System.out.println("Redis-error");
        }

        return null;
    }

}
