package ej2.Java;

public class main {
    public static void main(String[] args){
     precioConIva(234);
    }

    static void precioConIva(int precioBase) {
        System.out.println("Precio final: "+precioBase * 1.16);
    }
}
