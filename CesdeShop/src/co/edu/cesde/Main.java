package co.edu.cesde;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Producto cereal = new Producto();
        int precio = 15000;
        if(precio > 10000){
            System.out.println("No se puede");
        }
        else{
            cereal.setPrice(15000);
        }

        Producto marcador = new Producto();
        int price2 = 50000;
        if(price2 > 5000){
            System.out.println( "No se puede");
        }
        else{
            marcador.setPrice(2500);
        }

        System.out.println(marcador.getPrice());
    }
}
