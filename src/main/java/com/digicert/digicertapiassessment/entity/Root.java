package com.digicert.digicertapiassessment.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Root {
    private Integer count;
    private Object next;
    private Object previous;
    private List<Result> results = new ArrayList<Result>();
}
