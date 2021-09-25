package arquivos;

import java.util.Scanner;

public class CompactaArquivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        PastaCompactada<Texto> pastaTextos = new PastaCompactada<Texto>();
        PastaCompactada<Imagem> pastaImagens = new PastaCompactada<Imagem>();
        int qtdArquivos = teclado.nextInt();

        for(int i = 0; i < qtdArquivos; i++){
            String tipo = teclado.next();
            if(tipo.equals("Texto")){
                Texto novo = new Texto();
                pastaTextos.adicionar(novo);
            }
            else if(tipo.equals("TextoTXT")){
                Texto novo = new TextoTXT();
                pastaTextos.adicionar(novo);
            }
            else if(tipo.equals("TextoDOCX")){
                Texto novo = new TextoDOCX();
                pastaTextos.adicionar(novo);
            }
            else if(tipo.equals("Imagem")){
                Imagem novo = new Imagem();
                pastaImagens.adicionar(novo);
            }
            else if(tipo.equals("ImagemPNG")){
                Imagem novo = new ImagemPNG();
                pastaImagens.adicionar(novo);
            }
            else if(tipo.equals("ImagemJPEG")){
                Imagem novo = new ImagemJPEG();
                pastaImagens.adicionar(novo);
            }
        }
        pastaTextos.imprimir();
        pastaImagens.imprimir();

        teclado.close();
    }
}