public class Assistente extends Funcionario {
    
    public Assistente(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
    }

    
    public double calcularBonus() {
        return getSalario() * 0.05;
    }

   
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Bônus: R$ " + calcularBonus());
    }
}