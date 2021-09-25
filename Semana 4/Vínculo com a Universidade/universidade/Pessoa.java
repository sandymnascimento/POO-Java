package universidade;
public class Pessoa {
    protected String nome, sobrenome;

    public Pessoa(){
        nome = new String();
        sobrenome = new String();
    }
    public void setNomeSobrenome(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public String getEmail(){
        String email = this.nome + "." + this.sobrenome + "@dominio.generico.com.br";
        return email;
    }
    public String getVinculo(){
        return "Sem vínculo com a UFABC";
    }
}
