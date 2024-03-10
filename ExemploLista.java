import java.util.LinkedList;

/*
 * As listas ligadas são estruturas de dados que representam uma sequência de elementos. 
 * A principal característica é que esses elementos não precisam estar alocados de forma contínua na memória, como acontece com os arrays.
 * 
 * 
 * Exemplo de declaração e uso de lista com LinkedList:
 */

public class ExemploLista {
    public static void main(String[] args) {

        LinkedList<Integer> minhaLista = new LinkedList<>();
        minhaLista.add(10);
        minhaLista.add(20);
        minhaLista.add(30);
    }
}
