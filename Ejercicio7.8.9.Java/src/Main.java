import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
import java.lang.String;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) {

            reverse("pedro");
            System.out.println();
            String[] array1 = new String[]{"Hola", "que", "tal", "?"};
            for (String valores : array1) {
                System.out.println(valores);
            }// Array
            int array2[][] = {{1, 2, 3}, {4, 5, 6}};
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    System.out.println("Elemento: " + array2[i][j] + "/ posicion: " + i);
                }
            }// Array bidimensional
            Vector<Integer> vector1 = new Vector<>();
            vector1.add(1);
            vector1.add(2);
            vector1.add(3);
            vector1.add(4);
            vector1.add(5);
            vector1.remove(1);
            vector1.remove(1);
            System.out.println(vector1); //Vector
        /* El problema es que se duplicaria su capacidad cuando
        llegemos a su maxima capacidad esto haria trabajar a la maquina
        de forma innecesaria y repetir una accion muchas veces*/
            ArrayList<String> array3 = new ArrayList<>();
            array3.add("hola ");
            array3.add("como ");
            array3.add("estas ");
            array3.add("pedro ");
            for (String valores : array3) {
                System.out.print(valores);
            }
            System.out.println();
            LinkedList<String> array4 = new LinkedList<>(array3);
            for (String valores : array4) {
                System.out.print(valores);
            }
            System.out.println(); // Copiar en linkedlist
            ArrayList<Integer> array5 = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                array5.add(i);
            }
            for (int j = 0; j < array5.size(); j++) {
                if (array5.get(j) % 2 == 0) {
                    array5.remove(array5.get(j));
                }
            }
            System.out.print(array5);
            System.out.println(); //Eliminar pares
            divideCero();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa carpeta a copiar:");
            String fileIn = scanner.next();
            System.out.println("Ingresa en que carpeta copiarlo:");
            String fileOut = scanner.next();
            copiaFichero(fileIn, fileOut); //Copia Fichero
            programa();

        }

        public static void programa() {
            String[] usuarios = new String[1];
            String[] claves = new String[1];
            usuarios[0] = "pepe";
            claves[0] = "123";
            int menuInit;
            try {
                System.out.println("1- Iniciar sesion");
                System.out.println("2- Registrarse");
                System.out.println("3- Solicitar datos actuales");
                System.out.print("Que desea hacer?");
                Scanner scanner = new Scanner(System.in);
                menuInit = scanner.nextInt();
                while (menuInit > 3) {
                    System.out.print("Error intenta nuevamente:");
                    menuInit = scanner.nextInt();
                } // Control
                if (menuInit == 1) {
                    int cont = 0;
                    while (cont < 3) {
                        cont++;
                        System.out.println("Ingrese su usuario:");
                        String usuario = scanner.next();
                        boolean estaUser = Arrays.asList(usuarios).contains(usuario);
                        if (estaUser) {
                            System.out.println("Usuario correcto");
                            System.out.println("Ingrese su clave:");
                            String clave = scanner.next();
                            boolean estaClave = Arrays.asList(claves).contains(clave);
                            if (estaClave) {
                                System.out.println("Ingresaste correctamente");
                                cont = 4;
                            } else {
                                System.out.println("Clave incorrecta");
                            }
                        } else {
                            System.out.println("Usuario incorrecto");
                        }
                    }
                    if (cont == 3) {
                        System.out.println("Bloqueado");
                    }
                }// Iniciar sesion
                if (menuInit == 2) {
                    int cont = 0;
                    ArrayList<String> usuariosNew = new ArrayList<>(Arrays.asList(usuarios));
                    ArrayList<String> clavesNew = new ArrayList<>(Arrays.asList(claves));
                    while (cont != 3) {
                        System.out.println("Ingrese su nombre: ");
                        String newUser = scanner.next();
                        usuariosNew.add(newUser);
                        System.out.println("Ingrese una clave:");
                        String newKey = scanner.next();
                        clavesNew.add(newKey);
                        System.out.println("Registro exitoso");
                        System.out.println(usuariosNew);
                        System.out.println(clavesNew);
                        System.out.println("Que desea hacer?\n" +
                                "1-Ingresar otro usuario\n" +
                                "2-Salir");
                        int optionRegister = scanner.nextInt();
                        if (optionRegister == 2) {
                            System.out.println("Fin de sesion");
                            cont = 3;
                        }
                        if (optionRegister == 1) {

                        }
                        usuarios = usuariosNew.toArray(usuarios);
                        claves = clavesNew.toArray(claves);
                    }

                } // Registrarse
                if (menuInit == 3) {
                    String paraHashUser = Arrays.toString(usuarios);
                    String paraHashClave = Arrays.toString(claves);
                    Map<String, String> baseUser = new HashMap<>() {
                    };
                    baseUser.put(paraHashClave, paraHashUser);
                    for (Map.Entry<String, String> user : baseUser.entrySet()) {
                        System.out.println(user.getKey() + "\n" + user.getValue());
                    }
                } // Pedir Claves y usuarios
            } catch (Error e) {
                System.out.println(e.getMessage());
            }
        } // Programa registros

        public static void copiaFichero(String fileIn, String fileOut) {

            try {
                InputStream in = new FileInputStream(fileIn);
                OutputStream out = new FileOutputStream(fileOut);
                byte[] buf = new byte[1024];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        } // Copia fichero

        public static int divideCero() throws ArithmeticException {
            int dividendo = 5;
            int divisor = 1;
            if (divisor == 0) {
                throw new ArithmeticException("Esto no puede hacerse");
            }
            System.out.println("Demo de codigo");
            return dividendo / divisor;
        } // Divide cero

        public static String reverse(String texto) {
            char[] alReves = texto.toCharArray();
            char dadaVuelta;
            String resul = "hola";
            for (int i = alReves.length - 1; i > -1; i--) {
                dadaVuelta = (alReves[i]);
                System.out.print(dadaVuelta);
                resul = Character.toString(dadaVuelta);
            }
            return resul;
        } // Cadena Al reves
    }
