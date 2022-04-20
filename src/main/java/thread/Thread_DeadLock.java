package thread;

/**
 * @Author rj
 * @Date 2022/4/20 10:43
 * @Version 1.0
 */
public class Thread_DeadLock {
    public static void main(String[] args) {


        d d = new d(true);
        thread.d d1 = new d(false);
        d.start();
        d1.start();
    }
}


class d extends  Thread{
   static Object c=new Object();
   static Object o=new Object();
    Boolean flag;


    public d(Boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag){
        synchronized (o){
            System.out.println("c");

        synchronized (c){
            System.out.println("cc");
        }}
    }else{
            synchronized (c){
                System.out.println("c");

            synchronized (o){
                System.out.println("cc");
            }

        }}



    }
}
