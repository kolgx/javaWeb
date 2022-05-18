package com.example.demo.service;

import com.example.demo.mapper.RangeMapper;
import com.example.demo.pojo.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RangeService {
    @Autowired
    private RangeMapper rangeMapper;

    public int addRange(Range range){
        return rangeMapper.addRange(range);
    }

    public String findRange(){
        Range range = rangeMapper.findRange();
        return "{\"temMax\":"+range.getTemMax()+
                ",\"temMin\":"+range.getTemMin()+
                ",\"humMax\":"+range.getHumMax()+
                ",\"humMin\":"+range.getHumMin()+
                ",\"time\":\""+range.getTime()+"\""+
                ",\"date\":\""+range.getDate()+"\"}";
    }
}
