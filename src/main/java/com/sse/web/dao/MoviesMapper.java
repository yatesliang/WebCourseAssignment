package com.sse.web.dao;

import com.sse.web.domain.Movies;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface MoviesMapper extends Mapper<Movies> {
    @Select("select * from movies, rating where movies_id=id order by rating.average desc limit #{start},#{end}")
    ArrayList<Map<String, Object>> getMovies(@Param("start") int start, @Param("end") int end);


}