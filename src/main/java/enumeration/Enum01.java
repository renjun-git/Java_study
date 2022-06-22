package enumeration;

/**
 * @Author rj
 * @Date 2022/4/22 16:32
 * @Version 1.0
 */
public class Enum01 {
    /**
     * 使用关键字enum来实现枚举
     *  1、用enum代替class，这时候就成为枚举类
     *  2、直接使用常量名(“”，“”)的方法 初始化对象
     *  3、有多个常量，后面用，拼接
     *  4、常量定义写在类属性前面
     *  5、使用emum关键字时，会隐式继承Enum类，这样我们就可以使用Enum的方法。
     *  6、使用enum关键字后，不能在继承其他类
     *  7、
     */

    public static void main(String[] args) {

    }
}

enum Reason1 {

    SPRINT("春天","温暖"),Reason("夏天","温暖");
    private String name;
    private String deac;

    private Reason1(String name, String deac) {
        this.name = name;
        this.deac = deac;
    }

    public String getName() {
        return name;
    }

    public String getDeac() {
        return deac;
    }

}

