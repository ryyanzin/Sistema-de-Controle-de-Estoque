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

    public void adicionarProduto(Produto produto) {

        listaProdutos.add(produto);

    }

}
