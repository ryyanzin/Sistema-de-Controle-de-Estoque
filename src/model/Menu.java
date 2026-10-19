package model;
import java.util.Scanner;

public class Menu {

    private Produto produto;

    public Menu(Produto produto) {
        this.produto = produto;
    }

    public void exibirMenu() {

    int opcao;
    Scanner scanner = new Scanner(System.in);

    do {
        System.out.println("---Menu---");
        System.out.println("1- Adicionar Produto");
        System.out.println("2- Remover Produto");
        System.out.println("3- Controle de Estoque");
        System.out.println("0- Sair");
        opcao = scanner.nextInt();

        switch(opcao) {

            case 1:
                System.out.println("Funcionalidade ainda não implementada.");
                break;
            case 2:
                System.out.println("Funcionalidade ainda não implemetnada.");
                break;
            case 3:
                System.out.println();
                controlarEstoque(produto, scanner);
                break;
            case 0:
                System.out.println("Sistema encerrado!");
                break;
            default:
                System.out.println("Opção inválida!");
        }

    } while (opcao != 0);

    }

void controlarEstoque(Produto produto, Scanner scanner) {

    int opcaoEstoque;

    do {

        System.out.println("---Menu de Estoque---");
        System.out.println("1- Informações do Produto");
        System.out.println("2- Adicionar Estoque");
        System.out.println("3- Remover Estoque");
        System.out.println("0- Voltar");
        opcaoEstoque = scanner.nextInt();

        switch(opcaoEstoque) {

            case 1:
                System.out.println("Informações do Produto: ");
                produto.exibirInfo();
                break;
            case 2:
                produto.adicionarEstoque();
                produto.exibirInfo();
                break;
            case 3:
                produto.removerEstoque();
                produto.exibirInfo();
                break;
            case 0:
                System.out.println("Voltando ao Menu!");
                break;
            default:
                System.out.println("Opção inválida!");
        }

    } while (opcaoEstoque != 0);

}

}

