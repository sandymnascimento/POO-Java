public class Strings {
    public static void main(String[] args){
        OperacoesStrings text = new OperacoesStrings();
        text.setTexto("    Mais     uma  frase de     teste neste     Exercicio. Deveras interessante né!!!");
        System.out.println(text.getTexto());
        System.out.println(text.maiorPalavra());
        System.out.println(text.contaPalavras());
        System.out.println(text.comprimentoMaiorPalavra());
        System.out.println(text.comprimentoMedioPalavras());
    }
}
