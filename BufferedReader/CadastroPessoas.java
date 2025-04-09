import java.util.List;
import java.util.Scanner;

public class CadastroPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArquivoPessoa arquivoPessoa = new ArquivoPessoa();
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar pessoa");
            System.out.println("2. Listar pessoas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    Pessoa pessoa = new Pessoa(nome, idade);
                    arquivoPessoa.salvarPessoa(pessoa);
                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;
                case 2:
                    List<Pessoa> pessoas = arquivoPessoa.listarPessoas();
                    System.out.println("\nPessoas cadastradas:");
                    System.out.println("---------------------");
                    for (Pessoa p : pessoas) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}