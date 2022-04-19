package com.example.demo.dao;

import com.example.demo.pojo.Monitor;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MonitorDao {
    private static Map<Integer, Monitor> monitorMap = null;
    /*static {
        monitorMap = new HashMap<Integer, Monitor>();
        monitorMap.put(255,new Monitor(45,86,"12:45"));
        monitorMap.put(256,new Monitor(34,45,"13:04"));
        monitorMap.put(257,new Monitor(78,25,"05:12"));
        monitorMap.put(258,new Monitor(98,75,"16:09"));
        monitorMap.put(259,new Monitor(13,84,"17:05"));
    }*/

    //获取所有信息
    public Collection<Monitor> getMonitors(){
        return monitorMap.values();
    }
    //查询
    public Monitor getMonitorById(Integer id){
        return monitorMap.get(id);
    }
}
