package com.jinkens.demo.controller;

import com.jinkens.demo.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JinkensDemoController {

    @GetMapping
    public R getController(){
        return R.ok().data("key","Hello Jinkens");
    }


}
