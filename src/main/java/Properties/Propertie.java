package Properties;

import java.io.*;
import java.util.Properties;

/**
 * @Author rj
 * @Date 2022/4/22 9:41
 * @Version 1.0
 */
public class Propertie {
    public static void main(String[] args) throws IOException {
        /**
         * 专门读写配置文件的集合类，配置文件的格式必须为：键=值，中间不能有空格
         */
        Properties propertie = new Properties();
        propertie.load(new FileInputStream("src/resources/pro.properties"));
        propertie.list(System.out);

        String user = propertie.getProperty("user");
        System.out.println(user);

    }
}
