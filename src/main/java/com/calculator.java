package com;

public class calculator {
    public static void main(String[] args){
        System.out.println("4 + 8 = " + add(6, 3));
        System.out.println("24 - 8 = " + subtract(6,3));
        System.out.println("4 * 9 = " + multiply(6,3));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static long multiply(int a, int b) {
        return a * b;
    }
}
