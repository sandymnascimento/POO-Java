package automotores;
public class Motocicleta extends Veiculo {
    private boolean temCarroLateral;
    public void setTemCarroLateral(boolean carroLateral){
        this.temCarroLateral = carroLateral;
    }
    public boolean getTemCarroLateral(){
        return this.temCarroLateral;
    }
    @Override
    public String getTipo(){
        return "Motocicleta modelo " + this.modelo;
    }
}
