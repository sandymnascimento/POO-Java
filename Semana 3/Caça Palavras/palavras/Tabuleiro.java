package palavras;

public class Tabuleiro {
    private char tabuleiro[][];
    private int qtdLinhas, qtdColunas;

    public Tabuleiro(char[][] matriz){
        this.tabuleiro = new char[matriz.length][matriz[0].length];
        this.tabuleiro = matriz;
        this.qtdLinhas = matriz.length;
        this.qtdColunas = matriz[0].length;
    }
    public Tabuleiro(int qtdLinhas, int qtdColunas, char[] dadosMatriz){
        this.tabuleiro = new char[qtdLinhas][qtdColunas];
        int i, j, ind = 0;
        this.qtdLinhas = qtdLinhas;
        this.qtdColunas = qtdColunas;
        for(i = 0; i < qtdLinhas; i++)
            for(j = 0; j < qtdColunas; j++, ind++)
                this.tabuleiro[i][j] = dadosMatriz[ind];
    }
    public PalavraEncontrada buscar(String palavra){
        if(palavra.length() > this.qtdLinhas && palavra.length() > this.qtdColunas) return null;

        int i, j, ind, linha, coluna, l, c;

        for(i = 0; i < this.qtdLinhas; i ++){
            for(ind = 0, j = 0; j < this.qtdColunas; j ++, ind = 0){
                if(this.tabuleiro[i][j] == palavra.charAt(ind) && (this.qtdColunas - j >= palavra.length() || j >= palavra.length() - 1)){
                    coluna = j;
                    if(j >= palavra.length() - 1){
                        while(this.tabuleiro[i][coluna] == palavra.charAt(ind) && coluna >= 0){ 
                            coluna--;
                            ind++;
                            if(ind == palavra.length()){
                                PalavraEncontrada retorno = new PalavraEncontrada(palavra, i, j, 1, 2);
                                return retorno;
                            }
                        }
                        coluna = j; ind = 0;
                    }
                    while(this.tabuleiro[i][coluna] == palavra.charAt(ind) && coluna < this.qtdColunas){
                        coluna++; 
                        ind++;
                        if(ind == palavra.length()){
                            PalavraEncontrada retorno = new PalavraEncontrada(palavra, i, j, 1, 1);
                            return retorno;
                        }
                    }
                }
            }
        }
        for(j = 0; j < this.qtdColunas; j++)
            for(ind = 0, i = 0; i < this.qtdLinhas; i++, ind = 0){
                if(this.tabuleiro[i][j] == palavra.charAt(ind) && (this.qtdLinhas - i >= palavra.length() || i >= palavra.length() - 1)){
                    linha = i;
                    if(i >= palavra.length() - 1){
                        while(this.tabuleiro[linha][j] == palavra.charAt(ind) && linha >= 0){
                            linha--;
                            ind++;
                            if(ind == palavra.length()){
                                PalavraEncontrada retorno = new PalavraEncontrada(palavra, i, j, 2, 2);
                                return retorno;
                            }
                        }
                        linha = i; ind = 0;
                    }
                    while(this.tabuleiro[linha][j] == palavra.charAt(ind) && linha < this.qtdLinhas){
                        linha++; 
                        ind++;
                        if(ind == palavra.length()){
                            PalavraEncontrada retorno = new PalavraEncontrada(palavra, i, j, 2, 1);
                            return retorno;
                        }
                    }
                }
            }
        for(i = 0; i < this.qtdLinhas; i ++)
            for(ind = 0, j = 0; j < this.qtdColunas; j ++, ind = 0)
                if(this.tabuleiro[i][j] == palavra.charAt(ind)){
                    if(i >= palavra.length() && this.qtdColunas - j >= palavra.length()){
                        l = i; c = j;
                        while(this.tabuleiro[l][c] == palavra.charAt(ind) && l >= 0 && c < this.qtdColunas){
                            l--;
                            c++;
                            ind++;
                            if(ind == palavra.length()){
                                PalavraEncontrada retorno = new PalavraEncontrada(palavra, i, j, 3, 1);
                                return retorno;
                            }
                        }
                    }
                    if(this.qtdLinhas - i >= palavra.length() && this.qtdColunas - j >= palavra.length()){
                        l = i; c = j; ind = 0;
                        while(this.tabuleiro[l][c] == palavra.charAt(ind) && l < this.qtdLinhas && c < this.qtdColunas){
                            l++;
                            c++;
                            ind++;
                            if(ind == palavra.length()){
                                PalavraEncontrada retorno = new PalavraEncontrada(palavra, i, j, 3, 2);
                                return retorno;
                            }
                        }
                    }
                    if(j >= palavra.length() - 1 && this.qtdLinhas - 1 >= palavra.length()){
                        l = i; c = j; ind = 0;
                        while(this.tabuleiro[l][c] == palavra.charAt(ind) && l < this.qtdLinhas && c >= 0){
                            l++;
                            c--;
                            ind++;
                            if(ind == palavra.length()){
                                PalavraEncontrada retorno = new PalavraEncontrada(palavra, i, j, 3, 3);
                                return retorno;
                            }
                        }
                    }
                    if(i >= palavra.length() - 1 && j >= palavra.length() - 1){
                        l = i; c = j; ind = 0;
                        while(this.tabuleiro[l][c] == palavra.charAt(ind) && l >= 0 && c >= 0){
                            l--;
                            c--;
                            ind++;
                            if(ind == palavra.length()){
                                PalavraEncontrada retorno = new PalavraEncontrada(palavra, i, j, 3, 4);
                                return retorno;
                            }
                        }
                    }
                }
        return null;
    }
    public PalavraEncontrada[] buscar(String[] palavras){
        PalavraEncontrada temp[] = new PalavraEncontrada[palavras.length];
        int i, j;
        for(i = 0, j = 0; j < palavras.length; j++)
            if(buscar(palavras[j]) != null)
                temp[i++] = buscar(palavras[j]);
        if(i == 0) return null;
        PalavraEncontrada retorno[] = new PalavraEncontrada[i];
        for(j = 0; j < i; j++)
            retorno[j] = temp[j];
        return retorno;
    }
}
