package com.dream.demo2;

/**
 * @author jiangll01
 * @Date: 2020/6/16 14:50
 * @Description:
 */
public class Mythread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("开始打印资料吧");
    }
}
