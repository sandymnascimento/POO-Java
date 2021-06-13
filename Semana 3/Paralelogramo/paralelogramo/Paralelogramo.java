package paralelogramo;

public class Paralelogramo {
    private String tipo;
    private int area;

    public Paralelogramo(int ladoA){
        this.tipo = "quadrado";
        this.area = ladoA * ladoA;
    }
    public Paralelogramo(int ladoA, int ladoB){
        if(ladoA == ladoB) 
            this.tipo = "quadrado";
        else
            this.tipo = "retangulo";
        this.area = ladoA * ladoB;
    }
    public int getArea(){
        return this.area;
    }
    public String getTipo(){
        return ("Paralelogramo " + this.tipo);
    }
}
