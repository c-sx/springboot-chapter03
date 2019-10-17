package com.mpocket.springbootchapter03;

import com.mpocket.springbootchapter03.bean.User;
import com.mpocket.springbootchapter03.dao.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootChapter03ApplicationTests {
    @Autowired
    private UserRepository repository;

    @Test
    public void test() {
        User u = repository.findById(1L).get();
        Assert.assertEquals("成功的测试用例", "张三", u.getName());
    }

/*
    @Test
    public void contextLoads() {
    }
*/

}
