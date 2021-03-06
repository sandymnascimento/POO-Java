package multimidia;

public class ArquivoAudio extends ArquivoMultimidia implements Cloneable{
    private boolean audioHD;
    public ArquivoAudio(String nomeArquivo, boolean audioHD) {
        super(nomeArquivo);
        this.audioHD = audioHD;
    }
    @Override
    public String toString() {
        return "Audio: " + super.getNomeArquivo() + " (HD = " + this.audioHD + ")";
    }
    @Override
    public ArquivoAudio clone() throws CloneNotSupportedException {
        ArquivoAudio cloneArquivo = (ArquivoAudio) super.clone();
        return cloneArquivo;
    }
}
