package multimidia;

public class Playlist implements Cloneable {
    private ArquivoMultimidia listaDeArquivos[] = new ArquivoMultimidia[100]; //ERRO
    private int ind = 0;
    public void adicionarItem(ArquivoMultimidia arquivo) {
        this.listaDeArquivos[this.ind++] = arquivo;
    }
    public void renomearItem(int indiceArquivo, String novoNomeArquivo) {
        this.listaDeArquivos[indiceArquivo].setNomeArquivo(novoNomeArquivo);    
    }
    public void moverParaInicio(int indiceArquivo) {
        ArquivoMultimidia copy = this.listaDeArquivos[indiceArquivo];
        for(int i = indiceArquivo; i >= 0; i--){
            if(i == 0)
                this.listaDeArquivos[i] = copy;
            else 
                this.listaDeArquivos[i] = this.listaDeArquivos[i - 1];
        }
    }
    public String[] listarArquivos() {
        String nomeDosArquivos[] = new String[ind];
        for(int i = 0; i < this.ind; i++)
            nomeDosArquivos[i] = this.listaDeArquivos[i].getNomeArquivo();
        return nomeDosArquivos;
    }
    public Playlist clone() throws CloneNotSupportedException {
        Playlist copiaPlaylist = (Playlist) super.clone();
        copiaPlaylist.listaDeArquivos = this.listaDeArquivos.clone();
        for(int i = 0; i < this.ind; i++)
            copiaPlaylist.listaDeArquivos[i] = this.listaDeArquivos[i].clone();
        return copiaPlaylist;
    }
}
