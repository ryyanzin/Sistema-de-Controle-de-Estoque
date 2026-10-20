package model;
import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private Estoque estoque;

    public Menu(Scanner scanner, Estoque estoque) {
        this.scanner = scanner;
        this.estoque = estoque;
    }

    public void exibirMenu() {

        int opcaoMenu;

        do {

            System.out.println("---Menu Principal---");
            System.out.println("1- Controle de Produtos");
            System.out.println("0- Sair");
            opcaoMenu = scanner.nextInt();

            switch(opcaoMenu) {

                case 1:
                    controlarProdutos();
                    break;
                case 0:
                    System.out.println("Sistema encerrado!\n");
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }

        } while (opcaoMenu != 0);

    }

    void controlarProdutos() { //Não precisa ser public já que só é chamado pela própria classe

        int opcaoProduto;

        do {

        System.out.println("Controle de Produtos:");
        System.out.println("1- Listar Produtos");
        System.out.println("2- Adicionar Produto");
        System.out.println("3- Remover Produto");
        System.out.println("0- Voltar");
        opcaoProduto = scanner.nextInt();

        switch(opcaoProduto) {

            case 1:
                estoque.listarProdutos();
                break;
            case 2:
                System.out.println("Informe o nome do produto:");
                scanner.nextLine();
                String nome = scanner.nextLine();
                System.out.println("Informe o número do produto:");
                int numero = scanner.nextInt();
                System.out.println("Informe a quantidade de produtos no estoque:");
                int quantidade = scanner.nextInt();
                Produto produto = new Produto (nome, numero, quantidade);
                estoque.adicionarProduto(produto);
                System.out.println("Produto " + nome + " adicionado com sucesso!\n");
                break;
            case 3:
                System.out.println("Removendo produtos...\n");
                break;
            case 0:
                System.out.println("Voltando ao Menu Principal...\n");
                break;
            default:
                System.out.println("Opção inválida!");

        }

    } while (opcaoProduto != 0);

}

}

