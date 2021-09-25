package classificacao;

public class ListaExemplos {
    private int maxQtd, ind = 0;
    private Exemplo listaExemplos[];

    public ListaExemplos(int maxQtd) {
        this.maxQtd = maxQtd;
        this.listaExemplos = new Exemplo[maxQtd];
    }
    public void adicionarExemplo(Exemplo exemplo) {
        if(ind < maxQtd)
            this.listaExemplos[ind++] = exemplo;
    }
    public void ordenarPelaDistancia(double[] atributosEntrada) {
        double distancia[] = new double[this.ind];

        for(int i = 0; i < this.ind; i++) {
            double ex[] = this.listaExemplos[i].getAtributosEntrada();
            for(int j = 0; j < atributosEntrada.length; j++)
                distancia[i] += (ex[j] - atributosEntrada[j]) * (ex[j] - atributosEntrada[j]); 
            distancia[i] = Math.sqrt(distancia[i]);
        }
        
        int indMenor;
        double tmpDistancia;
        Exemplo tmpExemplo;
        
        for(int i = 0; i < this.ind - 1; i++){
            indMenor = i;
            for(int j = i + 1; j < this.ind; j++){
                if(distancia[j] < distancia[indMenor])
                    indMenor = j;
            }
            if(indMenor != i){
                tmpDistancia = distancia[i];
                distancia[i] = distancia[indMenor];
                distancia[indMenor] = tmpDistancia;

                tmpExemplo = this.listaExemplos[i];
                this.listaExemplos[i] = this.listaExemplos[indMenor];
                this.listaExemplos[indMenor] = tmpExemplo; 
            }
        }
    }
    public int getQtdExemplos() {
        return this.ind;
    }
    public Exemplo[] getExemplos() {
        Exemplo listaRetorno[] = new Exemplo[this.ind];
        for(int i = 0; i < this.ind; i++)
            listaRetorno[i] = this.listaExemplos[i];
        return listaRetorno;
    } 
    public Exemplo[] getPrimeirosExemplos(int n) {
        Exemplo listaRetorno[] = new Exemplo[n];
        for(int i = 0; i < n; i++)
            listaRetorno[i] = this.listaExemplos[i];
        return listaRetorno;
    }
    public Exemplo[] getUltimosExemplos(int n) {
        Exemplo listaRetorno[] = new Exemplo[n];
        for(int i = this.ind - n, j = 0; i < this.ind; i++, j++)
            listaRetorno[j] = this.listaExemplos[i];
        return listaRetorno;
    }
    
}
class Exemplo {
    private int rotuloClasse;
    private double atributosEntrada[];
    public Exemplo(double[] atributosEntrada, int rotuloClasse) {
        this.rotuloClasse = rotuloClasse;
        this.atributosEntrada = atributosEntrada;
    }
    public double[] getAtributosEntrada() {
        return this.atributosEntrada;
    } 
    public int getRotuloClasse() {
        return this.rotuloClasse;
    }
}