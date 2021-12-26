package com.gong.sample.redis.repository;

import com.gong.sample.redis.domain.CacheData;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
@CacheConfig(cacheNames = "user")
public class CacheRepository {

    @Cacheable(key = "#code")
    public CacheData queryData(String code) {
        return CacheData.builder().code(code).build();
    }
}
