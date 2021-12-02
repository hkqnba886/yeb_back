package com.xxxx.server.controller;


import com.xxxx.server.pojo.Department;
import com.xxxx.server.pojo.RespBean;
import com.xxxx.server.service.IDepartmentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hkq
 * @since 2021-09-30
 */
@RestController
@RequestMapping("/system/basic/department")
public class DepartmentController {
    @Autowired
    IDepartmentService iDepartmentService;

    @ApiOperation(value = "查询所有部门")
    @GetMapping("/")
    public List<Department> getAllDepartment() {
        return iDepartmentService.getAllDepartments(-1);
    }

    @ApiOperation(value = "添加部门")
    @PutMapping("/")
    public RespBean addDep(@RequestBody Department dep) {
        return iDepartmentService.addDep(dep);
    }

    @ApiOperation(value = "删除部门")
    @DeleteMapping("/{id}")
    public RespBean deleteDep(@PathVariable Integer id) {
        return iDepartmentService.deleteDep(id);
    }
}
