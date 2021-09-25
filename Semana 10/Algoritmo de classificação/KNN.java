package classificacao;

public class KNN {
    private int k;
    private ListaExemplos dadosTreinamento = null;

    public KNN(int k) {
        this.k = k;
    }
    public void setDadosTreinamento(ListaExemplos lista) {
        this.dadosTreinamento = lista;
    }
    public int predizer(double[] atributosEntrada) throws Exception {
        if(this.dadosTreinamento == null || atributosEntrada.length == 0)
            throw new Exception("Dados de treinamento - nao inicializado.");
        Exemplo exemplo[] = this.dadosTreinamento.getExemplos();
        if(exemplo[0].getAtributosEntrada().length != atributosEntrada.length)
            throw new ExcecaoDadosInvalidos(exemplo[0].getAtributosEntrada().length, atributosEntrada.length);

        this.dadosTreinamento.ordenarPelaDistancia(atributosEntrada);
        int rotulos[] = new int[this.k], rotulo = 0, contRotulo = 0, cont;
        for(int i = 0; i < this.k; i++)
            rotulos[i] = this.dadosTreinamento.getExemplos()[i].getRotuloClasse();
        for(int i = 0; i < this.k; i++){
            cont = 0;
            for(int j = i + 1; j < this.k; j++)
                if(rotulos[i] == rotulos[j])
                    cont++;
            if(cont > contRotulo){
                contRotulo = cont;
                rotulo = rotulos[i];
            }
        }
        return rotulo;
    }
}

class ExcecaoDadosInvalidos extends Exception {
    int atributosTreinamento, atributosPredizer;

    public ExcecaoDadosInvalidos(int atributosTreinamento, int atributosPredizer){
        this.atributosTreinamento = atributosTreinamento;
        this.atributosPredizer = atributosPredizer;
    }
    public int getQtdAtributosTreinamento() {
        return this.atributosTreinamento;
    }
    public int getQtdAtributosPredizer() {
        return this.atributosPredizer;
    }
}