package com.example.maven_github_dhub_demo;

public class circlearea {

    public static double calculateArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException(
                "Radius cannot be negative");
        }

        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        double radius = 5.0;

        if (args.length > 0) {
            radius = Double.parseDouble(args[0]);
        }

        double area = calculateArea(radius);

        System.out.println("Radius : " + radius);
        System.out.println("Area of Circle : " + area);
    }
}
