import java.util.Scanner;

public class Piramide {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        int tam = teclado.nextInt(), i, j;
        for(i = 1; i <= tam; i++){
            for(j = tam - i; j > 0; j--)
                System.out.print("-");
            for(int c = i; c > 0; c--){
                if (c == 1) System.out.print("1");
                else System.out.print("11");
            }
            for(j = tam - i; j > 0; j--)
                System.out.print("-");
            System.out.println();
        }
    }
}
