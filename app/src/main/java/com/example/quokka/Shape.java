package com.example.quokka;

public abstract class Shape {
    private Integer x;
    private Integer y;
    private String color;

    public Shape(Integer x, Integer y) {
        this.x = x;
        this.y = y;
        this.color = "pink";

    }
}

public abstract class Square extends Shape{
    private int side;

    public Square(int side){
        this.side = side;
    }


}