import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> nomes = new LinkedList<>();

        System.out.println("Desejas realizar alguma operação na lista?");

        String resposta = input.next();

        while (resposta.charAt(0) != 'n') {

            System.out.println(
                    "Escolha alguma operação 1 - Cadastrar , 2 - Listar , 3 - Finalizar ");

            int operacao = input.nextInt();
            switch (operacao) {

                case 1:

                    System.out.println("--CADASTRO--");

                    System.out.println("Digite o nome da Pessoa: ");

                    String nome = input.next();

                    nomes.add(nome);

                    break;

                case 2:

                    System.out.println("--LEITURA--");

                    for (String s : nomes) {
                        System.out.println(s);
                    }

                    break;

                case 3:

                    resposta = "n";

                    break;

                default:

                    System.out.println("Opção inválida!");

                    resposta = "n";

                    break;

            }

        }

        input.close();

    }
}
