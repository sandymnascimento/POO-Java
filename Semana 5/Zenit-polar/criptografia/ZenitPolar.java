package criptografia;
public class ZenitPolar implements Cifra{
    public String cifrar(String mensagem){
        char vet[] = new char[mensagem.length()];
        for(int i = 0; i < mensagem.length(); i++){
            if(mensagem.charAt(i) == 'z')
                vet[i] = 'p';
            else if(mensagem.charAt(i) == 'e')
                vet[i] = 'o';
            else if(mensagem.charAt(i) == 'n')
                vet[i] = 'l';
            else if(mensagem.charAt(i) == 'i')
                vet[i] = 'a';
            else if(mensagem.charAt(i) == 't')
                vet[i] = 'r';
            else if(mensagem.charAt(i) == 'p')
                vet[i] = 'z';
            else if(mensagem.charAt(i) == 'o')
                vet[i] = 'e';
            else if(mensagem.charAt(i) == 'l')
                vet[i] = 'n';
            else if(mensagem.charAt(i) == 'a')
                vet[i] = 'i';
            else if(mensagem.charAt(i) == 'r')
                vet[i] = 't';
            else 
                vet[i] = mensagem.charAt(i);
        }
        String retorno = new String(vet);
        return retorno;
    }
    public String decifrar(String mensagem){
        char vet[] = new char[mensagem.length()];
        for(int i = 0; i < mensagem.length(); i++){
            if(mensagem.charAt(i) == 'z')
                vet[i] = 'p';
            else if(mensagem.charAt(i) == 'e')
                vet[i] = 'o';
            else if(mensagem.charAt(i) == 'n')
                vet[i] = 'l';
            else if(mensagem.charAt(i) == 'i')
                vet[i] = 'a';
            else if(mensagem.charAt(i) == 't')
                vet[i] = 'r';
            else if(mensagem.charAt(i) == 'p')
                vet[i] = 'z';
            else if(mensagem.charAt(i) == 'o')
                vet[i] = 'e';
            else if(mensagem.charAt(i) == 'l')
                vet[i] = 'n';
            else if(mensagem.charAt(i) == 'a')
                vet[i] = 'i';
            else if(mensagem.charAt(i) == 'r')
                vet[i] = 't';
            else 
                vet[i] = mensagem.charAt(i);
        }
        String retorno = new String(vet);
        return retorno;
    }
}
