import model.*;
import java.util.Scanner;

void main() {

    Scanner scanner = new Scanner(System.in); //Exibe o menu
    Estoque estoque = new Estoque();

    Menu menu = new Menu(scanner, estoque);
    menu.exibirMenu(); //Cria um objeto menu e chama o metodo para exibir

}