package com.Syntax.Task1;

interface Shape {

     /*1. Create an Interface 'Shape' with undefined
        methods as calculateArea and
        calculatePerimiter. Create 2 classes Circle &
        Square that implements functionality defined in
        the Shape Interface. Test your code.
     */

    void calculateArea();

    void calculatePerimeter();

}

class Cirlce implements Shape {

    @Override
    public void calculateArea() {

        System.out.println("The area of the circle is "+3.14*36);
    }

    @Override
    public void calculatePerimeter(){
        System.out.println("The perimeter of the circle is "+2*3.14*6);
    }
}

class Square implements Shape {

    @Override
    public void calculateArea() {
        System.out.println("The area of a square is "+8*2);
    }

    @Override
    public void calculatePerimeter(){
        System.out.println("The perimeter of square is "+4*5);
    }

    public static void main(String[] args) {

        Cirlce circle=new Cirlce();
        circle.calculateArea();
        circle.calculatePerimeter();

        Square square=new Square();
        square.calculateArea();
        square.calculatePerimeter();
    }

}

