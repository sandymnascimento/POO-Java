import quadrilateros.Paralelogramo;
import quadrilateros.*;
public class chamados{
    public static void main(String[] args){
        Quadrilatero p1 = new Quadrilatero();
        Paralelogramo p2 = new Paralelogramo();
        Retangulo p3 = new Retangulo();
        Quadrado p4 = new Quadrado();
        System.out.println(p1.getPropriedades());
        System.out.println(p2.getPropriedades()); 
        System.out.println(p3.getPropriedades()); 
        System.out.println(p4.getPropriedades());  
    }
}