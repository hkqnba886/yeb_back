package com.xxxx.server.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxxx.server.mapper.EmployeeMapper;
import com.xxxx.server.mapper.SalaryMapper;
import com.xxxx.server.pojo.Employee;
import com.xxxx.server.pojo.RespPageBean;
import com.xxxx.server.pojo.Salary;
import com.xxxx.server.service.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hkq
 * @since 2021-09-30
 */
@Service
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, Salary> implements ISalaryService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public RespPageBean getEmployeeWithSalary(Integer currentPage, Integer pageSize) {
        Page<Employee> page = new Page<>();
        IPage<Employee> employeeIPage = employeeMapper.getEmployeeWithSalary(page);
        return new RespPageBean(employeeIPage.getTotal(), employeeIPage.getRecords());
    }
}
