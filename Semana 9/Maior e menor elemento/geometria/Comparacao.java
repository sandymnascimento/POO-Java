package geometria;

public class Comparacao<T> {
    public static <T extends Comparable<T>> T maiorElemento(T[] v) {
        if(v == null) return null;
        T maior = v[0];
        for(int i = 0; i < v.length; i++)
            if(v[i].compareTo(maior) > 0)
                maior = v[i];
        return maior;
    }
    public static <T extends Comparable<T>> T menorElemento(T[] v) {
        if(v == null) return null;
        T menor = v[0];
        for(int i = 0; i < v.length; i++)
            if(v[i].compareTo(menor) < 0)
                menor = v[i];
        return menor;
    }
}
