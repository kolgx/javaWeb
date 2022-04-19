package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.sql.Time;

//温湿度数据
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Monitor {
    private Integer tem, hum, temMax, temMin, humMax, humMin, temWorn, humWorn;
    private Time time;
    private Date date;

    public Monitor(Range range, Integer tem, Integer hum) {
        this.tem = tem;
        this.hum = hum;
        temMax = range.getTemMax();
        temMin = range.getTemMin();
        humMax = range.getHumMax();
        humMin = range.getHumMin();
        time = new Time(new java.util.Date().getTime());
        date = new Date(new java.util.Date().getYear(),
                new java.util.Date().getMonth(),
                new java.util.Date().getDate());
        if(temMax>temMin)
            temWorn = tem>temMax?2:(tem<temMin?1:0);
        if(humMax>humMin)
            humWorn = hum>humMax?2:(hum<humMin?1:0);
    }

}
