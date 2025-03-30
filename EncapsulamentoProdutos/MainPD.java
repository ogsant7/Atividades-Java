public class MainPD {
    public static void main(String[] args) {

        Produto produto = new Produto("Produto A", 50.0, 100);

        System.out.println("Valor total do estoque: " + produto.calcularValorTotal());

        produto.setNome("Produto B");
        produto.setPreco(60.0);
        produto.setQuantidade(150);

        System.out.println("Novo valor total do estoque: " +produto.calcularValorTotal());
    
    }
}
