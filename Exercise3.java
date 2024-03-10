import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Produto> listaProdutos = new ArrayList<>();

        System.out.println("Desejas realizar alguma operação na lista?");

        String resposta = input.next();

        while (resposta.charAt(0) != 'n') {

            System.out.println(
                    "Escolha alguma operação 1 - Cadastrar , 2 - Listar , 3 - Pesquisar , 4 - Alterar , 5 - Remover , 6 - Finalizar ");

            int operacao = input.nextInt();

            switch (operacao) {
                case 1:

                    System.out.println("Cadastro de Produtos" + "\n");

                    System.out.println("Digite o nome do produto:");

                    String nome = input.next();

                    System.out.println("Digite o preco do produto:");

                    double preco = input.nextDouble();

                    Produto p = new Produto(nome, preco);

                    listaProdutos.add(p);

                    System.out.println();

                    System.out.println("Produto adicionado na lista com sucesso");

                    break;

                case 2:

                    System.out.println("Lista de produtos:");

                    for (Produto produto : listaProdutos) {

                        System.out.println(produto.toString());
                    }

                    break;

                case 3:

                    System.out.println("Pesquisa de Produtos:");

                    System.out.println("Digite o termo a ser pesquisado:");

                    String termo = input.next();

                    for (Produto produto : listaProdutos) {

                        if (produto.getNome().equals(termo)) {
                            System.out.println("Produto encontrado " + "\n");
                            System.out.println(produto.toString());
                        } else {
                            System.out.println("Produto não encontrado");
                        }
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
                            System.out.println("Digite o novo preco do produto:");
                            double precon = input.nextDouble();

                            produto.setNome(nomen);
                            produto.setPreco(precon);

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
