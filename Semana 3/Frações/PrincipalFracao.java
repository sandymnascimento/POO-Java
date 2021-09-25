import matematica.Fracao;

public class PrincipalFracao {
    public static void main(String[] args){
        Fracao num1 = new Fracao();
        Fracao num2 = new Fracao(5);
        Fracao num3 = new Fracao(360,320);
        Fracao vet[] = new Fracao[3];
        vet[0] = new Fracao(1,4);
        vet[1] = new Fracao(3,8);
        vet[2] = new Fracao(5,10);
        System.out.println(num1.getRepresentacao());
        System.out.println(num2.getRepresentacao());
        System.out.println(num3.getRepresentacao());
        System.out.println(Fracao.somar(vet).getRepresentacao());

    }
}
