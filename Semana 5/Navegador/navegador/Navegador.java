package navegador;
public class Navegador{
    private int limiteAbas, tipo, ind = 0;
    private String titulo;
    private AbaNavegador abasAbertas[];
    
    public Navegador(int limiteAbas){
        this.limiteAbas = limiteAbas;
        abasAbertas = new AbaNavegador[limiteAbas];
    }
    public AbaNavegador abrirAba(int tipo, String titulo){
        if(ind > this.limiteAbas) return null;
        AbaNavegador novaAba;
        if(tipo == 1)
            novaAba = new AbaBuscador(titulo);
        else 
            novaAba = new AbaRedeSocial(titulo);
        abasAbertas[ind++] = novaAba;
        return novaAba;
    }
    public void fecharAba(AbaNavegador aba){
        for(int i = 0; i < this.ind; i++)
            if(aba == this.abasAbertas[i]){
                while(i < this.ind){
                    if(i == this.ind - 1)
                        this.abasAbertas[i] = null;
                    else
                        this.abasAbertas[i] = this.abasAbertas[++i];
                }
            }
    }
    public String[] getAbas(){
        String abas[] = new String[this.ind];
        for(int i = 0; i < this.ind; i++)
            abas[i] = this.abasAbertas[i].getTipo() + ' ' + this.abasAbertas[i].getTitulo();
        return abas;
    }
    public String[] getHistorico(){
        return AbaNavegador.getHistorico();
    }
}
