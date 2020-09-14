package com.fcd.juc.c2;

public class T04_synchronized_static {

    private static int count = 10;

    public synchronized static void m() { //这里等同于synchronized(T04_synchronized_static.class)
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }

    public static void mm() {
        synchronized(T04_synchronized_static.class) { //考虑一下这里写synchronized(this)是否可以？
            count --;
        }
    }

}
