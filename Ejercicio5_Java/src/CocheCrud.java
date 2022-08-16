public interface CocheCrud {
    void save();
    void findAll();
    void delete();
}

class CocheCrudImpl implements CocheCrud{
    String saludo;

    public CocheCrudImpl(){
        saludo = "Hola";
    }
    @Override
    public void save() {
        System.out.println("guardar");
    }

    @Override
    public void findAll() {
        System.out.println("muestro");
    }

    @Override
    public void delete() {
        System.out.println("Elimino");
    }

    @Override
    public String toString() {
        return "CocheCrudImpl{" +
                "saludo='" + saludo + '\'' +
                '}';
    }
}