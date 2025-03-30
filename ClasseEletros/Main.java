public class Main {
    public static void main(String[] args) {
         
        Geladeira geladeira = new Geladeira("Brastemp", 150, 350);
        Microondas microondas = new Microondas("Samsung", 1200, 30);

        
        geladeira.ligar();
        microondas.ligar();
    }
}
