package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("hello")    // all methods routes begin with the same root path localhost:8080/hello
public class HelloController {
    // handle http request both get&post at path localhost:8080/hello

    // lives @path localhost:8080/hello
    @GetMapping
    @ResponseBody
    public String sayHello(){
        return "hello, Spring is working!";
    }

    // add a second route i.e. route to slash goodbye
    // lives @path localhost:8080/hello/goodbye
    @GetMapping("goodbye")
    @ResponseBody
    public String sayBye(){
        return "Bye, Spring!";
    }

    // handle controller method with parameter
    // lives @path localhost:8080/hello/query?name=Yeshi
    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, value="query")
    public String getParam(@RequestParam String name, Model model){     //model class used to pass data btw ctrl & view
        String greet = "Hello, " + name + "!";  //create a string variable
        //first-param: template-variable , second-param: local-variable (replace first arg with the second arg)
        model.addAttribute("greeting", greet);  //add string variable to the model object using addAttribute method
        return "hello"; //model is passed into the view by rendering the thymeleaf template i.e. query.html
    }

    // lives @path localhost:8080/hello/fname
    @GetMapping("{fname}")
    public String getQueryPath(@PathVariable String fname, Model model){
        String greet = "hello, " + fname + "!";
        model.addAttribute("greeting", "greet");
        return "hello";
    }

    // lives @ path localhost:8080/hello/form
    @GetMapping("form")
    public String helloForm(){
        return "form";
    }



}
