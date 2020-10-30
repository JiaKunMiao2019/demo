/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ConsumerController
 * Author:   莉莉
 * Date:     2020/10/27 13:48
 * Description: 测试restemplate
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.spring.coud.constumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 〈测试restemplate〉
 *
 * @author 莉莉
 * @create 2020/10/27
 * @since 1.0.0
 */
@RestController
@RequestMapping("/hello")
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/concumer")
    public String getConcumer(@RequestParam("name") String name){
        return restTemplate.getForObject("http://eureka-service/hello/world?name=" + name, String.class);
    }
}