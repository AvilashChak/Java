package com.codewitharry.shape;

class Rectangle extends Shape {
    Rectangle(int dim1, int dim2, int dim3) {
        super(dim1, dim2, dim3);
    }

    public int area() {
        return this.dim1 * this.dim2;
    }

    public int volume() {
        return this.dim1 * this.dim2 * this.dim3;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 6, 3);
        System.out.println(rect.area());
        System.out.println(rect.volume());
    }

}