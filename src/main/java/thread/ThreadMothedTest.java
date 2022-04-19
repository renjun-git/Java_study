package thread;

import jdk.swing.interop.SwingInterOpUtils;

/**
 * @Author rj
 * @Date 2022/4/19 13:35
 * @Version 1.0
 */
public class ThreadMothedTest {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i <10 ; i++) {
            System.out.println("hi");
            Thread.sleep(100);
            if (i==5){
                Test test = new Test();
                Thread thread = new Thread(test);
                thread.start();
                thread.join();
            }
        }
        }
    }


class Test implements  Runnable {

     static  int su = 0;


    private  static  boolean tag=true;
    public static void setTag(boolean tag) {
        Test.tag = tag;
    }
    @Override
    public void run() {
        while (tag) {
            System.out.println("hello" + ++su);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (su==10){
                Test.setTag(false);
            }
        }
    }
}
