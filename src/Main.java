import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(4);
        numeros.add(6);
        numeros.add(7);
        numeros.add(9);
        numeros.add(10);

        Numeros.EliminarNumeros(numeros,3);

        System.out.println(numeros);
    }
}