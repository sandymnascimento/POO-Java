package relatorio;
public class ImpressaoLimiteLargura  implements PluginImpressao {
    private int largura;

    public ImpressaoLimiteLargura(int largura){
        this.largura = largura;
    }
    @Override
    public void imprimir(Relatorio r) {
        String txt = r.getTexto(); 
        int tamTexto = txt.length(), tamFrase, tamPalavra, inicioFrase, ind = 0;
        while(ind < tamTexto){
            inicioFrase = ind;
            tamFrase = 0;
            tamPalavra = 0;
            while(ind < tamTexto && tamPalavra + tamFrase - 1 <= this.largura){ // && inicioFrase + tamPalavra < tamTexto
                tamFrase += tamPalavra;
                tamPalavra = 0;
                while(txt.charAt(ind++) != ' '){
                    tamPalavra++;
                    if(ind >= tamTexto)
                        break;
                }
                if(ind < tamTexto && txt.charAt(ind) == ' ')
                    tamPalavra++;
            }
            if(inicioFrase + tamPalavra == tamTexto) tamFrase += tamPalavra;
            ind = inicioFrase + tamFrase;
            if(txt.charAt(inicioFrase + tamFrase - 1) == ' ') tamFrase--;
            char vetor[] = new char[tamFrase];
            for(int i = 0; i < tamFrase; i++, inicioFrase++)
                vetor[i] = txt.charAt(inicioFrase);
            String impressao = new String(vetor);
            Impressao.imprimirLinha(impressao);
        }
    }  
}
