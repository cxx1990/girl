package com.cxx.service;

import com.cxx.domain.Girl;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by chenxiangxiang on 2017/3/15.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest extends TestCase {
    @Autowired
    GirlService girlService;

    @Test
    public void testGetFoundOne() throws Exception {
            Girl girl= girlService.getFoundOne(3);
            Assert.assertEquals(new Integer(11), girl.getAge());

    }
}