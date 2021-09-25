public class CrachaFuncionario extends Cracha {
    private String cargo;
    private int mes, ano;
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public void setDataAdmissao(int mes, int ano){
        this.mes = mes;
        this.ano = ano;
    }
    @Override
    public void imprimir(){
        Impressao.imprimirLinha("FUNCIONARIO");
        Impressao.imprimirLinha("Nome: " + super.getNome());
        Impressao.imprimirLinha("Cargo: " + this.cargo);
        Impressao.imprimirLinha("Admissao: " + this.mes + "/" + this.ano);
    }
}
