/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: demoTestController
 * Author:   莉莉
 * Date:     2020/10/27 11:17
 * Description: 测试入参
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.spring.cloud.servicerule;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈测试入参〉
 *
 * @author 莉莉
 * @create 2020/10/27
 * @since 1.0.0
 */
@RestController
@RequestMapping("/hello")
public class demoTestController {

    @GetMapping("/world")
    public String helloWorld(@RequestParam("name")String name){
        return "录入的名称为："+name;
    }
}