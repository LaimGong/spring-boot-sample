package com.gong.sample.sharding.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("t_shard")
public class Shard {

    private Long id;

    private String code;

    private Long userId;

    private Long orderId;

    private Date time;

}
