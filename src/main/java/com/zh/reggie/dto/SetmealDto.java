package com.zh.reggie.dto;


import com.zh.reggie.entity.Setmeal;
import com.zh.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
