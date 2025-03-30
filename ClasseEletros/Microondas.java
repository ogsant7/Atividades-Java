public class Microondas extends Eletrodomestico {
    
    private int tempoMaximo;

    
    public Microondas(String marca, double potencia, int tempoMaximo) {
        super(marca, potencia); 
        this.tempoMaximo = tempoMaximo;
    }

    
    @Override
    public void ligar() {
        System.out.println("O microondas " + getMarca() + " está ligando com potência de " + getPotencia() + "W e tempo máximo de " + tempoMaximo + " minutos.");
    }

    
    public int getTempoMaximo() {
        return tempoMaximo;
    }

    
    public void setTempoMaximo(int tempoMaximo) {
        this.tempoMaximo = tempoMaximo;
    }
}