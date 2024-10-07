package src;

public class RegistrarEstoque {
    Estoque inicio;
    Estoque ultimo;
    public boolean vazia(){
        if(inicio == null){
            return true;
        }else{
            return false;
        }
    }
    public void inserir(Estoque novo){
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
            System.out.println("Está vazia");
        }else{
            Estoque aux = inicio;
            while(aux != null){
                System.out.println(aux);
                aux = aux.prox;
            }
        }
    }
}
