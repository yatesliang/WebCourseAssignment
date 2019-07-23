package com.sse.web.dao;

import com.sse.web.domain.Director;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface DirectorMapper extends Mapper<Director> {

    @Select("select d.* " +
            "from director d, movies_has_director " +
            "where movies_id=#{movieId} and director_id=d.id")
    ArrayList<Director> getMovieDirectors(@Param("movieId") int movieId);
}