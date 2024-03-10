import java.util.ArrayList;
import java.util.List;

/*
 * Um ArrayList é uma implementação de um vetor dinâmico em Java.
 * 
 * Ele pode crescer ou diminuir automaticamente à medida que elementos são inseridos ou removidos
 * 
 * Exemplo de declaração e uso de ArrayList:
 */

public class ExemploArrayList {
    public static void main(String[] args) {

        List<String> minhaLista = new ArrayList<>();
        minhaLista.add("Maçã");
        minhaLista.add("Banana");
        minhaLista.add("Laranja");
        minhaLista.remove("Maçã");
    }
}
