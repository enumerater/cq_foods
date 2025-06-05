package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.dto.PasswordEditDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     *
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 修改密码
     *
     * @param passwordEditDTO
     * @return
     */
    String repassword(PasswordEditDTO passwordEditDTO);


    /**
     * 添加员工
     *
     * @param employeeDTO
     */
    void addEmployee(EmployeeDTO employeeDTO);


    PageResult pagerank(EmployeePageQueryDTO employeePageQueryDTO);
}
