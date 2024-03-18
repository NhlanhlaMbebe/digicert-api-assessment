package com.digicert.digicertapiassessment.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    private String title;
    private Integer episodeId;
    private String openingCrawl;
    private String director;
    private String producer;
    private String releaseDate;
    private List<String> characters = new ArrayList<String>();
    private List<String> planets = new ArrayList<String>();
    private List<String> starships = new ArrayList<String>();
    private List<String> vehicles = new ArrayList<String>();
    private List<String> species = new ArrayList<String>();
    private String created;
    private String edited;
    private String url;
}
