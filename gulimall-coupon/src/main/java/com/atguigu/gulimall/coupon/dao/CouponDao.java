package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author christ
 * @email sunlightcs@gmail.com
 * @date 2023-10-04 21:11:19
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
