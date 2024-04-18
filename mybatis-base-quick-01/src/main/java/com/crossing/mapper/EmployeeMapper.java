package com.crossing.mapper;

import com.crossing.pojo.Employee;

/**
 * @program: SSM_mybatis
 * @description:
 * @author: ChenPei
 * @create: 2024-04-18 17:33
 **/

public interface EmployeeMapper {
    Employee queryById(Integer id);

    int deleteById(Integer id);
}
