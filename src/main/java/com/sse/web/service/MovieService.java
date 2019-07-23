package com.sse.web.service;

import com.sse.web.dao.CastMapper;
import com.sse.web.dao.DirectorMapper;
import com.sse.web.dao.MoviesMapper;
import com.sse.web.dao.WritersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Service
public class MovieService {
    @Autowired
    private MoviesMapper moviesMapper;
    @Autowired
    private CastMapper castMapper;
    @Autowired
    private DirectorMapper directorMapper;
    @Autowired
    private WritersMapper writersMapper;

    public ArrayList<Map<String, Object>> getMovies(int start, int end) {
        if (end - start > 100) {
            end = start + 100;
        }
        ArrayList<Map<String, Object>> result = moviesMapper.getMovies(start, end);
        for (int i = 0; i < result.size(); ++i) {
            int id = Integer.parseInt(result.get(i).get("id").toString());
            result.get(i).put("director", directorMapper.getMovieDirectors(id));
            result.get(i).put("cast", castMapper.getMovieCast(id));
            result.get(i).put("writer", writersMapper.getMovieWriter(id));
        }

        return result;


    }




}
