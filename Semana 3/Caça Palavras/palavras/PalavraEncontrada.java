package palavras;

public class PalavraEncontrada {
    private String palavra;
    private int posicao[] = new int[2], tipo, direcao;

    public PalavraEncontrada(String palavra, int i, int j, int tipo, int direcao){
        this.palavra = palavra;
        this.posicao[0] = i;
        this.posicao[1] = j;
        this.tipo = tipo;
        this.direcao = direcao;
    }
    public String getPalavra(){
        return this.palavra;
    }
    public int[] getPosicao(){
        return this.posicao;
    }
    public int getTipo(){
        return this.tipo;
    }
    public int getDirecao(){
        return this.direcao;
    }
}
