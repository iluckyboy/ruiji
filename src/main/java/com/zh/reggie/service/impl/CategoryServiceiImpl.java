package com.zh.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zh.reggie.common.CustomerExpection;
import com.zh.reggie.entity.Category;
import com.zh.reggie.entity.Dish;
import com.zh.reggie.entity.Setmeal;
import com.zh.reggie.mapper.CategoryMapper;
import com.zh.reggie.service.CategoryService;
import com.zh.reggie.service.DishService;
import com.zh.reggie.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zh
 * @create 2023-04-12-13:08
 */
@Service
public class CategoryServiceiImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    private DishService dishService;
    @Autowired
    private SetmealService setmealService;

    @Override
    public void remove(Long ids) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        dishLambdaQueryWrapper.eq(Dish::getCategoryId,ids);
        int count1 = dishService.count(dishLambdaQueryWrapper);
        if(count1 > 0){
            throw new CustomerExpection("当前分类下关联了菜品，不能删除");
        }
        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId,ids);
        int count2 = setmealService.count(setmealLambdaQueryWrapper);
        if(count2 > 0){
            throw new CustomerExpection("当前分类下关联了套餐，不能删除");
        }
        super.removeById(ids);
    }
}
