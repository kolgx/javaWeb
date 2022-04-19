package com.example.demo.mapper;

import com.example.demo.pojo.Monitor;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface MonitorMapper {
    @Insert("insert into InputData values(#{tem},#{hum}," +
            "#{temMax},#{temMin},#{humMax},#{humMin}," +
            "#{temWorn},#{humWorn},#{date},#{time})")
    int addMonitor (Monitor monitor);

    @Select("select * from InputData order by date desc, time desc limit 12")
    @Results({
    @Result(property="tem",column="tem",jdbcType = JdbcType.INTEGER),
    @Result(property="hum",column="hum",jdbcType = JdbcType.INTEGER),
    @Result(property="temMax",column="temMax",jdbcType = JdbcType.INTEGER),
    @Result(property="temMin",column="temMin",jdbcType = JdbcType.INTEGER),
    @Result(property="humMax",column="humMax",jdbcType = JdbcType.INTEGER),
    @Result(property="humMin",column="humMin",jdbcType = JdbcType.INTEGER),
    @Result(property="temWorn",column="temWorn",jdbcType = JdbcType.INTEGER),
    @Result(property="humWorn",column="humWorn",jdbcType = JdbcType.INTEGER),
    @Result(property="date",column="date",jdbcType = JdbcType.DATE),
    @Result(property="time",column="time",jdbcType = JdbcType.TIME)
    })
    List<Monitor> findAllMonior();

    @Select("select * from InputData where #{type} = #{worn} order by date desc, time desc limit 20")
    @Results({
            @Result(property="tem",column="tem",jdbcType = JdbcType.INTEGER),
            @Result(property="hum",column="hum",jdbcType = JdbcType.INTEGER),
            @Result(property="temMax",column="temMax",jdbcType = JdbcType.INTEGER),
            @Result(property="temMin",column="temMin",jdbcType = JdbcType.INTEGER),
            @Result(property="humMax",column="humMax",jdbcType = JdbcType.INTEGER),
            @Result(property="humMin",column="humMin",jdbcType = JdbcType.INTEGER),
            @Result(property="temWorn",column="temWorn",jdbcType = JdbcType.INTEGER),
            @Result(property="humWorn",column="humWorn",jdbcType = JdbcType.INTEGER),
            @Result(property="date",column="date",jdbcType = JdbcType.DATE),
            @Result(property="time",column="time",jdbcType = JdbcType.TIME)
    })
    List<Monitor> findWornMonitor(String type, Integer worn);

    @Delete("delete * from InputData")
    int deleteAllMonitor();
}
