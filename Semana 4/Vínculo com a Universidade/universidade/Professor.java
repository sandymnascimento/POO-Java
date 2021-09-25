package universidade;
public class Professor extends Pessoa{

    public Professor(){
    }
    @Override
    public String getEmail(){
        String email = this.nome + "." + this.sobrenome + "@ufabc.edu.br";
        return email;
    }
    @Override
    public String getVinculo(){
        return "Professor da UFABC";
    }
}
