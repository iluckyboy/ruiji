package com.zh.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zh.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zh
 * @create 2023-04-12-14:37
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
