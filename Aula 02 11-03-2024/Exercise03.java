import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Produto> listaProdutos = new ArrayList<>();

        List<Segmento> segmentos = new ArrayList<>();

        System.out.println("Desejas realizar alguma operação na lista?");

        String resposta = input.next();

        while (resposta.charAt(0) != 'n') {

            System.out.println(
                    "Escolha alguma operação 1 - Cadastrar , 2 - Listar , 3 - Quantidade de segmentos , 4 - Alterar , 5 - Remover , 6 - Finalizar ");

            int operacao = input.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Cadastro de Produtos\n");
                    System.out.println("Digite o nome do produto:");
                    String nome = input.next();
                    System.out.println("Digite o segmento do produto:");
                    String segmentoNome = input.next();

                    boolean segmentoEncontrado = false;
                    for (Segmento s : segmentos) {
                        if (s.getNome().equals(segmentoNome)) {
                            s.incrementaQuantidade();
                            segmentoEncontrado = true;
                            break;
                        }
                    }

                    if (!segmentoEncontrado) {
                        Segmento novoSegmento = new Segmento(segmentoNome);
                        novoSegmento.incrementaQuantidade();
                        segmentos.add(novoSegmento);
                    }

                    Produto p = new Produto(nome, segmentoNome);
                    listaProdutos.add(p);
                    System.out.println("Produto adicionado na lista com sucesso");
                    break;

                case 2:

                    System.out.println("Lista de produtos:");

                    for (Produto produto : listaProdutos) {

                        System.out.println(produto.toString());
                    }

                    break;

                case 3:

                    System.out.println("Quantidade de Segmentos:");

                    for (Segmento s : segmentos) {
                        System.out.println(s.toString());
                    }

                    break;

                case 4:

                    System.out.println("Alteração de Produto" + "\n");

                    System.out.println("Digite o nome do produto a ser alterado:");

                    String nomea = input.next();

                    for (Produto produto : listaProdutos) {

                        if (produto.getNome().equals(nomea)) {
                            System.out.println("Digite o novo nome do produto:");
                            String nomen = input.next();
                            System.out.println("Digite o novo segmento do produto:");
                            String segmenton = input.next();

                            produto.setNome(nomen);
                            produto.setSegmento(segmenton);

                            System.out.println(produto.toString());
                            System.out.println("Produto Alterado com sucesso!");

                        } else {
                            System.out.println("Produto não se encontra na lista");
                        }
                    }

                    break;

                case 5:

                    System.out.println("Exclusão de produto" + "\n");

                    System.out.println("Digite o nome do produto a ser excluído:");

                    String nomee = input.next();
                    boolean removed = false;
                    for (Produto produto : listaProdutos) {
                        if (produto.getNome().equals(nomee)) {
                            listaProdutos.remove(produto);
                            System.out.println("Produto removido da lista com sucesso!");
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Produto não encontrado na lista");
                    }
                    break;

                case 6:

                    resposta = "n";
                    break;

                default:

                    System.out.println("Opção inválida");

                    break;
            }
        }

        input.close();
    }
}
