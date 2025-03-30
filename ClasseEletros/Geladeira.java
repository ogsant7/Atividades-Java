public class Geladeira extends Eletrodomestico {
    
    private double capacidade;

    
    public Geladeira(String marca, double potencia, double capacidade) {
        super(marca, potencia);  
        this.capacidade = capacidade;
    }


    @Override
    public void ligar() {
        System.out.println("A geladeira " + getMarca() + " está ligando com potência de " + getPotencia() + "W e capacidade de " + capacidade + " litros.");
    }


    public double getCapacidade() {
        return capacidade;
    }


    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
}