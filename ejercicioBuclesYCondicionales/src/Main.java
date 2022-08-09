public class Main {
    public static void main(String[] args) {
        var numero = 0;
        if (numero < 0){
            System.out.println("Es negativo");
        }
        else if (numero > 0){
            System.out.println("Es positivo");
        }
        else if(numero == 0){
            System.out.println("Es Cero");
        }
        var numero2 = 0;
        while (numero2 < 3){
            numero2 = numero2 + 1;
            System.out.println(numero2);
        }
        var numero1 = 3;
        do{
            System.out.println(numero1);
            numero1++;
        }while(numero1 < 3);
        for(int numero3= 0; numero <= 3;numero++){
            System.out.println(numero);
        }
        var estacion = "verano";
        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otonio":
                System.out.println("Es otonio");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estacion del anio");
        }
    }
}