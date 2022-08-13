import java.sql.Array;

public class Main {
    public static void main(String[] args) {
    String [] nombres = new String[]{"jorge","pedro","mati"};
    for (int i = 0; i < nombres.length ;i++){
        String nombresA = nombres[i] + " ";
            for(int j = 0; j < 1; j++){
                System.out.print(nombresA);
        }
    }
    }

}