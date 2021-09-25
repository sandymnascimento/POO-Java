import empresa.Pedido;

public class SolicitacaoDeProdutos {
    public static void main(String[] args){
        Pedido c1 = new Pedido();
        Pedido c2 = new Pedido();
        c1.adicionarProduto(22);
        c1.adicionarProduto(24);
        c1.adicionarProduto(10);
        c2.adicionarProduto(22);
        c2.adicionarProduto(15);
        c2.adicionarProduto(24);
        c2.adicionarProduto(36);
        System.out.println(c1.somarPedido(c2));

    }
}
