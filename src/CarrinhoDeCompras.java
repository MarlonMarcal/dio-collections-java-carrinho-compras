import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {

        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {

        List<Item> itemParaRemover = new ArrayList<>();

        for (Item i : carrinhoDeCompras) {

            if (i.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(i);
            }

        }

        carrinhoDeCompras.removeAll(itemParaRemover);

    }

    public void calcularValorTotal() {

        Double total = 0.0;

        for (int i = 0; i < carrinhoDeCompras.size(); i++) {

            total += carrinhoDeCompras.get(i).getPreco() * carrinhoDeCompras.get(i).getQuantidade();

        }

        System.out.println("Total do Carrinho: " + total);

    }

    public void exibirItens() {

        System.out.println(carrinhoDeCompras);
    }



}
