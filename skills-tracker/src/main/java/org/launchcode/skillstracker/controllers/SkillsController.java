package org.launchcode.skillstracker.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
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


    @GetMapping("form")
    public String printForm(){
        return "<html>" +
                "<body>" +
                "<form>" +
                "<label>Name:</label><br>" +
                "<input type='text' name='name'><br>" +
                "<label>My favorite language:</label></br>" +
                "<select name='language'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select></br>" +
                "<label>My second favorite language:</label><br>" +
                "<select name='language'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select></br>" +
                "<label>My third favorite language:</label><br>" +
                "<select name='language'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +
                "<input type='submit'>" +
                "</body>" +
                "</html>";

    }










}
