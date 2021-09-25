package operações;
public class Operacoes {
    public int a, b, c;
    public int soma2, soma3, multiplica;
    private int min = -0, max = -0;

    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public void setC(int c){
        this.c = c;
    }
    public int soma2(){
        this.soma2 = this.a + this.b;
        verifica(this.soma2); 
        return this.soma2;
    }
    public int soma3(){
        this.soma3 = this.a + this.b + this.c;
        verifica(this.soma3); 
        return this.soma3;
    }
    public int multiplica(){
        this.multiplica = this.a * this.b;
        verifica(this.multiplica);
        return multiplica;
    }
    private void verifica(int x){
        if(x < this.min || this.min == -0)
            this.min = x;
        if(x > this.max || this.max == -0)
            this.max = x;
    }
    public int getMin(){
        return min;
    }
    public int getMax(){
        return max;
    }
}
