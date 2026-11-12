package model;
import java.util.Scanner;

public class Produto {

    Scanner scanner = new Scanner(System.in);
    private String nome;
    private int numero;
    private int estoque;

    public Produto(String nome, int numero, int estoque) {

        this.nome = nome;
        if(numero > 0)this.numero = numero;
        if(estoque > 0)this.estoque = estoque;

    }

    //getter

    public String getNome() { return nome; }
    public int getNumero() { return numero; }
    public int getEstoque() { return estoque; }

    public void adicionarEstoque() {

        System.out.println("Quantos produtos deseja adicionar no estoque de " + nome + "?");
        int quantidade = scanner.nextInt();

        if (quantidade > 0) {
            estoque = estoque + quantidade;
            System.out.println("Estoque atualizado!\n");
        }

        else { System.out.println("Quantidade menor ou igual a zero. Tente de novo inserindo uma quantidade correta!"); }

    }

    public void removerEstoque() {

        System.out.println("Quantos produtos deseja remover do estoque de " + nome + "?");
        int quantidade = scanner.nextInt();

        if (quantidade > 0) {
            estoque = estoque - quantidade;
            System.out.println("Estoque atualizado!\n");
        }

        else { System.out.println("Quantidade menor ou igual a zero. Tende de novo inserindo uma quantidade correta!"); }

    }

    public void alterarNome() {

        System.out.println("Qual nome deseja adicionar ao produto " + nome + "?");
        String nomeAlterado = scanner.nextLine();

        if (nomeAlterado != nome){
            nome = nomeAlterado;
            System.out.println("Nome alterado com sucesso!\n");
        }

        else System.out.println("Nome idêntico ao anterior.\n");

    }

    public void alterarNumero() {

        System.out.println("Qual número deseja adicionar no produto " + nome + "?");
        int numeroAlterado = scanner.nextInt();

        if (numeroAlterado != numero && numeroAlterado > 0) {
            numero = numeroAlterado;
            System.out.println("Número do produto " + nome + " alterado com sucesso!\n");
        }

        else System.out.println("Número idêntico ao anterior ou inválido!\n");

    }

    public void exibirInfo() { System.out.println("\nNome: " + nome + "\nNúmero: " + numero + "\nEstoque: " + estoque + "\n"); }

}
