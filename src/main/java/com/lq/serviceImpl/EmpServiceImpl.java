package com.lq.serviceImpl;

import com.lq.entity.Emp;
import com.lq.mapper.EmpMapper;
import com.lq.service.EmpService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * Created by Administrator on 2017/8/14.
 */
public class EmpServiceImpl implements EmpService{
    /**
     * log4j日志对象
     */
    private static final Logger log = Logger.getLogger(EmpServiceImpl.class);

    /**
     * 员工mapper
     */
    @Autowired
    private EmpMapper empMapper;

    /**
     * jdbcTemplate
     */
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 方法描述: 用jdbcTemplate循环插入员工信息，一方面测试jdbcTemplate，另一方面测试事务有效性
     * 初始作者: lq
     * 创建日期: 2017年8月16日-下午2:03:11
     * 开始版本: 1.0.0
     * =================================================
     * 修改记录：
     * 修改作者 日期 修改内容
     * ================================================
     *
     * @throws Exception
     *             异常对象
     */

    public int batchAddEmp() throws Exception {

        int r = 0;
        for (int i = 0; i < new Random().nextInt(5); i++) {
            // log.info("开始插入第" + (i + 1) + "条");
            Emp e = new Emp();
//            e.setId(UUIDUtils.get32UUID());
            e.setId(UUID.randomUUID().toString());
            e.setName("name" + i);
            e.setJob("job" + i);
            e.setHobbies("hobbies" + i);
            e.setGender(new Random().nextInt(1));
            e.setAge(new Random().nextInt(30));
            e.setBirthday(new Date());
            e.setHiredate(new Date());
            // if (i == 7) {
            // log.error("出错了，回滚！");
            // throw new Exception("出错了！");
            // }
            int rr = jdbcTemplate.update("insert into emp values(?,?,?,?,?,?,?,?)", new Object[] {
                    e.getId(),
                    e.getName(),
                    e.getAge(),
                    e.getGender(),
                    e.getBirthday(),
                    e.getHiredate(),
                    e.getJob(),
                    e.getHobbies()
            });
            if (rr == 1) {
                r++;
            }
            // log.info("第" + (i + 1) + "条插入成功");
        }
        return r;
    }

    /**
     * 方法描述: 通过id获取员工信息,有缓存
     * 初始作者: lq
     * 创建日期: 2017年8月16日-上午9:51:55
     * 开始版本: 1.0.0
     * =================================================
     * 修改记录：
     * 修改作者 日期 修改内容
     * ================================================
     */
    @Cacheable(value = "empCache", key = "#id+'~cache'", condition = "#id=='1406'")
    public Emp getEmpById(String id) {

        System.out.println("调用了getEmpById() 方法");
        return empMapper.selectEmpById(id);
    }
}
