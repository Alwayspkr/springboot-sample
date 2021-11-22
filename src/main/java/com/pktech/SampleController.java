package com.pktech;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @RequestMapping("/hello")
    public String mymethod(){
        return "Hellow pk World";
    }
}
