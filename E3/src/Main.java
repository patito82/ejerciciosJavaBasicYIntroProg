public class Main {
    public static void main(String[] args) {
        sumar(5,5,5);
        Coche miCoche = new Coche();
        miCoche.sumarPuerta();
        System.out.println(miCoche.puertas);
    }
    public static void sumar(int a,int b,int c){
        var resultado = a + b + c;
        System.out.println(resultado);
    }
}