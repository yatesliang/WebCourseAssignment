package com.sse.web.domain;

public class MoviesHasDirector {
    private Integer moviesId;

    private Integer directorId;

    public MoviesHasDirector(Integer moviesId, Integer directorId) {
        this.moviesId = moviesId;
        this.directorId = directorId;
    }

    public MoviesHasDirector() {
        super();
    }

    public Integer getMoviesId() {
        return moviesId;
    }

    public void setMoviesId(Integer moviesId) {
        this.moviesId = moviesId;
    }

    public Integer getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Integer directorId) {
        this.directorId = directorId;
    }
}