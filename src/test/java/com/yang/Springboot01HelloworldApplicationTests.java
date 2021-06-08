package com.yang;

import com.yang.pojo.Cat;
import com.yang.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01HelloworldApplicationTests {

    //yaml 属性注入
    @Autowired
    Cat cat;

    @Test
    void contextLoadsCat() {
        System.out.println(cat);
    }

    @Autowired
    Person person;

    @Test
    void contextLoadsPerson() {
        System.out.println(person);
    }

}
