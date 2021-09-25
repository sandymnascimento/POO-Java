import dispositivos.*;

public class GerenciadorInteligente {
    private int ind = 0;
    private LampadaInteligente vetLampadas[] = new LampadaInteligente[10];

    public void adicionarLampada() throws LimiteLampadas{
        if(this.ind >= 10)
            throw new LimiteLampadas();
        LampadaInteligente lamp = new LampadaInteligente();
        vetLampadas[this.ind++] = lamp;
    }
    public void ligarLampada(int indiceLampada) throws LampadaEstaLigada {
        if(vetLampadas[indiceLampada].getEstado())
            throw new LampadaEstaLigada(); 
        vetLampadas[indiceLampada].ligar();
    }
    public void desligarLampada(int indiceLampada) throws LampadaEstaDesligada{
        if(!vetLampadas[indiceLampada].getEstado())
            throw new LampadaEstaDesligada();
        vetLampadas[indiceLampada].desligar();
    }
}

class LampadaEstaLigada extends Exception {
    public LampadaEstaLigada(){
        super("A lampada ja esta ligada.");
    }
}

class LampadaEstaDesligada extends Exception{
    public LampadaEstaDesligada(){
        super("A lampada ja esta desligada.");
    }
}
class LimiteLampadas extends Exception{
    public LimiteLampadas(){
        super("O vetor de lampadas ja esta cheio.");
    }
}