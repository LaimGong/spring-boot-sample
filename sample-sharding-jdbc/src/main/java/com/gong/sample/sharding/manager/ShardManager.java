package com.gong.sample.sharding.manager;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gong.sample.sharding.dto.ShardDto;
import com.gong.sample.sharding.entity.Shard;
import com.gong.sample.sharding.mapper.ShardMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ShardManager {

    @Resource
    private ShardMapper shardMapper;

    public Integer saveShard(Shard shard) {
        return shardMapper.insert(shard);
    }

    public Shard queryShard(Long id) {
        return shardMapper.selectById(id);
    }

    public Page<Shard> queryShardPage(ShardDto qry) {
        Page<Shard> page = new Page<>();
        QueryWrapper qw = new QueryWrapper();
        qw.like("code", qry.getCode() + "%");
        return shardMapper.selectPage(page, qw);
    }
}
