import java.util.Scanner;

public class ComparaVetores {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int tam = teclado.nextInt(), i;
        int vetorA[] = new int[tam];
        int vetorB[] = new int[tam];
        for (i = 0; i < tam; i++)
            vetorA[i] = teclado.nextInt();
        for (i = 0; i < tam; i++)
            vetorB[i] = teclado.nextInt();
        boolean res = checaFatores(vetorA, vetorB, tam);
        System.out.print(res ? "SIM" : "NAO");
    }
    public static boolean checaFatores(int vetorA[], int vetorB[], int tam){
        int fator = vetorB[0] / vetorA[0];

        for (int i = 0; i < tam; i++)
            if((vetorA[i] * fator) != vetorB[i])
                return false;
        return true;
    }
}
