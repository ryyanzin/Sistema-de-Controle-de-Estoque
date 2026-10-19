import model.*;

void main() {

    Produto produto = new Produto(
            "Arroz",
            1,
            24); //Cria um novo produto

    Menu menu = new Menu(produto); // Cria um novo menu utilizando o produto como parametro
    menu.exibirMenu(); //Exibe o menu

}