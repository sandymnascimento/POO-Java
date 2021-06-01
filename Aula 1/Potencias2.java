import java.util.Scanner;

public class Potencias2 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        int tam = teclado.nextInt(), i, check = 0, cont = 0;
        int vet[] = new int[tam];
        for(i = 0; i < tam; i++){
            vet[i] = teclado.nextInt();
            check = verificaPotencia(vet[i]);
            if(check == 1) cont++;
        }
        System.out.println(cont);
    }
    public static int verificaPotencia (int x){
        while(x % 2 == 0){
            x /= 2;
            if (x == 1) return 1;
        }
        return 0;

    }
}
