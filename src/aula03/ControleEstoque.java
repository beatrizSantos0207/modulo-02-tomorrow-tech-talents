package aula03;

public class ControleEstoque {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Danoninho", "Laticineos", "Iogurte", 3, "Danone");
        Produto produto2 = new Produto("Arroz", "Grãos", "Grão", 3, "Rei Arthur");
        Produto produto3 = new Produto("Linguiça Calabresa", "Carnes", "carne", 3, "Sadia");
        Produto produto4 = new Produto("Detergente Ypê", "Produtos de Limpeza", "produto de limpeza", 3, "Ypê");
        Produto produto5 = new Produto("Papel Higiênico", "casa", "papel higiênico", 3, "Sonho");

        Estoque estoque = new Estoque("Estoque 1");

        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        estoque.adicionarProduto(produto3);
        estoque.adicionarProduto(produto4);
        estoque.adicionarProduto(produto5);

        System.out.println("Lista Produtos: " + estoque.listaProdutos());
        System.out.println("Visualizar dados produto:\n" + estoque.listaProdutos().get(0));

        System.out.println("Visualizar dados produto:\n" + estoque.listaProdutos().get(4));

        Produto produto6 = new Produto("Danoninho", "Laticineos", "Iogurte", 3, "Danone");
        estoque.adicionarProduto(produto6);
        System.out.println("Lista Produtos: " + estoque.listaProdutos());


    }
}
