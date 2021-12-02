package com.xxxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.server.pojo.Employee;
import com.xxxx.server.pojo.RespBean;
import com.xxxx.server.pojo.RespPageBean;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hkq
 * @since 2021-09-30
 */
public interface IEmployeeService extends IService<Employee> {

    RespPageBean getEmployeeByPage(Integer currentPage, Integer pageSize, Employee employee, LocalDate... beginDateScope);

    RespBean maxWorkId();

    RespBean addEmp(Employee employee);

    List<Employee> getEmployee(Integer id);
}
