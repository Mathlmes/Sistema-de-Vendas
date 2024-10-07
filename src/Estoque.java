package src;

public class Estoque {
    Produto est;
    int quantAlterada;
    String operacao;
    Estoque prox;
    public Estoque(Produto est, int qa, String operacao){
        this.est = est;
        this.quantAlterada = qa;
        this.operacao = operacao;
        this.prox = null;
    }

    public String toString(){
        return "Código: " +est.codigo+ " Descrição: " + est.descricao + " Quantidade alterada (E/S): "+ quantAlterada + " Quantidade no estoque: "+ est.qtdEstoque +" Operação: " +operacao;
    }



}
