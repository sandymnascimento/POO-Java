package quadrilateros;

public class Paralelogramo extends Quadrilatero {
    
    public void setLados(double ladoAB, double ladoCD){
        this.ladoAB = ladoAB;
        this.ladoCD = ladoAB;
        this.ladoBC = ladoCD;
        this.ladoDA = ladoCD;
    }
    @Override
    public String getPropriedades(){
        return super.getPropriedades() + " Lados opostos paralelos.";
    }
    
}
