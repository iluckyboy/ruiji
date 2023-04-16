package com.zh.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zh.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zh
 * @create 2023-04-16-10:46
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
