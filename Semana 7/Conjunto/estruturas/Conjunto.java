package estruturas;
public class Conjunto implements Lista{
    private NoLista inicio = null;
    private int qtdItens = 0;

    public static class NoLista{
        int numero;
        NoLista prox = null;

        public NoLista(int numero) {
            this.numero = numero;
        }

    }
    public NoLista getLista(){
        return this.inicio;
    }
    public int getQtd(){
        return this.qtdItens;
    }
    @Override
    public void adicionar(int numero) {
        for(NoLista atual = this.inicio; atual != null; atual = atual.prox)
            if(atual.numero == numero) return;
        NoLista novo = new NoLista(numero);
        if(this.inicio == null)
            this.inicio = novo;
        else{
            NoLista atual = inicio;
            while(atual.prox != null)
                atual = atual.prox;
            atual.prox = novo;
        }
        this.qtdItens++;
    }
    @Override
    public void remover(int numero) {
        if(this.inicio == null) return;

        NoLista atual = inicio, anterior = null;
        while(atual != null && atual.numero != numero){
            anterior = atual;
            atual = atual.prox;
        }
        if(atual == null) return;
        if(anterior == null) this.inicio = atual.prox;
        else
            anterior.prox = atual.prox;
        atual.prox = null;
        atual = null;
        this.qtdItens--;
    } 
    @Override
    public int buscar(int numero) {
        int i = 0;
        for(NoLista atual = this.inicio; atual != null; atual = atual.prox, i++)
            if(atual.numero == numero) return i;
        return -1;
    }
    @Override
    public String toString(){
        String retorno = "";
        for(NoLista atual = this.inicio; atual != null; atual = atual.prox){
            if(atual.prox == null)
                retorno += atual.numero;
            else
                retorno += atual.numero + " ";
        }
        return retorno;
    }
    public static Conjunto uniao(Conjunto a, Conjunto b){
        Conjunto retorno = new Conjunto();
        NoLista conjunto = a.getLista();
        for(int i = 0; i <= a.getQtd(); i++, conjunto = conjunto.prox)
            retorno.adicionar(conjunto.numero);
        conjunto = b.getLista();
        for(int i = 0; i <= b.getQtd(); i++, conjunto = conjunto.prox)
            retorno.adicionar(conjunto.numero);
        return retorno;
    } 
    public static Conjunto intersecao(Conjunto a, Conjunto b){
        Conjunto intersecao = new Conjunto();

        for(NoLista conjuntoA = a.getLista(); conjuntoA != null; conjuntoA = conjuntoA.prox)
            for(NoLista conjuntoB = b.getLista(); conjuntoB != null; conjuntoB = conjuntoB.prox)
                if(conjuntoA.numero == conjuntoB.numero)
                    intersecao.adicionar(conjuntoA.numero);    
        return intersecao;
    }
}
