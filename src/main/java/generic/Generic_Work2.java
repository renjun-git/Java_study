package generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author rj
 * @Date 2022/4/21 14:49
 * @Version 1.0
 */

/**\
 *Junit:一个类有很多功能需要测试，为了测试，就要把方法写到main中执行，如果功能很多，来回住校很麻烦，如果可以直接运行一个方法
 * 就方便很多>>junit出现
 */
public class Generic_Work2 {


    @Test
   public void test(){
        Dao<User> userDao = new Dao<>();

        userDao.save("1",new User(1,10,"a"));
        userDao.save("2",new User(2,12,"b"));
        List<User> print = userDao.print();
        System.out.println(print);

   }

}

class  Dao<T>{
    private HashMap<String,T> m =new HashMap<>();
     @Test
    public void save(String id,T t){
      m.put(id,t);
    }

    public T get (String id){
        return m.get(id);
    }
    public void  update(String id,T t){
        m.put(id,t);
    }

    public void delete(String id){
        m.remove(id);
    }

    public List<T> print(){
        ArrayList<T> ts = new ArrayList<>();
        for (String s : m.keySet()) {
            ts.add(m.get(s));
        }
        return  ts;
    }
}
class User{
    private  int id;
    private  int age;
    private  String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
