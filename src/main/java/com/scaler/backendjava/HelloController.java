package com.scaler.backendjava;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello ,i am Rohith";

    }
    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    public String sayHello(@PathVariable("id") String id) {
        return "Hello ,i am" + id ;

    }
}


//RestController to tell java that there are some apis in the code
//RequestMapping to make method an api
//Requestmethod.get read
//pathvariable to assign value to the variable
// from fontend if you get some value to assign it to a variable