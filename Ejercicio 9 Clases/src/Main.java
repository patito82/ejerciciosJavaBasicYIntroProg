public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.nombre = "Jorge";
        cliente1.edad = 24;
        cliente1.numeroTelefono = 34556688;
        cliente1.credito = true;
        System.out.println(cliente1.nombre);
        System.out.println(cliente1.edad);
        System.out.println(cliente1.numeroTelefono);
        System.out.println(cliente1.credito);
        Trabajador trabajador1 = new Trabajador();
        trabajador1.nombre = "Matias";
        trabajador1.edad= 22;
        trabajador1.numeroTelefono=234332211;
        trabajador1.salario = 10000;
        System.out.println(trabajador1.nombre);
        System.out.println(trabajador1.edad);
        System.out.println(trabajador1.numeroTelefono);
        System.out.println(trabajador1.salario);

    }
}
class Persona{
    int edad;
    int numeroTelefono;
    String nombre;
}
class Cliente extends Persona{
    boolean credito;
}
class Trabajador extends Persona{
    int salario;
}