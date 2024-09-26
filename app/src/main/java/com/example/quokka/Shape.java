package com.example.quokka;

public abstract class Shape {
    private Integer x;
    private Integer y;
    private String color = "blue";

    public Shape(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
}
