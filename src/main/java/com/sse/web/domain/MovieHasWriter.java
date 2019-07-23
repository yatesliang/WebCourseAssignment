package com.sse.web.domain;

public class MovieHasWriter {
    private Integer moviesId;

    private Integer writersId;

    public MovieHasWriter(Integer moviesId, Integer writersId) {
        this.moviesId = moviesId;
        this.writersId = writersId;
    }

    public MovieHasWriter() {
        super();
    }

    public Integer getMoviesId() {
        return moviesId;
    }

    public void setMoviesId(Integer moviesId) {
        this.moviesId = moviesId;
    }

    public Integer getWritersId() {
        return writersId;
    }

    public void setWritersId(Integer writersId) {
        this.writersId = writersId;
    }
}