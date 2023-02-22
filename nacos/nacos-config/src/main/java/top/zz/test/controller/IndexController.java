package top.zz.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class IndexController {
	
	@Value("${app.testNacos:unknow}")
    private String testNacos;
	
	@Value("${app.testLocal:unknow}")
	private String testLocal;

    @RequestMapping(value = "/test")
    public String test() {
		return "testNacos " + testNacos + ", testLocal " + testLocal;
    }
    
}
