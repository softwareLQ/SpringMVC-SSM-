package com.lq.controller;

import com.alibaba.fastjson.JSON;
import com.lq.model.VoModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javafx.scene.input.KeyCode.R;

/**
 * Created by Administrator on 2017/8/14.
 */
@Controller
@RequestMapping("test")
public class TestController {

    /**
     * 方法描述: 返回单个字符串
     * 初始作者: lq
     * 创建日期: 2017年8月16日-上午9:22:08
     * 开始版本: 1.0.0
     * =================================================
     * 修改记录：
     * 修改作者 日期 修改内容
     * ================================================
     *
     * @return
     *         String 返回的字符串
     */
    @RequestMapping("/m001")
    @ResponseBody
    public String getString() {

        return "hello,这只是一个字符串！";
    }
    /**
     * 方法描述: 返回map对象
     * 初始作者: lq
     * 创建日期: 2017年8月16日-上午9:21:37
     * 开始版本: 1.0.0
     * =================================================
     * 修改记录：
     * 修改作者 日期 修改内容
     * ================================================
     *
     * @return
     *         Map<String,String> 返回的map对象
     */
    @RequestMapping("/m002")
    @ResponseBody
    public Map<String, String> getJSON() {

        Map<String, String> data = new HashMap<String, String>();
        data.put("id", "001");
        data.put("name", "张三");
        return data;
    }
    /**
     * 方法描述: 访问restful接口并将参数作为结果返回
     * 初始作者: lq
     * 创建日期: 2017年8月16日-上午9:22:40
     * 开始版本: 1.0.0
     * =================================================
     * 修改记录：
     * 修改作者 日期 修改内容
     * ================================================
     *
     * @param clientType
     *            对应{clientType}
     * @param loginId
     *            对应{loginId}
     * @param userType
     *            对应{userType}
     * @return
     *         Map<String,String> 参数组装出的map对象
     */
    @RequestMapping("/{clientType}/{loginId}/{userType}/m003")
    @ResponseBody
    public Map<String, String> testRestful(@PathVariable String clientType, @PathVariable String loginId,
                                           @PathVariable String userType) {

        Map<String, String> data = new HashMap<String, String>();
        data.put("clientType", clientType);
        data.put("loginid", loginId);
        data.put("userType", userType);
        return data;
    }
    /**
     * 方法描述: 测试将model转为json传到前台</br>
     * 初始作者: lq
     * 创建日期: 2016年3月28日-下午10:12:47
     * 开始版本: 1.0.0
     * =================================================
     * 修改记录：
     * 修改作者 日期 修改内容
     * ================================================
     *
     * @param models
     *            传入model
     * @return
     *         Object json对象
     */
    @RequestMapping("/m005")
    @ResponseBody
    public Object testParamList(@RequestBody List<VoModel> models) {

        return JSON.toJSON(models);
    }

}
