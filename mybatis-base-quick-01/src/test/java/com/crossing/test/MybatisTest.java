package com.crossing.test;

import com.crossing.mapper.EmployeeMapper;
import com.crossing.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: SSM_mybatis
 * @description:
 * @author: ChenPei
 * @create: 2024-04-18 17:50
 **/

public class MybatisTest {
    @Test
    public void test_01() throws IOException {
        String mybatisConfigFilePath = "mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(mybatisConfigFilePath);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Employee employee = employeeMapper.queryById(1);

        System.out.println("employee = " + employee);

        session.commit();
        session.close();

    }
}
