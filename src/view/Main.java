import model.Produto;
import java.util.Scanner;

void main() {

    Produto produto = new Produto(
            "Arroz",
            1,
            24);

    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
    System.out.println("---Menu---");
    System.out.println("1- Informações do Produto");
    System.out.println("2- Adicionar Estoque");
    System.out.println("3- Remover Estoque");
    System.out.println("0- Sair");
    opcao = scanner.nextInt();

    switch(opcao) {

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
            System.out.println("Sistema encerrado!");
            break;
        default:
            System.out.println("Opção inválida!");
    }

    } while (opcao != 0);

}