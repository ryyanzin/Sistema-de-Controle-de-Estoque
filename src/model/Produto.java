package model;

public class Produto {

    private String nome;
    private int numero;
    private int estoque;

    public Produto(String nome, int numero, int estoque) {

        this.nome = nome;
        this.numero = numero;
        this.estoque = estoque;

    }

    //getter

    public String getNome() { return nome; }
    public int getNumero() { return numero; }
    public int getEstoque() { return estoque; }

    //setter

    public void setNome(String nome) { this.nome = nome; }
    public void setNumero(int numero) { this.numero = numero; }
    public void setEstoque(int estoque) { this.estoque = estoque; }

    public void exibirInfo(){ System.out.println("\nNome: " + nome + "\nNúmero: " + numero + "\nEstoque: " + estoque); }

}
