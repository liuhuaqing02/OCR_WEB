package com.Dejavu.OCR.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/Hello", method = RequestMethod.GET)
    @ResponseBody
    String Hello(){
        return "Hello, world!";
    }
}
