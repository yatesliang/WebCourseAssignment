package com.sse.web.controller;

import com.sse.web.service.MovieService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;


    @RequestMapping("/getMovies")
    @ResponseBody
    ArrayList<Map<String, Object>> getMovies(@RequestParam("start") int start, @RequestParam("end") int end) {
        return movieService.getMovies(start, end);
    }
}
