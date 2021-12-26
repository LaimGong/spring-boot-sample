package com.gong.sample.sharding.service;

import com.gong.sample.sharding.converter.ShardParser;
import com.gong.sample.sharding.dto.ShardDto;
import com.gong.sample.sharding.entity.Shard;
import com.gong.sample.sharding.manager.ShardManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;

@Slf4j
@Service
public class ShardService {

    @Resource
    private ShardManager shardManager;

    public String submitShard(@NotNull ShardDto shardDto) {
        Assert.notNull(shardDto, "parameters is null");
        Shard shard = ShardParser.INSTANCE.toEntity(shardDto);
        shardManager.saveShard(shard);
        return "200";
    }

    public ShardDto queryShard(Long id) {
        Assert.notNull(id, "parameter id is null");
        Shard shard = shardManager.queryShard(id);
        return ShardParser.INSTANCE.toDto(shard);
    }
}
