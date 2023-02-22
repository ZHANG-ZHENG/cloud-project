package top.zz.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;
	
    @RequestMapping(value = "/test")
    public String test() {
    	String message = restTemplate.getForObject("http://nacos-config/test", String.class);
    	System.out.println("client1 message:"+message);
		return "test2 " + "client1 message:"+message;
    }
	
}
