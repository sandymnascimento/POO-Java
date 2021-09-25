package automotores;
public class Veiculo {
    protected String modelo;
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getTipo(){
        return "Veiculo generico modelo " + this.modelo;
    }
}
