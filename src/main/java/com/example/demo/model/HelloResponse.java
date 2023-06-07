package com.example.demo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class HelloResponse implements Serializable {

    private String data;

    public HelloResponse(String data) {
        this.data = data;
    }
}
