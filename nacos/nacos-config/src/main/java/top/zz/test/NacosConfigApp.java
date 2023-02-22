package top.zz.test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;



@EnableDiscoveryClient
@SpringBootApplication 
public class NacosConfigApp {

    public static void main(String [] args) {
    	ConfigurableApplicationContext app = (ConfigurableApplicationContext) SpringApplication.run(NacosConfigApp.class, args);
    	//获取配置数据
    	System.out.println(app.getEnvironment().getProperty("app.testNacos"));
    	System.out.println(app.getEnvironment().getProperty("app.testNacosDev"));
    }
}
