package multimidia;

public class ArquivoVideo extends ArquivoMultimidia implements Cloneable{
    private int largura, altura;
    public ArquivoVideo(String nomeArquivo, int largura, int altura) {
        super(nomeArquivo);
        this.largura = largura;
        this.altura = altura;
    }
    public String toString() {
        return "Video: " + super.getNomeArquivo() + " (" + this.largura + " x " + this.altura + ")";
    }
    @Override
    public ArquivoVideo clone() throws CloneNotSupportedException {
        ArquivoVideo cloneArquivo = (ArquivoVideo) super.clone();
        return cloneArquivo;
    }
}
