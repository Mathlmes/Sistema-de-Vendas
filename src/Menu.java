package src;

import java.util.Scanner;

public class Menu {

    public static void getMenu(){
        System.out.println("""
                ========================
                ========================
                 ==>      Menu      <==
                       FARMA MED 
                ========================
                ========================
                Selecione uma opção:
                1- Adicionar produto
                2- Mostrar produtos
                3- Ordenar por nome
                4- Repor estoque
                5- Vender produto
                6- Aplicar alteração de preços em todos os produtos
                7- Mostrar relatório de venda
                8- Mostrar relatório de estoque
                0- Sair
                ========================
                ========================
                """);
    }

    public static void getOpcoes(Lista lista, RegistroVendas vendas, RegistrarEstoque estoque){
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        int opcao = ler.nextInt();
        while(opcao != 0){
            switch (opcao){
                case 1:
                    lista.addProduto(estoque);
                    break;
                case 2:
                    lista.mostrar();
                    break;
                case 3:
                    lista.ordenar();
                    break;
                case 4:
                    lista.reporEst(estoque);
                    break;
                case 5:
                    lista.vender(vendas, estoque);
                    break;
                case 6:
                    lista.alterar();
                    break;
                case 7:
                    vendas.mostrar();
                    break;
                case 8:
                    estoque.mostrar();
                    break;
            }
            System.out.println("Escolha uma opção: ");
            opcao = ler.nextInt();
        }
    }
}

