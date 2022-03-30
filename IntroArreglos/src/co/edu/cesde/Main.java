package co.edu.cesde;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);
        int[] numbers = {5,7,8,10,12};
        System.out.println(numbers[2]);
        numbers[2] = 6;
        System.out.println(numbers[2]);
        int data = numbers[3];
        System.out.println("Result" + data*2);
        for(int i=0; i<5; i++){
            System.out.println(numbers[i]);
        }
        int number;
        for(int i=0; i<5; i++){
            System.out.println("Ingrese el dato"+ (i+1));
            number = inputData.nextInt();
            numbers[i] = number;
        }
        for(int i=0; i<5; i++){
            System.out.print(numbers[i]);
        }
    }
}
