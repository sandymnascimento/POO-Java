package criptografia;
public class CifraCesar implements Cifra{
    private int nShifts;

    public CifraCesar(int nShifts){
        this.nShifts = nShifts;
    }
    public String cifrar(String mensagem){
        char vet[] = new char[mensagem.length()];
        if(nShifts > 0){
            for(int i = 0; i < mensagem.length(); i++){
                if(mensagem.charAt(i) != ' '){
                    char tmp = mensagem.charAt(i);
                    tmp+=this.nShifts;
                    if(tmp > 122){
                        int ascii = (int)tmp - 122 + 96;
                        tmp = (char)ascii;
                    }
                    vet[i] = tmp;
                }
                else 
                    vet[i] = mensagem.charAt(i);
            }
        }else{
            for(int i = 0; i < mensagem.length(); i++){
                if(mensagem.charAt(i) != ' '){
                    char tmp = mensagem.charAt(i);
                    tmp+=this.nShifts;
                    if(tmp < 97){
                        int ascii = 123 - (97 - (int)tmp);
                        tmp = (char)ascii;
                    }
                    vet[i] = tmp;
                }else
                    vet[i] = mensagem.charAt(i);
            }
        }
        String retorno = new String(vet);
        return retorno;
    }
    public String decifrar(String mensagem){
        char vet[] = new char[mensagem.length()];
        if(nShifts > 0){
            for(int i = 0; i < mensagem.length(); i++){
                if(mensagem.charAt(i) != ' '){
                    char tmp = mensagem.charAt(i);
                    tmp-=nShifts;
                    if(tmp < 97){
                        int ascii = 123 - (97 - (int)tmp);
                        tmp = (char)ascii;
                    }
                    vet[i] = tmp;
                }else
                    vet[i] = mensagem.charAt(i);
            }
        }else{
            for(int i = 0; i < mensagem.length(); i++){
                if(mensagem.charAt(i) != ' '){
                    char tmp = mensagem.charAt(i);
                    tmp-=nShifts;
                    if(tmp > 122){
                        int ascii = (int)tmp - 122 + 96;
                        tmp = (char)ascii;
                    }
                    vet[i] = tmp;
                }else
                    vet[i] = mensagem.charAt(i);
            }
        }
        String retorno = new String(vet);
        return retorno;
    }
}
