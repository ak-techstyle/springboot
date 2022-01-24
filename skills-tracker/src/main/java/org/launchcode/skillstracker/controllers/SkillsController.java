package org.launchcode.skillstracker.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping
public class SkillsController {

    @GetMapping
    public String printThis(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would " +
                "like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li></ol>" +
                "</body>" +
                "</html>";
    }

    // path: localhost:8080/result
    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, value="result")
    public String printFormResult(){
        return "<html>" +
                "<body>" +
                "<h1>name</h1>" +
                "<ol>" +
                "<li>fir-lang</li></br>" +
                "<li>sec-lang</li></br>" +
                "<li>thr-lang</li></br>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }


    @GetMapping("form")
    public String printForm(){
        return "<html>" +
                "<body>" +
                "<form action='result' method='post'>" +
                "<label>Name:</label><br>" +
                "<input type='text' name='name'><br>" +
                "<label>My favorite language:</label></br>" +
                "<select name='fir-lang'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select></br>" +
                "<label>My second favorite language:</label><br>" +
                "<select name='sec-lang'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select></br>" +
                "<label>My third favorite language:</label><br>" +
                "<select name='thr-lang'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +
                "<input type='submit'>" +
                "</body>" +
                "</html>";

    }










}
