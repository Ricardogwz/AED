import java.util.Scanner;
import java.util.Vector;

public class Exercise02 {

    /*
     * @author Ricardo Grziwotz Júnior
     */

    /*
     * Utilizando um Vector, crie um algoritmo com as seguintes funcionalidades:
     * 
     * Cadastrar (Não poderá haver registros iguais).
     * Selecionar todos os registros.
     * Realizar uma pesquisa através de um termo (Se o nome possui A, por exemplo).
     * Alterar dados (Realize uma validação para garantir que será alterado).
     * Remoção (Realize uma validação para garantir que será removido).
     * 
     * Essa estrutura ficará em uma estrutura de repetição e poderão ser registradas
     * inúmeras informações.
     * 
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Vector<String> v = new Vector<>();

        System.out.println("Deseja realizar alguma operação?");

        String resposta = input.nextLine();

        while (resposta.charAt(0) != 'n') {

            System.out.println(
                    "Escolha alguma operação 1 - Cadastrar , 2 - Selecionar , 3 - Pesquisar , 4 - Alterar , 5 Remover");

            int operacao = input.nextInt();

            switch (operacao) {
                case 1:

                    System.out.println("--Cadastro--");

                    System.out.println("Digite o nome a ser cadastrado: ");

                    String nome = input.next();

                    if (!v.contains(nome)) {

                        v.add(nome);

                        System.out.println("Nome adicionado com sucesso!");

                    } else {

                        System.out.println("Nome já se encontra no vector , por favor digite outro nome!");

                        String novonome = input.next();

                        v.add(novonome);

                        System.out.println("Nome adicionado com sucesso!");

                    }

                    break;

                case 2:

                    System.out.println("Os elementos do vector são: " + v);

                    break;

                case 3:

                    System.out.println("--Pesquisa--");

                    System.out.println("Digite o termo a ser pesquisado no vector");

                    String termo = input.next();

                    boolean encontrado = false;

                    for (String temp : v) {
                        if (temp.toLowerCase().contains(termo.toLowerCase())) {
                            System.out.println("Nome "+ temp +  " foi encontrado no vector com sucesso" );
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Nome não encontrado no vetor.");
                    }

                    break;

                case 4:

                    System.out.println("--Alteração de nome--");

                    System.out.println("Digite o nome a ser alterado: ");

                    String nomea = input.next();

                    if (v.contains(nomea)) {

                        v.remove(nomea);

                        System.out.println("Digite o novo nome: ");

                        String nomen = input.next();

                        v.add(nomen);

                        System.out.println("Nome alterado com sucesso!");

                    } else {

                        System.out.println("Nome não se encontra no vector!");

                    }

                    break;

                case 5:

                    System.out.println("--Remoção de nome--");

                    System.out.println("Digite o nome a ser removido: ");

                    String nomer = input.next();

                    if (v.contains(nomer)) {

                        v.remove(nomer);

                        System.out.println("Nome removido com sucesso!");

                    } else {

                        System.out.println("Nome não se encontra no vector!");

                    }

                    break;

                case 6:

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
