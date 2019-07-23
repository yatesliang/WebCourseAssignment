package com.sse.web;

import com.sse.web.dao.CastMapper;
import com.sse.web.dao.DirectorMapper;
import com.sse.web.dao.MoviesMapper;
import com.sse.web.domain.Cast;
import com.sse.web.domain.Director;
import com.sse.web.service.MovieService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.ArrayList;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(basePackages = "com.sse.web")
public class WebApplicationTests {
    @Autowired
    private MoviesMapper moviesMapper;
    @Autowired
    private DirectorMapper directorMapper;
    @Autowired
    private CastMapper castMapper;
    @Autowired
    private MovieService movieService;

    @Before
    public void before() {
        System.out.println("Start Test");
    }
    @After
    public void after() {
        System.out.println("End Test");
    }
    @Test
    public void contextLoads() {
    }

    @Test
    public void fetchTest() {
        int start = 0;
        ArrayList<Map<String, Object>> result = moviesMapper.getMovies(0,20);
        for (Map<String, Object> item:result) {
            System.out.println(item.get("name"));
        }
    }

    @Test
    public void fetchDirectorTest() {
        int movieId =1291579;
        ArrayList<Director> result = directorMapper.getMovieDirectors(movieId);
        for (Director item: result) {
            System.out.println(item.getName());
        }
    }

    @Test
    public void fetchCastTest() {
        int movieId =1291579;
        ArrayList<Cast> result = castMapper.getMovieCast(movieId);
        for (Cast item: result) {
            System.out.println(item.getName());
        }
    }

    @Test
    public void fetMovieTest() {
        ArrayList<Map<String, Object>> result = movieService.getMovies(0,20);
        for (Map<String, Object> item:result) {
            System.out.println(item.get("name"));
        }
    }


}
