package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    /*    Shape shape = new Shape(5);
        System.out.println(shape.getLength());

        shape.setLength(10);
        System.out.println(shape.getLength()); */

        Triangle ligeSidet = new Triangle(5, 5, 5);
        String type = ligeSidet.getType();
        System.out.println("ligesidet: " + type);

        Triangle toEns = new Triangle(4,4,5);
        type = toEns.getType();
        System.out.println("toEns: " + type);

        Triangle toEns1 = new Triangle(5,4,4);
        type = toEns1.getType();
        System.out.println("toEns1; " + type);

        Triangle toEns2 = new Triangle(4,5,4);
        type = toEns2.getType();
        System.out.println("toEns2: " + type);

        Triangle forskelligeSider = new Triangle(2,5,7);
        type = forskelligeSider.getType();
        System.out.println("Ikke nogne ligesider: " + type);



    }
}
