import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//* O motivo de eu ter escolhido utilizar a estrutura de dados "Fila" é por causa que desejamos remover os "dados" da lista em ordem de chegada e ela é ideal para um sistema de atendimento como esse.

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Queue<String> fila = new LinkedList<>();

        System.out.println("Deseja realizar alguma operação?");

        String resposta = input.nextLine();

        while (resposta.charAt(0) != 'n') {

            System.out.println(
                    "Escolha alguma operação 1 - Cadastrar , 2 - Remover , 3 - Finalizar");

            int operacao = input.nextInt();

            switch (operacao) {
                case 1:

                    System.out.println("Cadastro de Atendimento" + "\n");

                    System.out.println("Digite o nome da pessoa:");

                    String nome = input.next();

                    fila.add(nome);

                    System.out.println("Lista de Atendimentos em ordem de chegada(da esquerda para direita): " + "\n");

                    System.out.println("Fila inicial: " + fila);

                    break;

                case 2:

                    System.out.println("Remoção de Atendimento" + "\n");

                    String removido = fila.remove();
                    System.out.println("Atendimento removido: " + removido);

                    break;

                case 3:

                    resposta = "n";

                    break;

                default:

                    System.out.println("Opção Inválida");

                    resposta = "n";

                    break;

            }

        }

        input.close();

    }

}
