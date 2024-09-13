package com.codewitharry.shape;

class Sphere extends Shape {
    Sphere(int dim1) {
        super(dim1, -1, -1);
    }

    public double area() {
        return 4 * Math.PI * this.dim1 * this.dim1;
    }

    public double volume() {
        return 1.33333333333 * ( Math.PI * this.dim1 * this.dim1 * this.dim1);
    }

    public static void main(String[] args) {
        Sphere s = new Sphere(5);
        System.out.println(s.area());
        System.out.println(s.volume());
    }
}