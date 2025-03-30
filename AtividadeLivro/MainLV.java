import java.util.ArrayList;
import java.util.Scanner;

public class MainLV {
    public static void main(String[] args) {
        
        ArrayList<Livro> livros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        
        do {
            System.out.println("===== Sistema de Cadastro de Livros =====");
            System.out.println("1. Adicionar um novo livro");
            System.out.println("2. Listar todos os livros cadastrados");
            System.out.println("3. Alterar as informações de um livro");
            System.out.println("4. Remover um livro");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                   
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o ano de publicação: ");
                    int anoPublicacao = scanner.nextInt();
                    System.out.print("Digite o preço do livro: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine(); // Limpar buffer do scanner

                    Livro novoLivro = new Livro(titulo, autor, anoPublicacao, preco);
                    livros.add(novoLivro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    
                    if (livros.isEmpty()) {
                        System.out.println("Não há livros cadastrados.");
                    } else {
                        for (Livro livro : livros) {
                            livro.exibirInformacoes();
                        }
                    }
                    break;

                case 3:
                    
                    System.out.print("Digite o título do livro que deseja alterar: ");
                    String tituloAlterar = scanner.nextLine();
                    Livro livroEncontrado = null;

                    for (Livro livro : livros) {
                        if (livro.getTitulo().equalsIgnoreCase(tituloAlterar)) {
                            livroEncontrado = livro;
                            break;
                        }
                    }

                    if (livroEncontrado != null) {
                        System.out.println("Livro encontrado! Informe as novas informações:");
                        System.out.print("Novo título: ");
                        livroEncontrado.setTitulo(scanner.nextLine());
                        System.out.print("Novo autor: ");
                        livroEncontrado.setAutor(scanner.nextLine());
                        System.out.print("Novo ano de publicação: ");
                        livroEncontrado.setAnoPublicacao(scanner.nextInt());
                        System.out.print("Novo preço: ");
                        livroEncontrado.setPreco(scanner.nextDouble());
                        scanner.nextLine(); // Limpar buffer
                        System.out.println("Livro atualizado com sucesso!");
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 4:
                    
                    System.out.print("Digite o título do livro que deseja remover: ");
                    String tituloRemover = scanner.nextLine();
                    Livro livroARemover = null;

                    for (Livro livro : livros) {
                        if (livro.getTitulo().equalsIgnoreCase(tituloRemover)) {
                            livroARemover = livro;
                            break;
                        }
                    }

                    if (livroARemover != null) {
                        livros.remove(livroARemover);
                        System.out.println("Livro removido com sucesso!");
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 5:
                    
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}