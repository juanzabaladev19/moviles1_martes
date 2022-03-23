package co.edu.cesde;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Monitor miMonitor = new Monitor();
        Scanner inputData = new Scanner(System.in);
        miMonitor.tamanio = 32;
        System.out.println(miMonitor.tamanio);
        miMonitor.tamanio = 42;
        System.out.println(miMonitor.tamanio);
        miMonitor.mostrarImagen();
        Calculator casio = new Calculator();
        int num1, num2;
        System.out.println("Ingrese num1");
        num1 = inputData.nextInt();
        System.out.println("Ingrese num2");
        num2 = inputData.nextInt();
        System.out.println("Que operacion desea realizar: " +
                "1-suma, 2-res, 3, multiplicación, 4 - división");
        int operation = inputData.nextInt();
        switch (operation){
            case 1:
                casio.sum(num1,num2);
                break;
            case 2:
                casio.substract(num1,num2);
                break;
        }
        casio.sum(num1, num2);
    }
}
