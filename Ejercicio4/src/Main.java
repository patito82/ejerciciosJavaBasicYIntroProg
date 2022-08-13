public class Main {
    public static void main(String[] args) {
        SmartPhone samsungA20S = new SmartPhone("samsungA20s","Android",6.5f,183,32,false);
        System.out.println(samsungA20S);
        SmartWatch samsungWacth4 = new SmartWatch("samsumg galaxy Watch 4","Android",1.19f,45,1.5f,true);
        System.out.println(samsungWacth4);
    }
}
class SmartDevice{
    String nombre;
    String sistemaOperativo;
    float tamanioPulgadas;
    int pesoGramos;
    float memoria;
    boolean apagado;
    public  SmartDevice(String nombre,String sistemaOperativo,float tamanioPulgadas,int pesoGramos, float memoriaGb,boolean apagado){
        this.nombre = nombre;
        this.sistemaOperativo = sistemaOperativo;
        this.tamanioPulgadas = tamanioPulgadas;
        this.pesoGramos = pesoGramos;
        this.memoria = memoriaGb;
        this.apagado = apagado;
    }
    public SmartDevice(){}
    public void encenderDispositivo(){
        apagado = true;
    }
    public void apagarDispositivo(){
        apagado = false;
    }

    @Override
    public String toString() {
        return "Smart device: " +
                "nombre=" + nombre +
                ", sistemaOperativo= "+ sistemaOperativo +
                ", tamanioPulgadas=" + tamanioPulgadas +
                ", pesoGramos=" + pesoGramos +
                ", memoria=" + memoria +
                ", apagado=" + apagado;
    }
}

class SmartWatch extends SmartDevice {


    public SmartWatch(String nombre, String sistemaOperativo, float tamanioPulgadas, int pesoGramos, float memoriaGb,boolean apagado) {
        super(nombre, sistemaOperativo, tamanioPulgadas, pesoGramos, memoriaGb,apagado);
    }

    public  SmartWatch() {

    }
}

class SmartPhone extends SmartDevice{

    public  SmartPhone(){

    }

    public SmartPhone(String nombre, String sistemaOperativo, float tamanioPulgadas, int pesoGramos, float memoriaGb, boolean apagado) {
        super(nombre, sistemaOperativo, tamanioPulgadas, pesoGramos, memoriaGb, apagado);
    }

}


