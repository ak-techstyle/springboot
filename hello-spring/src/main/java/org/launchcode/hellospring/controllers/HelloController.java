package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@ResponseBody       // this applied to all methods in the class
@RequestMapping("hello")    // all methods routes begin with the same root path localhost:8080/hello
public class HelloController {
    // handle http request both get&post at path localhost:8080/hello

    // lives @path localhost:8080/hello
    @GetMapping
    public String sayHello(){
        return "hello, Spring is working!";
    }

    // add a second route i.e. route to slash goodbye
    // lives @path localhost:8080/hello/goodbye
    @GetMapping("goodbye")
    public String sayBye(){
        return "Bye, Spring!";
    }

    // handle controller method with parameter
    // lives @path localhost:8080/hello/query-str?fname=Yeshi
    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, value="query-str")
    public String getParam(@RequestParam String fname){
        return "hello " + fname + "!";
    }

    // lives @path localhost:8080/hello/fname
    @GetMapping("{fname}")
    public String getQueryPath(@PathVariable String fname){
        return "hello " + fname + "!";
    }

    // lives @ path localhost:8080/hello/form
    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='query-str' method='post'>" + // form submit action requests to /hello/query-str handler method
                // input tag with a friend attribute
                "<input type='text' name='fname'>" +    // fname as input passing to http handler or controller method /hello/query-str
                "<input type='submit' value='Submit'>" +    // submit button
                "</form>" +
                "</body>" +
                "</html>";
    }



}
