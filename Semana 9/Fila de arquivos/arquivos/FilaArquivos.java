package arquivos;

public class FilaArquivos<T extends Arquivo> implements Fila<T>{
    private NoArquivos inicio = null, fim = null;
    private int qtdFila = 0, limiteFila;

    public static class NoArquivos<T>{
        T arquivo;
        NoArquivos prox = null;

        public NoArquivos(T arquivo){
            this.arquivo = arquivo;
        }
    }

    FilaArquivos(int n){
        this.limiteFila = n;
    }
    @Override
    public boolean enfileirar(T arquivo){
        if(this.qtdFila >= this.limiteFila) return false;

        NoArquivos<T> novo = new NoArquivos<T>(arquivo);
        if(this.fim != null) this.fim.prox = novo;
        this.fim = novo;
        if(this.inicio == null) this.inicio = novo;
        this.qtdFila++;
        return true;
    }
    @Override
    public T desenfileirar(){
        if(this.inicio == null) return null;

        NoArquivos<T> inicio = this.inicio;
        this.inicio = this.inicio.prox;
        T arquivo = inicio.arquivo;
        inicio = null;
        if(this.inicio == null) this.fim = null;  
        this.qtdFila--;
        return arquivo;
    }
}
