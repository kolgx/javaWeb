package com.example.demo.controller;

import com.example.demo.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitorController {
    @Autowired
    private MonitorService monitorService;

    @RequestMapping("/Monitor")
    private String addTest(){
        return "11:58";
    }

    @RequestMapping(value = "/getMonitorData")
    private String getData() {
        return monitorService.findAllMonior();
    }

    @RequestMapping(value = "/findMonitorData")
    private String findData() {
        return monitorService.findMonior();
    }
}
