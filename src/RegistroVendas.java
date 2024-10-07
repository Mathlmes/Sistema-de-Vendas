package src;

public class RegistroVendas {
   Vendas inicio;
   Vendas ultimo;

    public boolean vazia(){
        if(inicio == null){
            return true;
        }else{
            return false;
        }
    }
    public void inserir(Vendas novo){
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
            Vendas aux = inicio;
            while(aux != null){
                System.out.println(aux);
                aux = aux.prox;
            }
        }
    }


}
