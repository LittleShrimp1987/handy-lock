package com.github.free.jungle.handy.lock.starter;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@AutoConfigureAfter({RedisAutoConfiguration.class})
@Import({
        RedisClientAutoConfiguration.class,
        RedisLockManagerAutoConfiguration.class,
        RedisLockAopAutoConfiguration.class
})
public class HandyLockAutoConfiguration {

}
