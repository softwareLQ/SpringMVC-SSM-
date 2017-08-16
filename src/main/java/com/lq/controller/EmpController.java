package com.lq.controller;

import com.lq.entity.Emp;
import com.lq.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/8/16.
 */
@Controller
@RequestMapping("emp")
public class EmpController {

    @Resource
    private EmpService empService;

    /**
     * 方法描述: 批量添加员工信息
     * 初始作者: lq
     * 创建日期: 2017年8月16日-上午9:18:35
     * 开始版本: 1.0.0
     * =================================================
     * 修改记录：
     * 修改作者 日期 修改内容
     * ================================================
     *
     * @return int
     *         插入成功的记录数
     * @throws Exception
     *             异常
     */
    @RequestMapping("/addEmps")
    @ResponseBody
    public int addEmps() throws Exception {

        return empService.batchAddEmp();
    }

    /**
     * 方法描述: 通过id获取员工信息
     * 初始作者: lq
     * 创建日期: 2017年8月16日-上午9:18:35
     * 开始版本: 1.0.0
     * =================================================
     * 修改记录：
     * 修改作者 日期 修改内容
     * ================================================
     *
     * @param id
     *            员工id
     * @return
     *         Emp 员工实体
     */
    @RequestMapping("/getEmpById")
    @ResponseBody
    public Emp getEmpById(@RequestParam String id) {

        return empService.getEmpById(id);
    }
}
