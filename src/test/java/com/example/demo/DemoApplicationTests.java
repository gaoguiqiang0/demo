package com.example.demo;

import org.apache.commons.logging.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.apache.commons.logging.LogFactory;
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    private static final Log log = LogFactory.getLog(DemoApplicationTests.class);

    @Autowired
    private BlogProperties blogProperties;
    @Test
    public void contextLoads() {
    }
    @Test
    public void getHello() throws Exception {
        log.info("随机数测试输出：");

        log.info("随机字符串 : " + blogProperties.getValue());

        log.info("随机int : " + blogProperties.getNumber());

        log.info("随机long : " + blogProperties.getBignumber());

        log.info("随机10以下 : " + blogProperties.getTest1());

        log.info("随机10-20 : " + blogProperties.getTest2());


    }
}
