package com.sse.web.domain;

public class MoviesHasCast {
    private Integer moviesId;

    private Integer castId;

    public MoviesHasCast(Integer moviesId, Integer castId) {
        this.moviesId = moviesId;
        this.castId = castId;
    }

    public MoviesHasCast() {
        super();
    }

    public Integer getMoviesId() {
        return moviesId;
    }

    public void setMoviesId(Integer moviesId) {
        this.moviesId = moviesId;
    }

    public Integer getCastId() {
        return castId;
    }

    public void setCastId(Integer castId) {
        this.castId = castId;
    }
}