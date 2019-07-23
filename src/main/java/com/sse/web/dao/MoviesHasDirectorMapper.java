package com.sse.web.dao;

import com.sse.web.domain.MovieHasWriter;
import com.sse.web.domain.MoviesHasDirector;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface MoviesHasDirectorMapper extends Mapper<MoviesHasDirector> {
}