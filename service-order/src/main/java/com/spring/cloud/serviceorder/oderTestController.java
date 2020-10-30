/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: oderTestController
 * Author:   莉莉
 * Date:     2020/10/27 9:27
 * Description: 测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.spring.cloud.serviceorder;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈测试类〉
 *  注册中心和服务启动之后访问：http://127.0.0.1:8083/hello
 * @author 莉莉
 * @create 2020/10/27
 * @since 1.0.0
 */
@RestController
public class oderTestController {

    @RequestMapping("/hello")
    public String hello(){
        return "第一次试验成功";
    }
}