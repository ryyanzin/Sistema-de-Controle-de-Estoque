package model;
import java.util.ArrayList;

public class Estoque {

    private ArrayList<Produto> listaProdutos = new ArrayList<>(); //Cria uma lista de produtos

    public void listarProdutos() {

        if(listaProdutos.isEmpty()) System.out.println("Nenhum produto cadastrado!");

        else {
            for (Produto produto1 : listaProdutos) {
                produto1.exibirInfo();
            }
        }
    }

    public Produto buscarProduto(int numero) {

        for (Produto produto : listaProdutos) {
            if (produto.getNumero() == numero) return produto;
        }

        System.out.println("Produto não encontrado!");
        return null;

    }

    public void adicionarProduto(Produto produto) {

        listaProdutos.add(produto);

    }

    public void removerProduto(int numero) {

        Produto produtoEncontrado = null;

        for (Produto produto : listaProdutos) {
            if (produto.getNumero() == numero) produtoEncontrado = produto;
        }

        if (produtoEncontrado != null) {
            listaProdutos.remove(produtoEncontrado);
            System.out.println(produtoEncontrado.getNome() + " removido com sucesso!");
        }

        else { System.out.println("Produto não encontrado!"); }

    }

    public void exibirProduto() {

        if(listaProdutos.isEmpty()) System.out.println("Nenhum produto cadastrado!");

        else {
            for (Produto produto : listaProdutos) {
            produto.exibirInfo();
            }
        }
    }

}
