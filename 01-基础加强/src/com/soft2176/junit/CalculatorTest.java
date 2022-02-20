package com.soft2176.junit;

import org.junit.Test;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/2/20 20:33
 */
public class CalculatorTest {
    public static void main(String[] args) {
        // 创建对象
        Calculator c = new Calculator();
        //调用add方法
        int result = c.add(3, 5);
        System.out.println(result);
        //调用sub方法
        int result2 = c.sub(1, 5);
        System.out.println(result2);
    }


}
