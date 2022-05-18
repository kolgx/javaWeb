package com.example.demo.mapper;

import com.example.demo.pojo.Range;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;


@Mapper
public interface RangeMapper {
    @Insert("insert into SetData values(" +
            "#{temMax},#{temMin},#{humMax},#{humMin}," +
            "#{date},#{time})")
    int addRange (Range range);

    @Select("select * from SetData order by date desc, time desc limit 1")
    @Results({
            @Result(property="temMax",column="temMax",jdbcType = JdbcType.INTEGER),
            @Result(property="temMin",column="temMin",jdbcType = JdbcType.INTEGER),
            @Result(property="humMax",column="humMax",jdbcType = JdbcType.INTEGER),
            @Result(property="humMin",column="humMin",jdbcType = JdbcType.INTEGER),
            @Result(property="date",column="date",jdbcType = JdbcType.DATE),
            @Result(property="time",column="time",jdbcType = JdbcType.TIME)
    })
    Range findRange();
}
