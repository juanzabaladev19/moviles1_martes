package co.edu.cesde;

public class Calculator {
    int cantNumbers;
    String brand;
    String model;

    void sum(int num1, int num2){
        int total = num1 + num2;
        System.out.println("Su total es: " + total);
    }
    void substract(int num1, int num2){
        int total = num1 - num2;
        System.out.println("Su total es: " + total);
    }
}
