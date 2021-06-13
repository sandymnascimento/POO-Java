import contacorrente.ContaCorrente;

public class Principal {
    public static void main(String[] args){
        ContaCorrente cliente1 = new ContaCorrente("Sandy", 500);
        ContaCorrente cliente2 = new ContaCorrente("Guilherme", 0);
        ContaCorrente cliente3 = new ContaCorrente("Mariana", 200);

        cliente1.transferir(cliente1, cliente2, 150);
        cliente3.sacar(28);
        cliente2.depositar(12);
        System.out.println(cliente1.getTitular() + " " + cliente1.getSaldo());
        System.out.println(cliente2.getTitular() + " " + cliente2.getSaldo()); 
        System.out.println(cliente3.getTitular() + " " + cliente3.getSaldo());
        System.out.println("Foram criadas " + ContaCorrente.getQuantidadeContas() + " contas.");
        
    }
}
