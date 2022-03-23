package co.edu.cesde;

public class Producto {
    //atributos
    double price;
    private double weight;
    private String color = "blanco";
    private int amount;


    //métodos
    void sell(){
        System.out.println("Vendiendo");
    }

    void rent(){
        System.out.println("Renta");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    void eat(){
        System.out.println("Comer");
    }
    int nextInt(){
        System.out.println("Ejcutando nextInt");
        return 5;
    }
    void setColor(String color){
        if(color.equals("black")){
            System.out.println("Color negro no disponible");
        }
        else {
            this.color = color;
        }
    }
    String getColor(){
        return this.color;
    }
}
