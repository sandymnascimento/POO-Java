package navegador;
public abstract class AbaNavegador {
    protected String titulo;
    private static int ind = 0;
    static String historico[] = new String[100];
    public AbaNavegador(String titulo){
        this.titulo = titulo;
    }
    public static void historicoDeAbas(String acao){
        historico[ind++] = acao;
    }
    public static String[] getHistorico(){
        if(ind == 0) return null;
        String retorno[] = new String[ind];
        for(int i = 0; i < ind; i++)
            retorno[i] = historico[i];
        return retorno;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public abstract String getTipo();
}
