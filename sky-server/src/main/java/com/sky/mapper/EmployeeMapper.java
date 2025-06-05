package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     *
     * @param username
     * @return
     */
    Employee getByUsername(String username);

    /**
     * 根据员工id查询员工
     *
     * @param id
     * @return
     */
    Employee getById(Integer id);


    /**
     * 更新员工密码
     *
     * @param username,password
     * @return
     */
    int updatePassword(String username, String password);

    void insertEmployee(Employee employee);

    /**
     * 分页查询员工
     *
     * @param name
     * @return
     */
    Page<Employee> list(String name);
}
