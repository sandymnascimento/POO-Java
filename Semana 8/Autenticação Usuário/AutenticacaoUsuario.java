import acesso.*;
import java.util.Scanner;

public class AutenticacaoUsuario {
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);
        int qtdUsuarios = teclado.nextInt();
        Usuario vetor[] = new Usuario[qtdUsuarios];

        for(int i = 0; i < qtdUsuarios; i++){
            String login = teclado.next();
            String senha = teclado.next(); 
            vetor[i] = new Usuario(login, senha); // Ou cria o novo e aloca, teste.
        }

        int tentativas = teclado.nextInt();

        for(int ind = 0; ind < tentativas; ind++){
            String login = teclado.next();
            String senha = teclado.next(); 
            try{
                for(int i = 0; i < qtdUsuarios; i++){
                    if(vetor[i].getLogin().equals(login))
                        vetor[i].autenticar(senha);
                }
                Impressao.imprimirUsuarioAutenticado(login);
            }
            catch(SenhaInvalida e){
                Impressao.imprimirSenhaInvalida(e.getLogin());
            }
            catch(UsuarioBloqueado e){
                Impressao.imprimirUsuarioBloqueado(e.getLogin());
            }
        }
        teclado.close();
    }
}
