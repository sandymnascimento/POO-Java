package relatorio;
public class TextoTitulo implements PluginTexto {
    private String titulo;
    public TextoTitulo(String titulo){
        this.titulo = titulo;
    }
    public String aplicar(String texto) {
        return "(TITULO: " + this.titulo + ") " + texto;
    }
}
