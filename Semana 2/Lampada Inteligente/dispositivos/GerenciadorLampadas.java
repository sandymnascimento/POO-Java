package dispositivos;
public class GerenciadorLampadas {
    private int ind = 0;
    private LampadaInteligente vetLampadas[] = new LampadaInteligente[10];

    public void adicionarLampada(){
        LampadaInteligente lamp = new LampadaInteligente();
        vetLampadas[this.ind++] = lamp;
    }
    public void ligarLampada(int indiceLampada){
        if(!vetLampadas[indiceLampada].getEstado())
            vetLampadas[indiceLampada].ligar();
    }
    public void desligarLampada(int indiceLampada){
        if(vetLampadas[indiceLampada].getEstado())
            vetLampadas[indiceLampada].desligar();
    }
    public void ligarTodasLampadas(){
        for(int i = 0; i < this.ind; i++)
            vetLampadas[i].ligar();
    }
    public void desligarTodasLampadas(){
        for(int i = 0; i < this.ind; i++)
            vetLampadas[i].desligar();

    }
}
