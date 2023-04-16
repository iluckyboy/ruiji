package com.zh.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zh.reggie.dto.DishDto;
import com.zh.reggie.dto.SetmealDto;
import com.zh.reggie.entity.Setmeal;

import java.util.List;

/**
 * @author zh
 * @create 2023-04-12-14:41
 */
public interface SetmealService extends IService<Setmeal> {
    public void saveWithDish(SetmealDto setmealDto);

    public SetmealDto getByIdWithDish(Long id);

    public void updateWithDish(SetmealDto setmealDto);

    public void removeWithDish(List<Long> ids);
}
