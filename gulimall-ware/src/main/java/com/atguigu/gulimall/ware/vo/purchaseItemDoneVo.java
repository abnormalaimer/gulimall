package com.atguigu.gulimall.ware.vo;

import lombok.Data;

@Data
public class purchaseItemDoneVo {
    private Long itemId;
    private Integer status;

    private String reason;
}
