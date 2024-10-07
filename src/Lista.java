package src;
import java.util.Scanner;
public class Lista {
    Produto inicio;
    Produto ultimo;
    Scanner ler = new Scanner(System.in);
    public boolean vazia(){
        if(inicio == null){
            return true;
        }else{
            return false;
        }
    }
    public void inserir(Produto novo){ //INSERIR ELEMENTOS EM UMA LISTA.
        if(vazia()){
            inicio = novo;
            ultimo =  novo;
        }else{
            ultimo.prox = novo;
            ultimo = novo;
        }
    }
    public void mostrar(){
        if(vazia()){
            System.out.println("Está vazia"); //MOSTRAR ELEMENTOS EM UMA LISTA.
        }else{
            Produto aux = inicio;
            while(aux != null){
                System.out.println(aux);
                aux = aux.prox;
            }
        }
    }
    public void addProduto(RegistrarEstoque estoque){
        System.out.println("Insira o código: ");
        int codigo = ler.nextInt();
        System.out.println("Insira a descrição do produto: ");
        String descricao = ler.next();
        System.out.println("Insira a marca do produto: ");
        String marca = ler.next();
        System.out.println("Insira o valor de entrada: ");
        double valordeEntrada = ler.nextDouble();
        System.out.println("Insira o valor de saída: ");
        double valordeSaida = ler.nextDouble();
        System.out.println("Insira a quantidade no estoque: ");
        int qtdEstoque = ler.nextInt();


        Produto novo = new Produto(codigo, descricao, marca, valordeEntrada, valordeSaida, qtdEstoque);
        inserir(novo);
        Estoque estoque1 =  new Estoque(new Produto(codigo, descricao, marca, valordeEntrada, valordeSaida, qtdEstoque), qtdEstoque, "Entrada");
        estoque.inserir(estoque1);
    }
    public void ordenar(){ //ORDENAR SEMELHANTE A BUBBLE SORT
        Produto aux1 = inicio;
        while(aux1 != ultimo){
            Produto aux2 = aux1.prox;
            while(aux2 != null){
                if(aux1.descricao.compareTo(aux2.descricao) > 0){
                    troca(aux1, aux2);//CHAMO O MÉTODO TROCA CASO NÃO ESTEJA EM ORDEM ALFABÉTICA
                }
                aux2 = aux2.prox;
            }
            aux1 = aux1.prox;
        }
        mostrar();
    }
    public static void troca(Produto aux1, Produto aux2){//MÉTODO APENAS PARA TROCAR
        int tempCod;
        String tempDesc;
        String tempMar;
        double tempEnt;
        double tempSai;
        int tempQtd;

        tempCod = aux1.codigo;
        aux1.codigo = aux2.codigo;
        aux2.codigo = tempCod;

        tempDesc = aux1.descricao;
        aux1.descricao = aux2.descricao;
        aux2.descricao = tempDesc;

        tempMar = aux1.marca;
        aux1.marca = aux2.marca;
        aux2.marca = tempMar;

        tempEnt = aux1.valorEntrada;
        aux1.valorEntrada = aux2.valorEntrada;
        aux2.valorEntrada = tempEnt;

        tempSai = aux1.valorSaida;
        aux1.valorSaida = aux2.valorSaida;
        aux2.valorSaida = tempSai;

        tempQtd = aux1.qtdEstoque;
        aux1.qtdEstoque = aux2.qtdEstoque;
        aux2.qtdEstoque = tempQtd;

    }
    public void reporEst(RegistrarEstoque estoque){
        if(vazia()){
            System.out.println("Está vazia");
        }else {
            Produto aux = inicio;
            System.out.println("Digite o código para repor: ");
            int cod2 = ler.nextInt();
            while(aux != null){
                if(cod2 == aux.codigo){
                    System.out.println("Insira a quantidade para repor: ");
                    int reporEst = ler.nextInt();
                    aux.qtdEstoque += reporEst;
                    Estoque estoque1 =  new Estoque(new Produto(aux.codigo, aux.descricao, aux.marca, aux.valorEntrada, aux.valorSaida, aux.qtdEstoque), reporEst, "Entrada");
                    estoque.inserir(estoque1);
                    break;
                }
                aux = aux.prox;
            }
            if(aux == null){
                System.out.println("PRODUTO NÃO EXISTE!!");
            }
        }
    }
    public void vender(RegistroVendas vendas, RegistrarEstoque estoque){
        if(vazia()){
            System.out.println("Está vazia ");
        }else{
            Produto aux = inicio;
            System.out.println("Digite o código para venda: ");
            int cod2 = ler.nextInt();
            while(aux != null){
                if(cod2 == aux.codigo){ //PROCURA ATRAVÉS DO CÓDIGO
                    System.out.println("Insira a quantidade que deseja vender: ");
                    int venderEst = ler.nextInt();
                    aux.qtdEstoque -= venderEst;
                    Vendas venda =  new Vendas(new Produto(aux.codigo, aux.descricao, aux.marca, aux.valorEntrada, aux.valorSaida, aux.qtdEstoque), venderEst);
                    vendas.inserir(venda);
                    Estoque estoque1 =  new Estoque(new Produto(aux.codigo, aux.descricao, aux.marca, aux.valorEntrada, aux.valorSaida, aux.qtdEstoque), venderEst, "Saída");
                    estoque.inserir(estoque1);
                    break;
                }
                aux = aux.prox;
            }
            if(aux == null) {
                System.out.println("PRODUTO NÃO EXISTE!!");
            }
        }
    }
    public void alterar(){
        if(vazia()){
            System.out.println("Está vazia");
        }else{
            Produto aux = inicio;
            System.out.println("Indique a % para alterar o preço: ");
            double porcentagem = ler.nextDouble();
            while (aux != null){
                aux.valorSaida *= porcentagem/100;
                aux = aux.prox;
            }
        }
    }
}
