package dispositivos;

public class LampadaInteligente {
    private boolean lampada = false;

    public void ligar(){
        if(!this.lampada)
            this.lampada = true;
    }
    public void desligar(){
        if(this.lampada)
            this.lampada = false;
    }
    public boolean getEstado(){
        return this.lampada;
    }
}
