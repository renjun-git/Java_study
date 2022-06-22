package 半生类跟半生对象

import 半生类跟半生对象.Student.school

/**
 * @Author rj
 * @Date 2022/5/19 11:49
 * @Version 1.0
 */
object Student {
  /**
   * Object :声明一个单例对象(伴生对象)，相当于java的static
   *定义方法模板：
   *def 方法名(参数名称：参数类型[泛型])：返回值 ={方法体}
   */
  val school: String ="s"
  def main(args: Array[String]): Unit = {
    val Alice =new Student("s",2)
    val blice =new Student("b",2)
    blice.name
    Alice.printerInfo()
    blice.printerInfo()
  }

}
/**
 * 现在我们要求helloworld的所有对象有一个共同的属性school，java中在class中定义一个static就行，但是sclaa
 * 中没有static的概念，引入了伴生对象，object关键字。在伴生对象中定义school就可以所有class的对象共享这个属性；
 * school可以直接用类名.出来，如果在class中声明，则不能直接.出来，说明不属于类的属性。只是一个变量
 */
class Student(var name:String,age:Int){
  def printerInfo(): Unit ={
    println(name,age,school)
  }
}
