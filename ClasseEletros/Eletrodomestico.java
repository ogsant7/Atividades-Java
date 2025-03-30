public class Eletrodomestico {
    
    private String marca;
    private double potencia;

    
    public Eletrodomestico(String marca, double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    
    public void ligar() {
        System.out.println("O eletrodoméstico " + marca + " está ligando.");
    }
}
