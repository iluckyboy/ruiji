package com.zh.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zh.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zh
 * @create 2023-04-10-16:20
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
