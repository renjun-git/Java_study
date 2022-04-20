package if_else;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * @Author rj
 * @Date 2022/4/1 14:44
 * @Version 1.0
 */
public class If_Else {
/**
 * if_else 语法案例
 *
 * if(){
 *
 * }
 * elseif(){
 *
 * }
 * elseif(){
 *
 * }
 * else{
 *
 * }
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();
    if (age>18){
        System.out.println("你已经"+age+"了");
    }else if(age == 10){
        System.out.println("====");
    }
    else {
        System.out.println("你太小啦");
    }


    /**
     * 练习
     *
     * &&就是and  ||就是or
     */
    double x=20;
    double y=40;
    if (x>10 && y<50){
        System.out.println(x+y);

    }
}
}
