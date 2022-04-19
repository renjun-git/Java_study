package thread;

import java.util.concurrent.Executor;

/**
 * @Author rj
 * @Date 2022/4/19 10:25
 * @Version 1.0
 */
public class Thread_Sale_Tickets {
    public static void main(String[] args) {

        /**
         *  多线程售票问题：
         *
         *  会存在售出负数票，
         *  原因：当三个线程同时进入循环，票数只剩1张时，线程1卖出一张，剩余0，线程1还没来得及把票数减一，此时线程2已经进入了循环，又卖出一张，此时票数为
         *  负一，线程3同理，就会出现票数为负。
         *
         *  使用互斥锁解决
         */

        SaleTiceket01 saleTiceket01 = new SaleTiceket01();
        saleTiceket01.start();
        SaleTiceket01 saleTiceket011 = new SaleTiceket01();
        saleTiceket011.start();


    }
}

class SaleTiceket01 extends Thread{

      static Object O=new Object();

    private  static int  tickets=100;
    public    void m1(){

        while (true) {

            synchronized (O) {

                if (tickets <= 0) {
                    System.out.println(Thread.currentThread().getName() + "票数不足，结束售票");
                    break;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "售出一张票" + "剩余票数" + --tickets);
            }

        }
    }
    
    @Override
    public void run() {
  m1();
    }
}
