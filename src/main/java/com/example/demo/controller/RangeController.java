package com.example.demo.controller;

import com.example.demo.pojo.Range;
import com.example.demo.service.RangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RangeController {
    @Autowired
    private RangeService rangeService;

    @RequestMapping("/addRange")
    private String addRange(Range range){
        if (rangeService.addRange(range) == 1)
            return "success";
        return "false";
    }

    @RequestMapping("/findRange")
    private String findRange(){
        return rangeService.findRange();
    }
}
