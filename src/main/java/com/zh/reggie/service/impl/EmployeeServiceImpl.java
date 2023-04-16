package com.zh.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zh.reggie.entity.Employee;
import com.zh.reggie.mapper.EmployeeMapper;
import com.zh.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author zh
 * @create 2023-04-10-16:29
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
