package cartoes;
public class CartaoDebito {
    protected String titular;
    protected double saldoDebito;

    public CartaoDebito(){
        this.saldoDebito = 0;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void adicionarSaldoDebito(double valor){
        this.saldoDebito += valor;
    }
    public double verificarSaldoDebito(){
        return this.saldoDebito;
    }
    public boolean pagarComDebito(double valor){
        if(this.saldoDebito < valor) return false;
        this.saldoDebito -= valor;
        return true;
    }
}
