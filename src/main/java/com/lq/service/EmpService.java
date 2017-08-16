package com.lq.service;

import com.lq.entity.Emp;

/**
 * Created by Administrator on 2017/8/14.
 */
public interface EmpService {


    /**
     * 方法描述: 批量添加员工信息，用jdbc，另一方面为了测试事务的有效性
     * 初始作者: lq
     * 创建日期: 2017年8月16日-上午9:49:09
     * 开始版本: 1.0.0
     * =================================================
     * 修改记录：
     * 修改作者 日期 修改内容
     * ================================================
     *
     * @return int
     *         插入成功的数量
     * @throws Exception
     *             异常
     */
    int batchAddEmp() throws Exception;

    /**
     * 方法描述: 通过id获取员工信息
     * 初始作者: lq
     * 创建日期: 2017年8月16日-上午9:49:55
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
    Emp getEmpById(String id);
}
