package src;

public class Produto{
    int codigo;
    String descricao;
    String marca;
    double valorEntrada;
    double valorSaida;
    int qtdEstoque;
    Produto prox;

    public Produto(int codigo, String descricao, String marca, double valorEntrada, double valorSaida, int qtdEstoque){
        this.codigo = codigo;
        this.descricao = descricao;
        this.marca = marca;
        this.valorEntrada = valorEntrada;
        this.valorSaida = valorSaida;
        this.qtdEstoque =  qtdEstoque;
        this.prox = null;
    }

    public String toString(){
        return "Código: " + codigo + " Descrição: " +descricao+ " Marca: " +marca+ " Valor Entrada: R$" +valorEntrada+ " Valor Saída: R$"+valorSaida+ " Quantidade no estoque:"+qtdEstoque;
    }
}