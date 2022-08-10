public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(20);
        persona.setNumeroTel(50454534);
        persona.setNombre("Valentin Chavez");
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getNumeroTel());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private int numeroTel;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setNumeroTel(int numeroTel){
        this.numeroTel= numeroTel;
    }
    public int getEdad(){
        return edad;
    }
    public int getNumeroTel(){
        return numeroTel;
    }
    public String getNombre(){
        return nombre;
    }
}