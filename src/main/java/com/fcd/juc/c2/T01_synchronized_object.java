package com.fcd.juc.c2;

/**
 * synchronized关键字
 * 对某个对象加锁
 * @author fcd
 */
public class T01_synchronized_object {
    private int count = 10;
    private Object o = new Object();

    public void m() {
        synchronized(o) { //任何线程要执行下面的代码，必须先拿到o的锁
            count--;
            System.out.println(Thread.currentThread().getName() + " count = " + count);
        }
    }
}
