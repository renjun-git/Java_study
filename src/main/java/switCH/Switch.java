package switCH;

import java.util.Scanner;

/**
 * @Author rj
 * @Date 2022/4/1 15:39
 * @Version 1.0
 */
public class Switch {
    /**
     * Switch语法
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        //增强switch
        switch (s) {
            case "a" -> System.out.println("1");
            case "b" -> System.out.println("2");
            case "c" -> System.out.println("3");
            default -> System.out.println("111");
        }


//        switch (s){
//            case "a":
//                System.out.println("1");
//                break;
//            case "b":
//                System.out.println("2");
//                break;
//            case "c":
//                System.out.println("3");
//                break;
//            default:
//                System.out.println("111");
//                break;
    }
}
