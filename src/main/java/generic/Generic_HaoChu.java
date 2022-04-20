package generic;

import java.util.ArrayList;

/**
 * @Author rj
 * @Date 2022/4/20 15:29
 * @Version 1.0
 */
public class Generic_HaoChu {
    public static void main(String[] args) {
        /**
         * 编写程序，在ArrayList中，添加三个dog对象，
         * Dog对象含有name跟age，并输出name跟age（要求使用getxx（））
         */
        ArrayList<Dog> dogs = new ArrayList<>();//泛型
        dogs.add(new Dog("w",2));
        dogs.add(new Dog("q",3));
        dogs.add(new Dog("s",4));
        for (Dog dog : dogs) {
            dog.getAge();
            dog.getName();
        }


    }
}
class Dog{
    private String name;
    private  int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getName() {
        System.out.println( name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getAge() {
        System.out.println( age);
    }

    public void setAge(int age) {
        this.age = age;
    }
}
