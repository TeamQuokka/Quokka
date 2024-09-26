package com.example.quokka;

import android.graphics.Color;

public abstract class Shape {
    private Integer x;
    private Integer y;
    private String color = "magenta";

    public Shape(Integer x, Integer y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
}


