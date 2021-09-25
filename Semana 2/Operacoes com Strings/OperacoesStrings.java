public class OperacoesStrings {
    String texto;

    void setTexto(String texto){
        this.texto = texto;
    }
    String getTexto(){
        return this.texto;
    }
    int contaPalavras(){
        int cont = 0, i;
        for( i = 0; i < this.texto.length(); i++){
            if(checaCaractere(this.texto.charAt(i)))
                continue;
            else if(i > 0)
                if(checaCaractere(this.texto.charAt(i - 1)))
                    cont++;
        }
        if(cont == 0 && checaCaractere(this.texto.charAt(i - 1)))
            cont++;
        return cont;
    }
    double comprimentoMedioPalavras(){
        int cont = 0, soma = 0;
        for(int i = 0; i < this.texto.length(); i++){
            if(checaCaractere(this.texto.charAt(i))){
                cont++;
                if(i == this.texto.length() - 1)
                    soma += cont;
            }
            else if(i > 0){
                if(checaCaractere(this.texto.charAt(i - 1))){
                    soma += cont;
                    cont = 0;
                }
            }
        }

        return (soma/(float)contaPalavras());
    } 
    String maiorPalavra(){
        char temp[] = new char[comprimentoMaiorPalavra()];
        int tam = 0, cont = 0, i; 
        for(i = 0; i < this.texto.length(); i++){
            if(checaCaractere(this.texto.charAt(i))){
                cont++;
                
            }
            else{
                if(cont > tam){
                    tam = cont;
                    for(int j = i - cont, k = 0; j < i; j++, k++)
                        temp[k] = this.texto.charAt(j);
                }
                cont = 0;
            }
        }
        if(cont != 0){
            if(cont > tam){
                tam = cont;
                for(int j = i - cont, k = 0; j < i; j++, k++)
                    temp[k] = this.texto.charAt(j);
            }
        }
        String retorno = new String(temp);
        return retorno;
    }
    int comprimentoMaiorPalavra(){
        int tam = 0, cont = 0, i;
        for(i = 0; i < this.texto.length(); i++){
            if(checaCaractere(this.texto.charAt(i)))
                cont++;
            else{
                if(cont > tam)
                    tam = cont;
                cont = 0;
            }
        }
        if(cont != 0)
            if(cont > tam)
                tam = cont;
               
        return tam;
    }
    boolean checaCaractere(char letra){
        if((letra >= 'A' && letra <= 'Z') || (letra >= 'a' && letra <= 'z'))
            return true;
        return false;
    }
}
