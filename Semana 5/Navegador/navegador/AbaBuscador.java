package navegador;
public class AbaBuscador extends AbaNavegador {
    public AbaBuscador(String titulo){
        super(titulo);
    }
    public void buscar(String expressao){
        super.historicoDeAbas("Busca: " + expressao);
    }
    @Override
    public String getTipo(){
        return "Buscador";
    }
}
