package com;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/test")
//@RefreshScope
public class TestController{

//    @Value("${foo}")
//    private String foo;
//    
//    
//    @RequestMapping(value = "/test")
//    public String test(){
//    	System.out.println(foo);
//        return foo;
//    }
    

    
    
    @RequestMapping(value = "/test")
    public String test(){
    	
        return "foo zz";
    }
	

	



}
