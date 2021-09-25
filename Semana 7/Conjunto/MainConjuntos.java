import estruturas.*;

public class MainConjuntos {
    public static void main(String[] args){
        Conjunto novo = new Conjunto();
        novo.adicionar(3);
        novo.adicionar(5);
        novo.remover(5);
        novo.adicionar(6);
        novo.adicionar(7);

        System.out.println(novo);
        System.out.println(novo.buscar(6));

        Conjunto nova = new Conjunto();
        nova.adicionar(3);
        nova.adicionar(9);
        nova.adicionar(10);
        nova.adicionar(7);
        System.out.println(Conjunto.uniao(novo, nova));
        
    }
}
