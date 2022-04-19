package com.example.demo.service;

import com.example.demo.mapper.MonitorMapper;
import com.example.demo.pojo.Monitor;
import com.example.demo.pojo.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorService {
    @Autowired
    private MonitorMapper monitorMapper;

    public int addMonitor(){
        Monitor monitor = new Monitor(new Range(99,0,99,0),88,25);
        return monitorMapper.addMonitor(monitor);
    }

    public String findAllMonior(){
        System.out.println("LOG : findAll Monior");
        String out = jsonObject(monitorMapper.findAllMonior());
        System.out.println("LOG : findAll Monior out : "+out);
        return out;
    }

    public String findMonior(){
        System.out.println("LOG : findWorn Monior");
        String out = jsonObject(monitorMapper.findWornMonitor("temWorn",0));
        System.out.println("LOG : findWorn Monior out : "+out);
        return out;
    }

    private static String jsonObject (List<Monitor> monitors){
        System.out.println(monitors);
        if (monitors.size() < 1)
            return "{\"tem\":[24,24,24,24,24,24,24,24,24,24,24,24]," +
                    "\"hum\":[17,17,17,17,17,17,17,17,17,17,18,17],\"" +
                    "time\":[\"05:34:33\",\"05:34:29\",\"05:34:25\",\"05:34:20\"," +
                    "\"05:34:16\",\"05:34:12\",\"05:34:08\",\"05:34:04\",\"05:34:00\"," +
                    "\"05:33:59\",\"05:33:58\",\"05:33:53\"]}";
        StringBuilder hum_jsonArray = new StringBuilder();
        StringBuilder tem_jsonArray = new StringBuilder();
        StringBuilder time_jsonArray = new StringBuilder();

        hum_jsonArray.append("[");
        tem_jsonArray.append("[");
        time_jsonArray.append("[");
        int size = monitors.size() - 1;
        for (Monitor monitor : monitors) {
            hum_jsonArray.append(monitor.getHum());
            tem_jsonArray.append(monitor.getTem());
            time_jsonArray.append("\"").append(monitor.getTime()).append("\"");
            if (size > 0) {
                hum_jsonArray.append(",");
                tem_jsonArray.append(",");
                time_jsonArray.append(",");
                size -- ;
            }
        }
        hum_jsonArray.append("]");
        tem_jsonArray.append("]");
        time_jsonArray.append("]");

        return "{\"tem\":"+ tem_jsonArray+
                ",\"hum\":"+ hum_jsonArray+
                ",\"time\":"+ time_jsonArray+"}";
    }
}
