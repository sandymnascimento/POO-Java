package relatorio;
public class TextoData implements PluginTexto {
    private String data;
    public TextoData(int dia, int mes, int ano){
        data = dia + "/" + mes + "/" + "ano";
    }
    public String aplicar(String texto){
        return texto + " (DATA: " + this.data + ")";
    }
}
