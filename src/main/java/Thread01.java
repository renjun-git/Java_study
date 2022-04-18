/**
 * @Author rj
 * @Date 2022/4/18 16:08
 * @Version 1.0
 */
public class Thread01 {
    /**
     * 进程：启动一个应用程序就是启动一个进程
     * 线程：一个进程可以包含多个线程
     * 并发：同一时刻，多个任务交替执行
     * 并行：同一时刻，多个任务同时执行
     * 创建线程的方式：
     * 1、如果一个类已经继承了其他类，java又是单继承的，那么可以实现runable接口，重写run方法,然后new  Thread(),把实现了runable的类的对象传入，调用start方法，如果直接调用run方法，跟调用
     * 普通方法没有区别，程序会直接堵塞，等待该方法执行结束，这里使用了静态代理的方式调用了start方法
     * 2、通过集成Thread类，重写run方法，实现多线程
     * 多线程机制：当应用程序启动时，会出现两个线程，一个main线程，一个cat线程，两个线程交替执行，只有当两个线程全部结束，进程才会结束
     */
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.start();
        System.out.println(Thread.currentThread().getName());
        //runable方式
        Thread thread = new Thread(new Dog());
        thread.start();

    }


}
class Cat extends  Thread{
    @Override
    public void run() {
        int x=0;

        while(true){
        System.out.println("555"+Thread.currentThread().getName());
        x++;
        if (x>10){
            break;
        }
    }}
}

class  Dog implements  Runnable{
    @Override
    public void run() {
        System.out.println("444");
    }
}