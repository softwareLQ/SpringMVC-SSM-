package com.lq.mapper;

import com.lq.entity.Emp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/14.
 */
public interface  EmpMapper {

    /**
     * 方法描述: 通过id获取员工信息
     * 初始作者: lq
     * 创建日期: 2016年3月17日-下午1:45:04
     * 开始版本: 1.0.0
     * =================================================
     * 修改记录：
     * 修改作者 日期 修改内容
     * ================================================
     *
     * @param id
     *            主键
     * @return
     *         Emp 员工实体
     */
    Emp selectEmpById(@Param("id") String id);
}
