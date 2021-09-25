package usuarios;

public class PerfilRedeSocial extends PerfilUsuario{
    private String mensagem;

    public PerfilRedeSocial(String nome, String login) {
        super(nome, login);
        this.mensagem = "Sem mensagem";
    }
    public PerfilRedeSocial(String nome, String login, String mensagemPaginaInicial) {
        super(nome, login);
        this.mensagem = mensagemPaginaInicial;
    }
    public String getPerfil(){
        return super.getNome() + " " + this.mensagem;
    }
}
