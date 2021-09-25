package universidade;
public class Aluno extends Pessoa {
    public Aluno(){
    }
    @Override
    public String getEmail(){
        String email = this.nome + "." + this.sobrenome + "@aluno.ufabc.edu.br";
        return email;
    }
    @Override
    public String getVinculo(){
        return "Aluno da UFABC";
    }
}
