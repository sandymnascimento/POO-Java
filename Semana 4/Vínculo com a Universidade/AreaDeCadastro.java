import universidade.*;

public class AreaDeCadastro {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        p1.setNomeSobrenome("Sandy","Nascimento");
        System.out.print(p1.getVinculo() + " ");
        System.out.println(p1.getEmail());

        Aluno a1 = new Aluno();
        a1.setNomeSobrenome("Cristina", "rocha");
        System.out.print(a1.getVinculo() + " ");
        System.out.println(a1.getEmail());

        Professor prof1 = new Professor();
        prof1.setNomeSobrenome("juliano", "ferreira");
        System.out.print(prof1.getVinculo() + " ");
        System.out.println(prof1.getEmail());
    }
}
