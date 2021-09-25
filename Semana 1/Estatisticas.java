import java.util.Scanner;

public class Estatisticas {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int x, soma = 0, cont = 0, min = -1, max = -1;
        while(true){
            x = teclado.nextInt();
            if (x < 0) break;
            if(min == -1 && max == -1){
                min = x;
                max = x;
            }
            if(x < min) min = x;
            else if (x > max) max = x;
            soma += x;
            cont++;
        }
        System.out.println(soma);
        System.out.printf("%.2f\n", soma / ((float) cont));
        System.out.println(min);
        System.out.print(max);
    }
}
