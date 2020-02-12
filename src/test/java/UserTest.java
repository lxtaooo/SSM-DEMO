import com.lixiaotao.pojo.User;
import com.lixiaotao.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void test(){

        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userServiceImpl = classPathXmlApplicationContext.getBean("UserServiceImpl", UserService.class);

        for (User user : userServiceImpl.selectUser()) {
            System.out.println(user);
        }
    }
}
