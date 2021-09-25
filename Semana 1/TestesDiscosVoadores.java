import java.util.Scanner;

public class TestesDiscosVoadores {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        int l = teclado.nextInt(), c = teclado.nextInt();
        int matriz[][] = new int[l][c];
        for(int i = 0; i < l; i++)
            for(int j = 0; j < c; j++)
                matriz[i][j] = teclado.nextInt();
        ordenaLinhas(matriz, l, c);
        System.out.println();
        ordenaColunas(matriz, l, c);
    }
    public static void ordenaLinhas(int matriz[][], int l, int c){
        int i, j, fim, coluna, temp, check = 0;
        for(fim = l; fim > 0; fim--){
            for(i = 0, check = 0; i + 1 < fim; i++){
                coluna = 0;
                while(matriz[i][coluna] == matriz[i + 1][coluna])
                    coluna++;
                if(matriz[i][coluna] > matriz[i + 1][coluna]){
                    for(j = 0; j < c; j++){
                        temp = matriz[i][j];
                        matriz[i][j] = matriz[i + 1][j];
                        matriz[i + 1][j] = temp;
                    }
                    check = 1;
                }
            }
            if(check == 0) break;
        }
        imprimeMatriz(matriz, l, c);
    }
    public static void ordenaColunas(int matriz[][], int l, int c){
        int i, j, fim, linha, temp, check;
        for(fim = c; fim > 0; fim--){
            for(i = 0, check = 0; i + 1 < c; i++){
                linha = 0;
                while(matriz[linha][i] == matriz[linha][i + 1])
                    linha++;
                if(matriz[linha][i] > matriz[linha][i + 1]){
                    for(j = 0; j < l; j++){
                        temp = matriz[j][i];
                        matriz[j][i] = matriz[j][i + 1];
                        matriz[j][i + 1] = temp;
                    }
                    check = 1;
                }
            }
            if(check == 0) break;
        }
        imprimeMatriz(matriz, l, c);
    }
    public static void imprimeMatriz(int matriz[][], int l, int c){
        for(int i = 0; i < l; i++)
            for(int j = 0; j < c; j++){
                if(j == c - 1)
                    System.out.println(matriz[i][j]);
                else
                    System.out.print(matriz[i][j] + " ");
            }
    }
}
