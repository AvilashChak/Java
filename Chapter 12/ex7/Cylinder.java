package com.codewitharry.shape;

class Cylinder extends Shape {
    Cylinder(int dim1, int dim2) {
        super(dim1, dim2, -1);
    }

    public double area() {
        return 2 * Math.PI * this.dim1 * this.dim2 + 2 * Math.PI * this.dim1 * this.dim1;
    }

    public double volume() {
        return Math.PI * this.dim1 * this.dim1 * this.dim2;
    }

    public static void main(String[] args) {
        Cylinder cy = new Cylinder(4, 6);
        System.out.println(cy.area());
        System.out.println(cy.volume());
    }
}