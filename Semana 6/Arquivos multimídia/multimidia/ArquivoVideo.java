package multimidia;
public class ArquivoVideo extends ArquivoMultimidia{
    private int largura, altura;
    public ArquivoVideo(String nomeArquivo, int largura, int altura) {
        super(nomeArquivo);
        this.largura = largura;
        this.altura = altura;
    }
    @Override
    public String toString() {
        return "Video: " + super.getNomeArquivo() + " (" + this.largura + " x " + this.altura + ")";
    }
}
