package 字符串拼接

/**
 * @Author rj
 * @Date 2022/5/19 14:07
 * @Version 1.0
 */
object String_pingjie {
  /**
   *  字符串拼接：
   *  1、+
   *  2、(s"${i}${t}")
   *  三引号保持多行字符串一行显示
   *  s”“” “”“
   */
  def main(args: Array[String]): Unit = {
    var i = "sdfds"
    var t = s"sdf${i}"
    println(s"${i}${t}")
    val sql=s"""
       |select *
       |from
       |a
       |where a>${i}
       |""".stripMargin
    println(sql)


   val s= new Array[Int](3)


  }
}
