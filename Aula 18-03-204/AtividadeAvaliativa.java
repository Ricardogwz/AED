import java.util.LinkedList;
import java.util.Scanner;

public class AtividadeAvaliativa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedList<Tarefa> listaDeTarefas = new LinkedList<>();

        System.out.println("Desejas realizar alguma operação na lista?");

        String resposta = input.next();

        while (resposta.charAt(0) != 'n') {

            System.out.println(
                    "Escolha alguma operação 1 - Cadastrar uma tarefa , 2 - Concluir uma tarefa,  3 - Visualizar a próxima tarefa ,  4 - Finalizar ");

            int operacao = input.nextInt();
            switch (operacao) {

                case 1:

                    System.out.println("Digite a descrição da tarefa: ");

                    String desc = input.next();

                    Tarefa t = new Tarefa(desc, false);

                    listaDeTarefas.add(t);

                    System.out.println("Tarefa adicionada na lista com sucesso!");

                    break;

                case 2:

                    System.out.println("Digite a descrição da tarefa concluída: ");

                    String descc = input.next();

                    for (Tarefa tarefa : listaDeTarefas) {
                        if (tarefa.getDesc().equals(descc)) {
                            tarefa.setStatus(true);
                            System.out.println("Tarefa " + tarefa.getDesc() + " foi concluída!");
                            listaDeTarefas.remove(tarefa);

                        }
                    }

                    break;

                case 3:

                    System.out.println("A próxima tarefa da lista é: " + listaDeTarefas.peek());

                    break;

                case 4:

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
