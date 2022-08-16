
public class Main {
    public static void main(String[] args) {
    CocheCrud coche = new CocheCrudImpl();
        coche.delete();
        coche.findAll();
        coche.save();
        System.out.println(coche);
    }

}