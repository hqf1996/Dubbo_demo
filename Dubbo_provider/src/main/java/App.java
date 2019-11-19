import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author: hqf
 * @description:
 * @Data: Create in 19:54 2019/11/19
 * @Modified By:
 */
public class App {
    public static void main(String[] args) throws IOException {
        //加载xml配置文件启动
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provide.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }
}
