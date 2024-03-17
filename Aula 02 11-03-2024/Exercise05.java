import java.util.HashMap;
import java.util.Scanner;

public class Exercise05 {

    private static HashMap<String, Aluno> alunos = new HashMap<>();
    private static HashMap<String, Integer> contadorPorCurso = new HashMap<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Desejas realizar alguma operação na lista?");

        String resposta = input.next();

        while (resposta.charAt(0) != 'n') {

            System.out.println(
                    "Escolha alguma operação 1 - Cadastrar , 2 - Listar ,  3 - Alterar , 4 - Remover , 5 - Finalizar ");

            int operacao = input.nextInt();
            switch (operacao) {

                case 1:

                    System.out.println("--CADASTRO--");

                    System.out.println("Digite o nome do aluno: ");

                    String nome = input.next();

                    System.out.println("Digite o curso do aluno");

                    String curso = input.next();

                    Aluno a = new Aluno(nome, curso);

                    alunos.put(nome, a);

                    contadorPorCurso.put(curso, contadorPorCurso.getOrDefault(curso, 0) + 1);

                    break;

                case 2:

                    System.out.println("--LEITURA--");

                    for (Aluno aluno : alunos.values()) {
                        System.out.println("Nome: " + aluno.getNome());
                        System.out.println("Curso: " + aluno.getCurso());
                        System.out.println("Quantidade de alunos no curso " + aluno.getCurso() + ": " +
                                contadorPorCurso.getOrDefault(aluno.getCurso(), 0));
                    }
                    break;

                case 3:

                    System.out.println("--ALTERAÇÃO--");

                    System.out.println("Digite o nome do aluno a ser alterado: ");
                    String nomeAlunoAAlterar = input.next();

                    if (alunos.containsKey(nomeAlunoAAlterar)) {
                        Aluno alunoAAlterar = alunos.get(nomeAlunoAAlterar);
                        String cursoAntigo = alunoAAlterar.getCurso();

                        System.out.println("Digite o novo nome do aluno: ");
                        String novoNome = input.next();

                        System.out.println("Digite o novo curso do aluno: ");
                        String novoCurso = input.next();

                        alunos.remove(nomeAlunoAAlterar);
                        contadorPorCurso.put(cursoAntigo, contadorPorCurso.getOrDefault(cursoAntigo, 0) - 1);

                        alunoAAlterar.setNome(novoNome);
                        alunoAAlterar.setCurso(novoCurso);

                        alunos.put(novoNome, alunoAAlterar);
                        contadorPorCurso.put(novoCurso, contadorPorCurso.getOrDefault(novoCurso, 0) + 1);

                        System.out.println("Aluno alterado com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("--REMOÇÃO--");
                    System.out.println("Digite o nome do aluno a ser removido: ");

                    String nomer = input.next();

                    excluir(nomer);

                    break;

                case 5:

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

    public static boolean excluir(String nome) {
        Aluno alunoRemovido = alunos.remove(nome);
        if (alunoRemovido != null) {

            String cursoRemovido = alunoRemovido.getCurso();
            contadorPorCurso.put(cursoRemovido, contadorPorCurso.get(cursoRemovido) - 1);
            return true;
        }
        return false;
    }

}
