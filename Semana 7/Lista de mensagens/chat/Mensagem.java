package chat;
public abstract class Mensagem {
    private int like = 0;
    private Mensagem resposta = null, pergunta = null;
    private boolean responde = false;

    public void like() {
        this.like++;
    }
    public void responder(Mensagem resposta) {
        this.resposta = resposta;
        resposta.responde = true;
        resposta.pergunta = this;
    }
    public boolean getResponde(){
        return this.responde;
    }
    public Mensagem getPergunta(){
        return this.pergunta;
    }
    public int getLike(){
        return this.like;
    }
    public abstract String getRepresentacao();
    public abstract String getTexto();
}

class MensagemTexto extends Mensagem {
    private String texto;

    public MensagemTexto(String texto){
        this.texto = texto;
    }
    public String getTexto(){
        if(this.getResponde() == true)
            return texto + " RESPOSTA A [" + this.getPergunta().getTexto() + "]";
        return texto;
    }
    @Override
    public String getRepresentacao(){
        if(this.getResponde() == false)
            return this.texto + " (likes=" + this.getLike() + ")";
        else{
            return this.texto + " RESPOSTA A [" + this.getPergunta().getTexto() + "] (likes=" + this.getLike() + ")";
        }
    }
}

class MensagemImagem extends Mensagem {
    public String imagem;
    public int altura, largura;

    public MensagemImagem (String arquivoImagem, int largura, int altura){
        this.imagem = arquivoImagem;
        this.altura = altura;
        this.largura = largura;
    }
    public String getTexto(){ 
        if(this.getResponde() == true)
            return imagem + " " + this.largura + "x" + this.altura + " RESPOSTA A [" + this.getPergunta().getTexto() + "]";
        return imagem + " " + this.largura + "x" + this.altura;
    }
    @Override
    public String getRepresentacao(){
        if(this.getResponde() == false)
            return this.imagem + " " + this.largura + "x" + this.altura + " (likes=" + this.getLike() + ")";
        else 
            return this.imagem + " " + this.largura + "x" + this.altura  + " RESPOSTA A [" + this.getPergunta().getTexto() + "]" + " (likes=" + this.getLike() + ")";
    }
}
