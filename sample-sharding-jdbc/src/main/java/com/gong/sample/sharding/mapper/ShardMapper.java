package com.gong.sample.sharding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gong.sample.sharding.entity.Shard;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShardMapper extends BaseMapper<Shard> {

}
