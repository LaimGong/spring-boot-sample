package com.gong.sample.sharding.converter;

import com.gong.sample.sharding.dto.ShardDto;
import com.gong.sample.sharding.entity.Shard;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ShardParser extends BaseParser<ShardDto, Shard> {

    ShardParser INSTANCE = Mappers.getMapper(ShardParser.class);

}
