import java.util.Scanner;

public class CampoMinado {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int linha = teclado.nextInt(), coluna = teclado.nextInt();
        int campo[][] = new int[linha][coluna];
        for(int i = 0; i < linha; i++)
            for(int j = 0; j < coluna; j++)
                campo[i][j] = teclado.nextInt();
        bombas(campo, linha, coluna, teclado);
    }
    public static void bombas(int campo[][], int linhas, int colunas, Scanner teclado){
        int cont = 0, i, j;
        int l = teclado.nextInt(), c = teclado.nextInt();
        for(i = l - 1; i <= l + 1 && i < linhas; i++){
            if(l == 0 && i == -1) i = l;
            for(j = c - 1; j <= c + 1 && j < colunas; j++){
                if(c == 0 && j == -1) j = c;
                if(campo[i][j] == 1) cont++;
            }
        }
        if(campo[l][c] == 1) cont--;
        System.out.print(cont);
    }
}
