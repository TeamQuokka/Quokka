package com.example.quokka;

public abstract class Shape {
    private Integer x;
    private Integer y;
    private String color;
    public Shape(Integer x, Integer y) {
        this.x = x;
        this.y = y;
        this.color = "cyan";
    }
}
