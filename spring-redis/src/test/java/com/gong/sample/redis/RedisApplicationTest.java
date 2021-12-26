package com.gong.sample.redis;

import com.gong.sample.redis.domain.CacheData;
import com.gong.sample.redis.service.CacheService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTest {

    @Resource
    private CacheService cacheService;

    @Test
    public void testCache() {
        CacheData cacheData = cacheService.queryCacheData("test");
        log.info("CacheData", cacheData);
    }
}
