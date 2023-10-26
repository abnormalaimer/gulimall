package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author christ
 * @email sunlightcs@gmail.com
 * @date 2023-10-04 16:59:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
