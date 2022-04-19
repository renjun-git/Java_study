package thread;

/**
 * @Author rj
 * @Date 2022/4/19 11:09
 * @Version 1.0
 */
public class Thead_Exit {
    public static void main(String[] args) throws InterruptedException {

        /**通知线程终止
         * 1、当线程完成任务时，会自动退出，
         * 2、我们可以通过控制tag的方式让run方法结束，从而停止线程，即通知方式
         *  interrupt:中断线程，如果线程正在休眠，那么会提前醒来
         *   通过修改tag的方式停止线程只限制于继承Thread的方式，runable不适用。
         *   join()线程插队，必须等插队的线程执行完才能释放资源
         *   守护线程：当所有用户线程结束后，守护线程也会自动结束，只需要把线程设置为setDaemon=true
         *
         */
        T t = new T();
        t.start();
        t.setDaemon(true);

        t.interrupt();
        Thread.sleep(10);
         t.setTag(false);
    }
}

class T extends  Thread{

    private  int a;
    private boolean tag=true;
    @Override
    public void run() {
            while (tag){
                System.out.println("线程运行中==="+ a++);
            }
    }

    public void setTag(boolean tag) {
        this.tag = tag;
    }
}
