package com.fcd.juc.c2;

public class T03_synchronized_method {

    private int count = 10;

    public synchronized void m() {//等同于在方法的代码执行时synchronized(this)
            count--;
            System.out.println(Thread.currentThread().getName() + " count = " + count);
    }
}
