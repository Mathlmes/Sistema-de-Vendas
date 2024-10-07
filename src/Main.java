package src;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        RegistroVendas vendas = new RegistroVendas();
        RegistrarEstoque estoque =  new RegistrarEstoque();
        Menu.getMenu();
        Menu.getOpcoes(lista, vendas, estoque);

    }
}
