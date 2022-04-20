package thread;

/**
 * @Author rj
 * @Date 2022/4/20 14:07
 * @Version 1.0
 */
public class Thread_Work02 {
    public static void main(String[] args) {
        /**
         *题目：2个用户分别从同一张卡里取钱（总额度10000），
         * 每次都取1000，当余额不足时，就不能取款了
         * 不能出现超取现象
         *
         */

        user USER_A = new user("USER_A");
        user USER_B = new user("USER_B");
        USER_A.start();
        USER_B.start();
    }


}

class user extends Thread {
    private final String name;
    private static int money = 10000;

    static Object O=new Object();
    public user(String name) {
        this.name = name;
    }

    private void getMoney(){




                synchronized (user.class){
                    while (true) {
                if (money <= 0){
                    break;
                }
                money=money - 1000;
                System.out.println("用户" + name +"取走了1000块钱" + "卡内还剩" + (money));

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }}



    }

    @Override
    public void run() {
        getMoney();
    }
}



