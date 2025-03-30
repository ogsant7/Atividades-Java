public class Gerente extends Funcionario {
    
    private double bonus;

   
    public Gerente(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
    }

   
    public double calcularBonus() {
        bonus = getSalario() * 0.10;
        return bonus;
    }

    
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Bônus: R$ " + calcularBonus());
    }
}