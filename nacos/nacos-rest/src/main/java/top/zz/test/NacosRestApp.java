package top.zz.test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@EnableDiscoveryClient
@SpringBootApplication 
public class NacosRestApp {

    public static void main(String [] args) {
        SpringApplication.run(NacosRestApp.class, args);
    }
}
