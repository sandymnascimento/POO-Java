package chat;
public class ListaMensagens {
    private Mensagens inicio = null;
    private int qtdMensagens = 0;
    public ListaMensagens(){
        
    }   
    public static class Mensagens{
        Mensagem mensagem;
        Mensagens prox = null;
    
        public Mensagens(Mensagem mensagem) {
            this.mensagem = mensagem;
        }
    }
    public void adicionarMensagem(Mensagem mensagem) {
        Mensagens novo = new Mensagens(mensagem);
        if(this.inicio == null)
            this.inicio = novo;
        else{
            Mensagens atual = inicio;
            while(atual.prox != null)
                atual = atual.prox;
            atual.prox = novo;
        }
        this.qtdMensagens++;
    }
    public void responderMensagem(int indiceMensagemOriginal, Mensagem resposta) {
        this.adicionarMensagem(resposta);
        Mensagens atual = this.inicio;
        for(int i = 0; i <= indiceMensagemOriginal; i++, atual = atual.prox)
            if(i == indiceMensagemOriginal)
                atual.mensagem.responder(resposta);
    }
    public Mensagem[] getMensagens(){
        Mensagem vetorMensagens[] = new Mensagem[this.qtdMensagens];
        Mensagens atual = this.inicio;
        for(int i = 0; i < qtdMensagens; i++, atual = atual.prox)
            vetorMensagens[i] = atual.mensagem;
        return vetorMensagens;
    }
    public String[] getMensagensString(){
        String vetorMensagens[] = new String[this.qtdMensagens];
        Mensagens atual = this.inicio;
        for(int i = 0; i < qtdMensagens; i++, atual = atual.prox)
            vetorMensagens[i] = atual.mensagem.getRepresentacao();
        return vetorMensagens;
    }
    public void like(int indiceMensagem){
        Mensagens atual = this.inicio;
        for(int i = 0; i <= indiceMensagem; i++, atual = atual.prox)
            if(i == indiceMensagem)
                atual.mensagem.like();
    }
     
}
