package com.company;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public void setA() {
    }

    public void setB() {
    }

    public void setC() {
    }

    public String getType() {
        String type = "";
        if (a == b) {
            if (b == c) {
                type = "equilateral";
            } else if ( b != c){
               type = "isosceles";
            }
        } else if (b == c) {
            type = "isosceles";
        } else if (a == c) {
            type = "isosceles";
        } else if (a != b) {
            if (b != c) {
                type = "scalene";
            }
        }
        return type;
    }


}

