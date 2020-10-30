/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: RestTemplateUserTestController
 * Author:   莉莉
 * Date:     2020/10/27 10:34
 * Description: 测试使用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.spring.cloud.servicebuy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 〈测试使用〉
 *
 * @author 莉莉
 * @create 2020/10/27
 * @since 1.0.0
 */
@RestController
public class RestTemplateUserTestController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    public RestTemplate restTemplate;
    @RequestMapping("/testHello")
    public String testHello(){
        return restTemplate.getForObject("http://service-order/Hello",String.class);
    }

}