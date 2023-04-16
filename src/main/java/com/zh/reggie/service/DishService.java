package com.zh.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zh.reggie.dto.DishDto;
import com.zh.reggie.entity.Dish;

import java.util.List;

/**
 * @author zh
 * @create 2023-04-12-14:39
 */
public interface DishService extends IService<Dish> {
    public void saveWithFlavor(DishDto dishDto);

    public DishDto getByIdWithFlavor(Long id);

    public void updateWithFlavor(DishDto dishDto);

    public void removeWithFlavor(List<Long> ids);
}
