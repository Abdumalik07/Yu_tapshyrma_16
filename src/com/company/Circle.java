package com.company;

public class Circle {
    final static double pi=3.14d;
    private static int radius;

    public Circle(int radius){
        Circle.radius =radius;
    }

     static void area(){
         System.out.println("Area of circle = "+pi*(radius*radius)+"cm^2");

    }
    static void circumference(){
        System.out.println("circumference = "+pi*2*radius+"cm");



    }

    public double getPi() {
        return pi;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
