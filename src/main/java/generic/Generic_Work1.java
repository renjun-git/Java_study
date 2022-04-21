package generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @Author rj
 * @Date 2022/4/21 11:00
 * @Version 1.0
 */

/**
 *题目:定义一个Employee类，有三个属性，name。sal.birthday 其中birthday为Mydate类型，MYdate包含三个属性。mouth。day，year，
 * 创建Em类的三个对象，并把这些对象放入list集合，对其中的元素进行排序，并遍历输出，
 * 排序方式；调用sort方法，传入comparator。先按照name排序，如果name相同，再按照生日。
 */
public class Generic_Work1 {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("A",10,new Mydate("12","1","2022")));
        employees.add(new Employee("B",11,new Mydate("12","2","2022")));
        employees.add(new Employee("C",12,new Mydate("12","3","2022")));
            //
//        employees.sort(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                if (o1.getName().equals(o2.getName())   ){
//                    return 0;
//                }
//
//            }
//        });
    }
}

class Employee{
    private String name;
    private double sal;
    private Mydate birthday;

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    public Mydate getBirthday() {
        return birthday;
    }

    public Employee(String name, double sal, Mydate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }


}
 class Mydate {
    private String month;
    private String day;
    private String year;

    public Mydate(String month, String day, String year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
