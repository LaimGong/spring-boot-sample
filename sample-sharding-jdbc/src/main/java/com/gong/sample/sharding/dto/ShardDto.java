package com.gong.sample.sharding.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShardDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String code;

    private Long userId;

    private Long orderId;

    private Date time;

}
