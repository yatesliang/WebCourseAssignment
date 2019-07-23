package com.sse.web.dao;

import com.sse.web.domain.Cast;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;

public interface CastMapper extends Mapper<Cast> {
    @Select("select c.* " +
            "from cast c, movies_has_cast " +
            "where movies_id=#{movieId} and cast_id=c.id")
    ArrayList<Cast> getMovieCast(@Param("movieId") int movieId);


}