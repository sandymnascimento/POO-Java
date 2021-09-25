package cartoes;
public class CartaoCredito extends CartaoDebito{
    private double valorDevido;
    public CartaoCredito(){
        this.valorDevido = 0;
    }
    public boolean pagarComCredito(double valor){
        this.valorDevido += valor;
        return true;
    }
    public void quitarCredito(double valor){
        this.valorDevido -= valor;
    }
    public double verificarExtrato(){
        return this.valorDevido;
    }
}
