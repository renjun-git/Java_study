package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author rj
 * @Date 2022/4/20 15:53
 * @Version 1.0
 */
public class Generic_ZuoYong {
    public static void main(String[] args) {
        /**
         *可以通过类声明时通过一个标识表示类中某个属性的类型，或者是某个方法的返回值类型，或者是参数类型
         * 泛型的类型必须时引用类型，不能是基本类型
         * 泛型可以接受该类或者该类的子类
         *泛型不支持继承
         *
         *  print(List<?> c){}-- 支持所有类型
         *  print1(List<? extends AA> c){}支持AA及AA的子类
         *  print3(List<? super BB> c){}支持BB及BB 的父类
         *
         */

        Object s = new String("s");//string是object的子类，没问题；
        //Person<Object> stringPerson1 = new Person<String>();//报错，泛型不支持继承


        Person<String> stringPerson = new Person<>();
        stringPerson.s="s";
        stringPerson.study("s");
        List<Object> objects = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<AA> aas = new ArrayList<>();
        List<BB> bbs = new ArrayList<>();
        List<CC> ccs = new ArrayList<>();

        print(objects);
        print(strings);
        print(aas);
        print(bbs);
        print(ccs);

//        print1(objects);
//        print1(strings);
        print1(aas);
        print1(bbs);
        print1(ccs);

        print3(objects);
//        print3(strings);
        print3(aas);
        print3(bbs);
//        print3(ccs);



        //ArrayList<int> ints = new ArrayList<int>();//错误，基本类型
    }

    public   static void print(List<?> c){}

    public static void print1(List<? extends AA> c){}

    public static void print3(List<? super BB> c){}




}
/**
 * 泛型类，泛型接口：有泛型的类或者接口
 * 使用泛型的数组不能new的时候初始化，因为还不确定什么类型，需要开辟多大空间
 * 静态方法中不能使用类的泛型，因为静态方法在类的加载的时候加载，这时候不知道泛型的类型
 */

class Person<E>{
    E s;//通过类声明时在确定属性的类型
    public   E study(E state){
        return s;
    };
    /**
     * 下面泛型方法，在方法前面定义了一个泛型，而上面的study是方法使用了泛型，
     */
   public <T> void c(T t,E e){}
}


class  AA{}

class BB extends AA{}

class CC extends BB{}

