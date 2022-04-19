package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

//设置范围
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Range {
    private Integer temMax, temMin, humMax, humMin;
    private Time time;
    private Date date;

    public Range(Integer temMax, Integer temMin, Integer humMax, Integer humMin) {
        this.temMax = temMax;
        this.temMin = temMin;
        this.humMax = humMax;
        this.humMin = humMin;
        time = new Time(new java.util.Date().getTime());
        date = new Date(new java.util.Date().getYear(),
                new java.util.Date().getMonth(),
                new java.util.Date().getDate());
    }

}
