import java.util.LinkedList;
import java.util.Queue;

/*
 * 
 * Uma fila segue a regra “primeiro a entrar, primeiro a sair” (FIFO).
 * 
 * Exemplo de declaração e uso de fila com LinkedList:
 */

public class ExemploFila {
    public static void main(String[] args) {

        Queue<String> minhaFila = new LinkedList<>();
        minhaFila.offer("Ricardo");
        minhaFila.offer("Denise");
        minhaFila.offer("Shayenne");
    }
}
