package matematica;

public class Fracao {
    private int numerador = 1;
    private int denominador = 1;

    public Fracao(){
    }
    public Fracao(int numerador){
        this.numerador = numerador;
    }
    public Fracao(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public String getRepresentacao(){
        simplificaFracao();
        return (this.numerador + "/" + this.denominador);
    }
    private static Fracao soma(Fracao f1, Fracao f2){
        Fracao soma = new Fracao();
        soma.denominador = 1;
        for(int i = 2; f1.denominador > 1 || f2.denominador > 1; i++){
            while(f1.denominador % i == 0 || f2.denominador % i == 0){
                if(f1.denominador % i == 0)
                    f1.denominador /= i;
                if(f2.denominador % i == 0)
                    f2.denominador /= i;    
                soma.denominador *= i; 
            }
        }
        soma.numerador = soma.denominador / f1.denominador * f1.numerador;
        soma.numerador += soma.denominador / f2.denominador * f2.numerador;
        return soma;
    }
    public Fracao somar(Fracao f2){
        Fracao soma = new Fracao();
        if(this.denominador == f2.denominador){
            soma.numerador = this.numerador + f2.numerador;
            soma.denominador = this.denominador;
            return soma;
        }else{
            soma.numerador = this.numerador;
            soma.denominador = this.denominador;
            soma = soma(soma, f2);
            return soma;
        }
    }
    public static Fracao somar(Fracao f1, Fracao f2){
        Fracao soma = new Fracao();
        if(f1.denominador == f2.denominador){
            soma.numerador = f1.numerador + f2.numerador;
            soma.denominador = f1.denominador;
            return soma;
        }else{
            soma = soma(f1, f2);
            return soma;
        }
    }
    public static Fracao somar(Fracao[] fracoes){
        Fracao soma = new Fracao();
        int check = 0;
        soma.denominador = fracoes[0].denominador;
        for (Fracao d : fracoes)
            if(d.denominador != soma.denominador) check++;
        if(check == 0){
            for (Fracao d : fracoes) soma.numerador += d.numerador;
            return soma;
        }else{
            soma.denominador = 1;
            for(Fracao d: fracoes) soma.denominador *= d.denominador;
            for(Fracao d: fracoes) soma.numerador += soma.denominador / d.denominador * d.numerador;
            return soma;
        }
    }
    public static Fracao multiplicar(Fracao f1, Fracao f2){
        Fracao nova = new Fracao();
        nova.numerador = f1.numerador * f2.numerador;
        nova.denominador = f1.denominador * f2.denominador;
        return nova;  
    }
    public void simplificaFracao(){
        if(this.numerador > this.denominador){
            for(int i = 2; i <= this.denominador; i++)
                while(this.numerador % i == 0 && this.denominador % i == 0){
                    this.numerador /= i;
                    this.denominador /= i;
                }
        }else if(this.numerador < this.denominador){
            for(int i = 2; i <= this.numerador; i++)
                while(this.numerador % i == 0 && this.denominador % i == 0){
                    this.numerador /= i;
                    this.denominador /= i;
                }
        }else{
            this.numerador = 1;
            this.denominador = 1;
        }
    }
}
