package IO;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Author rj
 * @Date 2022/4/21 16:02
 * @Version 1.0
 */
public class CreatefFile {
    /**
     * 在磁盘上创建文件的几种方式
     * 1、new File(String pathname)
     * 2、File(File parent, String child)
     * 3、File(String parent, String child)
     * 对文件操作，先创建file对象，然后用对应的方法
     */
    @Test
    public  void fileCreate() throws IOException {
        File file = new File(new String("C:/renjun/t2.txt"));
        boolean newFile = file.createNewFile();
    }

    @Test
    public  void fileCreate1() throws IOException {
        File file = new File(new File("C:/renjun"),"q.txt");
        boolean newFile = file.createNewFile();
    }

    @Test
    public  void fileCreate2() throws IOException {
        File file = new File(new String("C:/renjun"),"f.txt");
        boolean newFile = file.createNewFile();
    }

}
