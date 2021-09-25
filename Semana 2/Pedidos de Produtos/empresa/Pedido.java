package empresa;

public class Pedido {
    private int vetPedidos[] = new int[5];
    private int indice = 0;
    private boolean entrega = false, cancelado = false;

    public boolean adicionarProduto(int codProduto){
        if(!this.entrega && !this.cancelado)
            for(int i = 0; i <= indice && indice < 5; i++){
                if(codProduto == this.vetPedidos[i])
                    return false;
                else if(i == indice){
                    this.vetPedidos[i] = codProduto;
                    this.indice++;
                    return true;
                }
            }
        return false;
    } 
    public int[] entregar(){
        if(this.cancelado && this.entrega)
            return null;
        int tam = 0;
        for(int i: this.vetPedidos)
            if(i != 0) tam++;
        if(tam == 0) return null;
        int retorno[] = new int[tam];
        this.entrega = true;
        for(int i = 0; i < tam; i++)
            retorno[i] = this.vetPedidos[i];
        return retorno;
    }
    public boolean cancelar(){
        if(this.entrega && this.cancelado)
            return false;
        this.cancelado = true;
        return true;
    }
    public boolean somarPedido(Pedido p){
        int i, j, qtdOriginal = 0, qtdP = 0, iguais = 0;
        for(i = 0; i < 5; i++){
            if(this.vetPedidos[i] != 0)
                qtdOriginal++;
            if(p.vetPedidos[i] != 0)
                qtdP++;
            for(j = 0; j <= qtdOriginal; j++)
                if(this.vetPedidos[i] == p.vetPedidos[j])
                    iguais++;
        }
        int tam = qtdOriginal + qtdP - iguais;
        if(tam <= 5){
            int insere = qtdOriginal;
            for(i = 0; i < qtdP; i++){
                for(j = 0; j < qtdOriginal; j++)
                    if(this.vetPedidos[j] == p.vetPedidos[i])
                        break;    
                if(j == qtdOriginal){
                    this.vetPedidos[insere] = p.vetPedidos[i];
                    insere++;
                }
            }
            return true;
        }
        return false;        
    }
}
