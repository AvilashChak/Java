package com.codewitharry.shape;

class Square extends Shape {
    Square(int dim1) {
        super(dim1, -1, -1);
    }

    public int area() {
        return this.dim1 * this.dim1;
    }

    public int volume() {
        return this.dim1 * this.dim1 * this.dim1;
    }

    public static void main(String[] args) {
        Square sq = new Square(2);
        System.out.println(sq.area());
        System.out.println(sq.volume());
    }
}