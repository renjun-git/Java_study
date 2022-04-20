package thread;

import java.util.Random;

/**
 * @Author rj
 * @Date 2022/4/20 11:07
 * @Version 1.0
 */
public class Thread_Work01 {
    public static void main(String[] args) {

        /**
         *  题目：在main方法中启动两个线程
         *       第一个线程循环随机打印100以内的整数
         *       直到第二个线程从键盘上读取了Q命令
         */
         WorkC A=new WorkC();
         A.start();
         new WorkD(A).start();


    }
}
//用静态变量实现
class WorkA extends Thread{

    static boolean flag=true;
    @Override
    public void run() {
        while (flag) {
            System.out.println(new Random().nextInt());
        }
    }
}

class  WorkB extends  Thread{
    boolean flag=true;
    @Override
    public void run() {
        while (flag) {
            char ZM1 = (char) (Math.random() * 26 + 'A');
            System.out.println(ZM1);
            if ("Q".equals(String.valueOf(ZM1))) {
                WorkA.flag = false;
                flag=false;
            }
        }
    }
}

//用对象方式实现
class WorkC extends Thread{

    private boolean flag=true;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        while (flag) {
            System.out.println(new Random().nextInt());
        }
    }
}


class  WorkD extends  Thread{

    boolean flag=true;
    private WorkC C;

    public WorkD(WorkC c) {
        C = c;
    }


    @Override
    public void run() {
        while (flag) {
            char ZM1 = (char) (Math.random() * 26 + 'A');
            System.out.println(ZM1);
            if ("Q".equals(String.valueOf(ZM1))) {
                C.setFlag(false);
                flag=false;
            }
        }
    }
}

