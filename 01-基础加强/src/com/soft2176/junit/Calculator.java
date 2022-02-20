package com.soft2176.junit;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/2/20 20:31
 */
public class Calculator {
    /**
     * 加法
     * @param a 整数
     * @param b 整数
     * @return 两数之和
     */
    public  int add(int a,int b){
        //故意的BUG
        return a-b;
    }

    /**
     * 减法
     * @param a 整数
     * @param b 整数
     * @return 两数之差
     */
    public  int sub(int a,int b){
        return a-b;
    }
}
