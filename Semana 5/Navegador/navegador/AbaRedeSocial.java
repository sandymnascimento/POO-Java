package navegador;
public class AbaRedeSocial extends AbaNavegador{
    public AbaRedeSocial(String titulo){
        super(titulo);
    }
    public void postar(String texto){
        super.historicoDeAbas("Post: " + texto);
    }
    public String getTipo(){
        return "RedeSocial";
    }
}
