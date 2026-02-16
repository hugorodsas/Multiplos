import java.util.Iterator;
import java.util.List;

public class Numeros {
    public static void EliminarNumeros (List<Integer> lista, int numero){
        if(numero == 0){
            throw new IllegalArgumentException("El numero no puede ser 0");
        }

        Iterator<Integer> iterator = lista.iterator();

        while ((iterator.hasNext())){
            Integer valor = iterator.next();
            if (valor % numero==0){
                iterator.remove();
            }
        }
    }
}
