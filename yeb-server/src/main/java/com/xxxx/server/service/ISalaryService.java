package com.xxxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.server.pojo.RespPageBean;
import com.xxxx.server.pojo.Salary;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hkq
 * @since 2021-09-30
 */
public interface ISalaryService extends IService<Salary> {
    RespPageBean getEmployeeWithSalary(Integer currentPage, Integer pageSize);
}
