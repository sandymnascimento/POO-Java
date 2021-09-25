package quadrilateros;
public class Quadrado extends Retangulo {
    
    public void setLados(double ladoAB){
        this.ladoAB = ladoAB;
        this.ladoCD = ladoAB;
        this.ladoBC = ladoAB;
        this.ladoDA = ladoAB;
    }
    @Override
    public String getPropriedades(){
        return super.getPropriedades() + " Todos os lados tem o mesmo tamanho.";
    }
}
