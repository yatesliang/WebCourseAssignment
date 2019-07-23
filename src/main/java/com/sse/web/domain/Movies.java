package com.sse.web.domain;

public class Movies {
    private Integer id;

    private String name;

    private String lensId;

    private String cover;

    private Integer duration;

    private Integer year;

    private String imdb;

    private String summary;

    private String genres;

    private String pubdate;

    private String countries;

    public Movies(Integer id, String name, String lensId, String cover, Integer duration, Integer year, String imdb, String summary, String genres, String pubdate, String countries) {
        this.id = id;
        this.name = name;
        this.lensId = lensId;
        this.cover = cover;
        this.duration = duration;
        this.year = year;
        this.imdb = imdb;
        this.summary = summary;
        this.genres = genres;
        this.pubdate = pubdate;
        this.countries = countries;
    }

    public Movies() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLensId() {
        return lensId;
    }

    public void setLensId(String lensId) {
        this.lensId = lensId == null ? null : lensId.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb == null ? null : imdb.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres == null ? null : genres.trim();
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate == null ? null : pubdate.trim();
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries == null ? null : countries.trim();
    }
}