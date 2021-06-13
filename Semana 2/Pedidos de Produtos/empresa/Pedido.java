package empresa;

public class Pedido {
    private int vetPedidos[] = new int[5];
    private int indice = 0;
    public boolean adicionarProduto(int codProduto){
        for(int i = 0; i <= indice; i++){
            if(codProduto == vetPedidos[i])
                return false;
            else if(i == indice){
                vetPedidos[i] = codProduto;
                indice++;
                return true;
            }
        }
    } 
    public int[] entregar(){
    
    }
/*A empresa apenas realiza entregas de pedidos que não foram cancelados e que possuem pelo menos um produto. 
Caso a entrega seja realizada pela empresa, o retorno do método é um vetor com os códigos dos produtos do pedido. 
O tamanho do vetor deverá ser igual à quantidade de produtos no pedido. Dessa forma, o vetor não possuirá posições vazias. Caso a entrega não seja realizada, o método retorna null.*/
    public boolean cancelar(){
        
    }
    public boolean somarPedido(Pedido p){
        int i, j, qtdOriginal = 0, qtdP = 0, iguais = 0;
        for(i = 0; i < 5; i++){
            if(vetPedidos[i] != 0)
                qtdOriginal++;
            if(this.p[i] != 0)
                qtdP++;
            for(j = 0; j < qtdOriginal; j++)
                if(vetPedidos[i] == this.p[j])
                    iguais++;
        }
        if((qtdOriginal + qtdP) - iguais <= 5){
            i = 0;
            while(vetPedidos[i] != 0)
                    i++;
            for(j = 0; j < 5; j++){
                
            }
        }
        //passar tudo pro outro vetor
        
    }
    //soma o pedido no parâmetro p ao pedido da instância atual conforme regras da empresa. 
    //Se a soma não for possível, os pedidos não devem ser modificados. 
    //O retorno da função é true se a soma for realizada, ou false caso contrário.
}
