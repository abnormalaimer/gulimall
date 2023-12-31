package com.atguigu.gulimall.member.service;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.MemberStatisticsInfoEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author christ
 * @email sunlightcs@gmail.com
 * @date 2023-10-04 21:28:56
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

