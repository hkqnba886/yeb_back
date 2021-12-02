package com.xxxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.server.pojo.Department;
import com.xxxx.server.pojo.RespBean;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hkq
 * @since 2021-09-30
 */
public interface IDepartmentService extends IService<Department> {

    List<Department> getAllDepartments(Integer id);

    RespBean addDep(Department dep);

    RespBean deleteDep(Integer id);

}
