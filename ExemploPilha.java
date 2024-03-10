public class ExemploPilha {

    /*
     * Uma pilha segue a regra “último a entrar, primeiro a sair” (LIFO).
     * 
     * Pode ser implementada usando um array.
     * 
     * Exemplo de declaração e uso de pilha com array:
     */

    public static void main(String[] args) {
        ExemploPilha pilha = new ExemploPilha();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Topo da pilha: " + pilha.peek());
        System.out.println("Removendo elemento: " + pilha.pop());
        System.out.println("Topo atual: " + pilha.peek());
    }

    private static final int MAX = 1000;
    private int top;
    private int[] a = new int[MAX];

    public ExemploPilha() {
        top = -1;
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Estouro de Pilha!");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Pilha Vazia!");
            return 0;
        } else {
            return a[top--];
        }
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Pilha Vazia!");
            return 0;
        } else {
            return a[top];
        }
    }

}
