package com.lth;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;


@SpringBootTest // 单元测试前会先启动SpringBoot，初始化Spring容器， 以便能够使用Spring容器中的Bean
public class RedisTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testSet() {

        ValueOperations<String,String> operations = stringRedisTemplate.opsForValue();

        operations.set("name", "lth");

    }

    @Test
    public void testGet() {

        ValueOperations<String,String> operations = stringRedisTemplate.opsForValue();

        String name = operations.get("name");

        System.out.println(name);

    }

}
