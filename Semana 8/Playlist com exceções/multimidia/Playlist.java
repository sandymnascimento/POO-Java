package multimidia;

public class Playlist {
    private ArquivoMultimidia playlist[] = new ArquivoMultimidia[10];
    private int limite = 0;

    public void adicionarItem(ArquivoMultimidia arquivo) throws QuantidadeLimiteArquivos {
        if (limite > 9)
            throw new QuantidadeLimiteArquivos();
        this.playlist[this.limite++] = arquivo;
    }

    public void renomearItem(int indiceArquivo, String novoNomeArquivo) throws IndiceArquivoInvalido {
        if (indiceArquivo >= limite || indiceArquivo < 0)
            throw new IndiceArquivoInvalido(indiceArquivo);
        this.playlist[indiceArquivo].setNomeArquivo(novoNomeArquivo);
    }

    public void moverParaInicio(int indiceArquivo) throws IndiceArquivoInvalido {
        if (indiceArquivo >= limite || indiceArquivo < 0)
            throw new IndiceArquivoInvalido(indiceArquivo);
        ArquivoMultimidia copy = this.playlist[indiceArquivo];
        for (int i = indiceArquivo; i >= 0; i--) {
            if (i == 0)
                this.playlist[i] = copy;
            else
                this.playlist[i] = this.playlist[i - 1];
        }
    }

    public String[] listarArquivos() {
        String nomeDosArquivos[] = new String[this.limite];
        for (int i = 0; i < this.limite; i++)
            nomeDosArquivos[i] = this.playlist[i].toString();
        return nomeDosArquivos;
    }

    public void ordenarArquivos(int tipo) {
        ArquivoMultimidia tmp;
        if(tipo == 1){
            for(int i = 0; i < limite - 1; i++){
                for(int j = 0; j < limite - i - 1; j++){
                    int comparacao = this.playlist[j].getNomeArquivo().compareTo(this.playlist[j + 1].getNomeArquivo());
                    if(comparacao < 0)
                        continue;
                    else if(comparacao > 0){
                        tmp = this.playlist[j+1];
                        this.playlist[j+1] = this.playlist[j];
                        this.playlist[j] = tmp;
                    }
                    else{
                        if(this.playlist[j].getTamanhoArquivo() > this.playlist[j+1].getTamanhoArquivo()){
                            tmp = this.playlist[j];
                            this.playlist[j] = this.playlist[j+1];
                            this.playlist[j+1] = tmp;
                        }
                    }
                }
            }
        }
        else if(tipo == 2){
            for(int i = 0; i < limite - 1; i++){
                for(int j = 0; j < limite - i - 1; j++){
                    if(this.playlist[j].getTamanhoArquivo() > this.playlist[j+1].getTamanhoArquivo()){
                        tmp = this.playlist[j];
                        this.playlist[j] = this.playlist[j+1];
                        this.playlist[j+1] = tmp;
                    }
                    else if(this.playlist[j].getTamanhoArquivo() == this.playlist[j+1].getTamanhoArquivo()){
                        int comparacao = this.playlist[j].getNomeArquivo().compareTo(this.playlist[j + 1].getNomeArquivo());
                        if(comparacao < 0)
                            continue;
                        else if(comparacao > 0){
                            tmp = this.playlist[j+1];
                            this.playlist[j+1] = this.playlist[j];
                            this.playlist[j] = tmp;
                        }
                    }
                }
            }
        }
    }
}

class QuantidadeLimiteArquivos extends Exception {
    public QuantidadeLimiteArquivos(){
        super("Quantidade limite de arquivos foi atingida.");
    }
}

class IndiceArquivoInvalido extends Exception {
    public IndiceArquivoInvalido(int indiceArquivo){
        super("Indice de arquivo invalido = " + indiceArquivo);
    }
}