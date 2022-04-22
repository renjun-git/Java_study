package enumeration;

/**
 * @Author rj
 * @Date 2022/4/22 15:19
 * @Version 1.0
 */
public class Enum {
    /**
     * 枚举是一组常量的集合，枚举属于一种特殊的类，只包含一组有限的特定的对象
     * 两种实现方式：自定义类实现枚举
     */

    public static void main(String[] args) {
        System.out.println(Reason.AUTUMN);
        System.out.println(Reason.SPRING);

    }
}

class Reason {
    private String name;
    private String deac;


    /**
     * 1、将构造器私有化，防止直接被new
     * 2、去除set方法，只能被读
     * 3、在Reason内部，直接创建静态对象
     * 4、优化。加入finnal
     */
    public static final Reason SPRING=new Reason("春天","温暖");
    public static final Reason SUMMER=new Reason("夏天","温暖");
    public static final Reason AUTUMN=new Reason("秋天","温暖");
    public static final Reason WINTER=new Reason("冬天","温暖");
    private Reason(String name, String deac) {
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
