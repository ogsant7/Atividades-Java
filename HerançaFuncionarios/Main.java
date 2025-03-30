public class Main {
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("Carlos Silva", 8000.0, "Gerente de Vendas");
        Assistente assistente = new Assistente("Ana Costa", 3000.0, "Assistente Administrativo");

       
        System.out.println("Gerente:");
        gerente.exibirDados();

        System.out.println("\nAssistente:");
        assistente.exibirDados();
    }
}