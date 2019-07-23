package com.sse.web.domain;

public class Rating {
    private Integer moviesId;

    private Double average;

    private Integer ratingPeople;

    public Rating(Integer moviesId, Double average, Integer ratingPeople) {
        this.moviesId = moviesId;
        this.average = average;
        this.ratingPeople = ratingPeople;
    }

    public Rating() {
        super();
    }

    public Integer getMoviesId() {
        return moviesId;
    }

    public void setMoviesId(Integer moviesId) {
        this.moviesId = moviesId;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Integer getRatingPeople() {
        return ratingPeople;
    }

    public void setRatingPeople(Integer ratingPeople) {
        this.ratingPeople = ratingPeople;
    }
}