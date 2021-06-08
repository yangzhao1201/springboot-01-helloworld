package com.yang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author TangYuan
 * @create 2021--06--05--18:40
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Cat {
    @Value("汤圆")
    private String name;
    @Value("2")
    private int age;
}
