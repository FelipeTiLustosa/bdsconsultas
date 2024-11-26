package com.devsuperior.uri2611.dto;

import com.devsuperior.uri2611.projections.MovieMinProjections;

public class MovieMinDTO {

    private Long id;
    private String name;

    public MovieMinDTO() {
    }

    public MovieMinDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public MovieMinDTO(MovieMinProjections projections) {
        name = projections.getName();
        id = projections.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MovieMinDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
