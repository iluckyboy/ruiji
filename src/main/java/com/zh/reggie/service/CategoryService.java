package com.zh.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zh.reggie.entity.Category;
import org.springframework.stereotype.Service;

/**
 * @author zh
 * @create 2023-04-12-13:07
 */

public interface CategoryService extends IService<Category> {
    public void remove(Long ids);
}
