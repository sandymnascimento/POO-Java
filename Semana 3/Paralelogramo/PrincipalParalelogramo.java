import paralelogramo.Paralelogramo;

public class PrincipalParalelogramo{
    public static void main(String[] args){
        Paralelogramo quadrado = new Paralelogramo(5);
        Paralelogramo retangulo = new Paralelogramo(10, 20);
        Paralelogramo oQueSou   = new Paralelogramo(15, 15);

        System.out.println(quadrado.getTipo());
        System.out.println("Sua area é de " + quadrado.getArea());
        System.out.println(retangulo.getTipo());
        System.out.println("Sua area é de " + retangulo.getArea());
        System.out.println(oQueSou.getTipo());
        System.out.println("Sua area é de " + oQueSou.getArea());
    }
}