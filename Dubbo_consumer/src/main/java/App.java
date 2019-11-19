import com.ProviderService;
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
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        ProviderService providerService = (ProviderService)context.getBean("demoService"); // 获取远程服务代理
        String hello = providerService.SayHello("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
    }
}
