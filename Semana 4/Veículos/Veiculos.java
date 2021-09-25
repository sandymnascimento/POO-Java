import automotores.*;
public class Veiculos {
    public static void main(String[] args){
        Veiculo v1 = new Veiculo();
        Carro c1 = new Carro();
        Motocicleta m1 = new Motocicleta();

        v1.setModelo("abacaxi");
        System.out.println(v1.getTipo());

        c1.setModelo("Veloster");
        c1.setNumeroPortas(3);
        System.out.println("Número de portas do carro " + c1.getTipo() + ": " + c1.getNumeroPortas());
        
        m1.setModelo("XRE");
        System.out.println(m1.getTipo() + ". Possui carro lateral? " + m1.getTemCarroLateral());
    }
}
