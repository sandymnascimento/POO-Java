import criptografia.CifraCesar;

public class Principal {
    public static void main(String[] args){
        CifraCesar c1 = new CifraCesar(5);
        System.out.println(c1.cifrar("mensagem secreta cifrada com a cifra de cesar"));
        System.out.println(c1.decifrar("mensagem secreta cifrada com a cifra de cesar"));
    }
}
