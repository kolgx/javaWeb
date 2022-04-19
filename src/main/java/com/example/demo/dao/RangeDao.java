package com.example.demo.dao;

import com.example.demo.pojo.Monitor;
import com.example.demo.pojo.Range;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RangeDao {
    private static Map<Integer, Range> rangeMap = null;
    static {
        rangeMap = new HashMap<Integer, Range>();
//        rangeMap.put(45,new Range(99,0,99,0,"05:18"));
    }
    public Collection<Range> getRangs(){
        return rangeMap.values();
    }
    public Range getRangById(Integer id){
        return rangeMap.get(id);
    }
}
