package 读取文件

import scala.io.Source

/**
 * @Author rj
 * @Date 2022/5/19 14:28
 * @Version 1.0
 */
object Io {
  def main(args: Array[String]): Unit = {
    Source.fromFile("").foreach(println)
  }
}
