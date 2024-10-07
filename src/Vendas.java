package src;

public class Vendas {
Produto vendaProduto;
Vendas prox;
int quantVendida;

public Vendas(Produto vp, int qv){
    this.vendaProduto = vp;
    this.quantVendida = qv;
    this.prox = null;
}

public String toString(){
    return "Código: " + vendaProduto.codigo + " Descrição: " + vendaProduto.descricao + " Quantidade vendida: " +quantVendida;
}
}
