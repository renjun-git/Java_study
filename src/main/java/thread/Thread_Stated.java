package thread;

/**
 * @Author rj
 * @Date 2022/4/19 14:57
 * @Version 1.0
 */
public class Thread_Stated {
    /**
     *  线程7个状态
     *  New：新建状态：我们可以通过实现Runnable接口或继承Thread声明一个线程类，new一个实例后，线程就进入了新建状态。
     * Ready：就绪状态：线程对象创建成功后，调用该线程的start()函数，线程进入就绪状态，该状态的线程进入可运行线程池中，等待获取C P U的使用权
     * Running：运行状态:此时线程调度程序正在从可运行线程池中选择一个线程，该线程进入运行状态。
     * Terminated：终止状态:线程继续运行，直到执行结束或执行过程中因异常意外终止都会使线程进入终止状态。线程一旦终止，就不能复生，这是不可逆的过程。
     * Waiting：等待状态:运行状态的线程执行wait()、join()、LockSupport.park()任意函数，该线程进入等待状态。其中wait()与join()函数会让J V M把该线程放入锁等待队列。
      处于这种状态的线程不会被分配C P U执行时间，它们要等待被主动唤醒，否则会一直处于等待状态。如果我们要唤醒线程怎么办呢？
      执行LockSupport.unpark(t)函数唤醒指定线程，该线程回到就绪状态。
      而通过notify()、notifyAll()、join线程执行完毕方式，会唤醒锁等待队列的线程，出队的线程回到就绪状态。
     * TimedWaiting：超时等待状态:超时等待与等待状态一样，唯一的区别就是多了超时机制，不会一直等待被其他线程主动唤醒，而是到达指定时间后会自动唤醒
     * Blocked：阻塞状态:运行状态的线程获取同步锁失败或发出I/O请求，该线程进入阻塞状态。如果是获取同步锁失败J V M还会把该线程放入锁的同步队列。
     *
     */
    public static void main(String[] args) throws InterruptedException {


        A a = new A();
        System.out.println(a.getState());
        a.start();
        while (Thread.State.TERMINATED!= a.getState()){
            System.out.println(a.getState());
            Thread.sleep(100);
        }
        System.out.println(a.getState());
    }
}

class A extends Thread{
    @Override
    public void run() {
        while (true){
            for (int i = 0; i < 10; i++) {
                System.out.println("state");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;



        }
    }
}
