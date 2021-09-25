package dispositivos;
public class Gerenciador {
    public DispositivoInteligente dispositivos[] = new DispositivoInteligente[10];;
    private int ind;
    public Gerenciador(){
        ind = 0;
    }
    public void adicionarDispositivo(DispositivoInteligente d){
        if(this.ind <= 9)
            dispositivos[this.ind++] = d;
    }
    public void ligarTodosDispositivos(){
        for(int i = 0; i < this.ind; i++)
            if(dispositivos[i].getEstado() == false)
                dispositivos[i].ligar();
    } 
    public void desligarTodosDispositivos(){
        for(int i = 0; i < this.ind; i++)
            if(dispositivos[i].getEstado() == true)
                dispositivos[i].desligar();
    }
}
abstract class DispositivoInteligente{
    private boolean estado;
    public DispositivoInteligente(){
        this.estado = false;
    }
    public void ligar(){
        if(this.estado == false)
            this.estado = true;
    }
    public void desligar(){
        if(this.estado == true)
            this.estado = false;
    }
    public boolean getEstado(){
        return this.estado;
    }
}
class LampadaInteligente extends DispositivoInteligente{

}
class TomadaInteligente  extends DispositivoInteligente{

}
class InterruptorInteligente  extends DispositivoInteligente{

}