package com.gong.sample.redis.service;

import com.gong.sample.redis.domain.CacheData;
import com.gong.sample.redis.repository.CacheRepository;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class CacheService {

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private CacheRepository cacheRepository;

    public String set(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
        return String.class.cast(redisTemplate.opsForValue().get(key));
    }

    public CacheData queryCacheData(String code) {
        return cacheRepository.queryData(code);
    }

}
