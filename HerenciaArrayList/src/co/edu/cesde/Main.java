package co.edu.cesde;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DbShop dbShop = new DbShop();
        Scanner scanner = new Scanner(System.in);
        boolean flagClose = false;
        while (flagClose == false) {
            System.out.println("Ingrese la opción deseada");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    Monitor monitor = new Monitor();
                    System.out.println("Ingrese nombre del prducto");
                    monitor.setName(scanner.nextLine());
                    System.out.println("Ingrese marca");
                    monitor.setBrand(scanner.nextLine());
                    System.out.println("Ingrese referencia");
                    monitor.setId(scanner.nextLine());
                    dbShop.setMonitor(monitor);
                    break;
                case 4:
                    for(Monitor monitor1: dbShop.getMonitors()){
                        System.out.println(monitor1.getResolution());
                    }
                    break;
                case 10:
                    flagClose = true;
                    break;
            }

        }
    }
}
