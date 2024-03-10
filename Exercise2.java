import java.util.Scanner;

public class Exercise2 {

    /*
     * // Enunciado
     * Utilizando um array estático de dez posições, desenvolva um algoritmo com as
     * seguintes funcionalidades:
     * 
     * Cadastrar;
     * Listar todos os nomes;
     * Alterar;
     * Remover;
     * Finalizar.
     * 
     * Essa estrutura ficará em um laço de repetição.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[10];

        System.out.println("Deseja realizar alguma operação na lista?");

        String resposta = input.nextLine();

        while (resposta.charAt(0) != 'n') {

            System.out.println(
                    "Escolha alguma operação 1 - Cadastrar , 2 - Listar , 3 - Alterar , 4 - Remover , 5 - Finalizar");

            int operacao = input.nextInt();

            switch (operacao) {
                case 1:

                    System.out.println("Digite os nomes:");

                    for (int i = 0; i < nomes.length; i++) {

                        String nome = input.next();
                        nomes[i] = nome;

                    }

                    break;

                case 2:

                    for (int i = 0; i < nomes.length; i++) {

                        if (nomes[i] != "") {
                            System.out.println("Lista de nomes [" + i + "] = " + nomes[i]);
                        }
                    }

                    break;

                case 3:

                    System.out.println("Informe o nome que desejas alterar");
                    String nomea = input.next();
                    System.out.println("Digite o novo nome");
                    String novonome = input.next();
                    boolean encontrado = false;

                    for (int i = 0; i < nomes.length; i++) {
                        if (nomea.equals(nomes[i])) {

                            nomes[i] = novonome;

                            encontrado = true;
                            System.out.println("Nome alterado com sucesso!");

                        }
                    }

                    if (!encontrado) {
                        System.out.println("Nome não encontrado na lista.");
                    }

                    break;

                case 4:

                    System.out.print("Informe o nome a ser excluído: ");
                    String nomer = input.next();
                    encontrado = false;

                    for (int i = 0; i < nomes.length; i++) {
                        if (nomer.equals(nomes[i])) {
                            nomes[i] = "";
                            encontrado = true;
                            System.out.println("Nome removido da lista com sucesso!");
                            break; 
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Nome não encontrado na Lista.");
                    }

                    break;

                case 5:

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
