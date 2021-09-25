import operações.Operacoes;

public class MenuOperacoes {
    public static void main(String[] args){
        Operacoes op1 = new Operacoes();
        op1.setA(5);
        op1.setB(6);
        op1.setC(7);
        op1.soma2();
        op1.soma3();
        System.out.println(op1.a);
        System.out.println(op1.b);
        System.out.println(op1.c);
        System.out.println(op1.soma2);
        System.out.println(op1.soma3);
        System.out.println(op1.getMin());
        System.out.println(op1.getMax());
        op1.setA(8);
        System.out.println(op1.a);
        System.out.println();
        Operacoes op2 = new Operacoes();
        op2.setA(30);
        System.out.println(op2.a);
        op2.setC(10);
        op2.soma3();
        System.out.println(op2.soma3);
    }
}
