package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author christ
 * @email sunlightcs@gmail.com
 * @date 2023-10-04 21:40:27
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
