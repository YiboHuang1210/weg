package com.hyb.weg.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by HuangYibo on 2018/4/11.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations ="classpath*:spring*.xml")
public class HttpClientTest {

    @Test
    public void testGetUrl() {
        String str = HttpClientUtil.sendHttpGet("http://www.baidu.com");
        System.out.println(str);
    }

}
