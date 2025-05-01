public class App {
    public static void main(String[] args) throws Exception {
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Banana", 10, 2);
        carrinho.adicionarItem("Manga", 6, 3);

        carrinho.calcularValorTotal();

        carrinho.exibirItens();

        carrinho.removerItem("Banana");

        carrinho.exibirItens();
        carrinho.calcularValorTotal();
    }
}
