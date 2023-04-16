package com.zh.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zh.reggie.entity.DishFlavor;
import com.zh.reggie.mapper.DishFlavorMapper;
import com.zh.reggie.service.DishFlavorService;
import com.zh.reggie.service.DishService;
import org.springframework.stereotype.Service;

/**
 * @author zh
 * @create 2023-04-13-12:51
 */
@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
