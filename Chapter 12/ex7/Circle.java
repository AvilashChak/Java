package com.codewitharry.shape;

class Circle extends Shape {
    Circle(int dim1) {
        super(dim1, -1, -1);
    }

    public double area() {
        return Math.PI * this.dim1 * this.dim1;
    }

    public static void main(String[] args) {
        Circle c = new Circle(4);
        System.out.println(c.area());
    }
}