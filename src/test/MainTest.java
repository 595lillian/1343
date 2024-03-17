import com.hbnu.dao.AccountDao;
import com.hbnu.dao.ComplexDao;
import com.hbnu.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        // 1.创建容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2 获取bean
        AccountDao accountDao = context.getBean("accountDao5",AccountDao.class);

        // 构造器注入
//        UserDao userDao = context.getBean("userDao3",UserDao.class);

        // setter注入
        UserDao userDao = context.getBean("userDao3",UserDao.class);
        System.out.println(userDao.getName());
        System.out.println(userDao.getAddress());
        System.out.println(userDao.getId());
        System.out.println(userDao.getAccountDao());


        // 复杂类型注入
        ComplexDao complexDao = context.getBean("complexDao",ComplexDao.class);
        System.out.println(complexDao.getMap());
    }
}
