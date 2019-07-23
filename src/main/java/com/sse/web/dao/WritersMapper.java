package com.sse.web.dao;

import com.sse.web.domain.Writers;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface WritersMapper extends Mapper<Writers>  {
    @Select("select w.* " +
            "from writers w, movies_has_writers " +
            "where movies_id=#{movieId} and writers_id=w.id;")
    ArrayList<Writers> getMovieWriter(@Param("movieId") int movieId);
}