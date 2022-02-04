package com.cc.java;

public class Triangle extends Shape
{
    private double baseline, height;

    public Triangle(double baseline, double height) {
        
        this.baseline = baseline;
        this.height = height;

    }

    @Override
    public double area(){
        return height * baseline ;
    }
    
    
}
