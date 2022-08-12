package ej1.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        mostrarDatos();
        Persona persona = new Persona();
        persona.mostrarAtributos();
    }

    public static void mostrarDatos() {
        byte numero1byte = 102;
        int numero4Byte = 121;
        long numero8byte = 234521515;
        short numero2byte = 23452;
        float numeroflotante32bits = 012345.090123f;
        double numeroFlotante64bits = 221322223.24125d;
        char unCaracter = 'a';
        String texto = "Hola";
        boolean verdad = true;

        System.out.println(numero1byte);
        System.out.println(numero2byte);
        System.out.println(numero4Byte);
        System.out.println(numero8byte);
        System.out.println(numeroflotante32bits);
        System.out.println(numeroFlotante64bits);
        System.out.println(unCaracter);
        System.out.println(texto);
        System.out.println(verdad);
        int[] numerosMuestra = new int[]{21, 22, 23};
        for (int i = 0; i < numerosMuestra.length; i++) {
            System.out.println(numerosMuestra[i]);
        }
        List<String> nombreListas = new ArrayList<>();
        nombreListas.add("pedro");
        nombreListas.add("sapo");
        nombreListas.add("matias");
        for(String nombres : nombreListas){
            System.out.println(nombres);
        }
        Map<String, String> estacionesMapa = new HashMap<>();
        estacionesMapa.put("12345", "estevez");
        estacionesMapa.put("1234", "marta");
        for (Map.Entry<String,String> varios : estacionesMapa.entrySet()){
            System.out.println(varios.getKey() + "/" + varios.getValue());
        }
    }
}
class Persona {
    String nombre = "jorge";
    int edad = 20;

    public Persona() {

    }

    public void mostrarAtributos() {
        System.out.println(nombre);
        System.out.println(edad);
    }
}
