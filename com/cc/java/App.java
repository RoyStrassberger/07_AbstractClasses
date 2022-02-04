package com.cc.java;

public class App {

    public static void main(String[] args) 
    {
        Rectangle rectangle = new Rectangle(10.0, 10.0); 
        Triangle triangle = new Triangle(10.0, 10.0); 
        Circle circle = new Circle(5.0); 

        output("------ Flächen ----------");
        output("Fläche Rechteck: " + rectangle.area());
        output("Fläche Dreieck: " + triangle.area());
        output("Fläche Kreis: " + circle.area());

        
        output("------------ Differenzen -------------------");
        output("diff. r-t: :" + areaDiff(rectangle, triangle));
        output("diff. r-c: :" + areaDiff(rectangle, circle));
        output("diff. c-t: :" + areaDiff(circle, triangle));

    }
    // private static double areaDiff(Rectangle r, Circle t) {
    //     return r.area() - t.area();
    // }

    // private static double areaDiff(Rectangle r, Circle c) {
    //     return r.area() - c.area();
    // }
        // Besser: Polymorphie

    private static double areaDiff(Shape s1, Shape s2) {

        return s1.area() - s2.area();

    }

    private static void output(String outputString) {
        System.out.println(outputString);
    }
}
