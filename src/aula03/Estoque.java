package aula03;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Estoque {

    private String id;
    private List<Produto> produtos = new ArrayList<>();
    public String nome;


    public String getId() {
        return id;
    }

    public Estoque() {
        this.id = UUID.randomUUID().toString();
    }

    public Estoque(String nome) {
        this.nome = nome;
        this.id = UUID.randomUUID().toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> listaProdutos() {
        return produtos;
    }

    public String visualizarDadosProduto(int posicao) {
        return this.produtos.get(posicao).toString();
    }

    public void editarDadosProduto(int posicao, Produto dadosEdicao) {
        Produto produtoExistente = this.produtos.get(posicao);

        produtoExistente.setMarca(dadosEdicao.getMarca());
        produtoExistente.setQuantidadeEstoque(dadosEdicao.getQuantidadeEstoque());
        produtoExistente.setSessao(dadosEdicao.getSessao());
        produtoExistente.setTipo(dadosEdicao.getTipo());
        produtoExistente.setNome(dadosEdicao.getNome());
    }


    public void adicionarProduto(Produto novoProduto) {

        List<Produto> produtosExistentes = this.produtos.stream().filter(produto ->
                novoProduto.getMarca().equals(produto.getMarca()) &&
                        novoProduto.getNome().equals(produto.getNome())).toList();

        if (!produtosExistentes.isEmpty()) {
            produtosExistentes.forEach(produto ->
                    produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() + novoProduto.getQuantidadeEstoque()));
        } else {
            produtos.add(novoProduto);
        }
    }

    public void excluirProduto(String id) {
        this.produtos = this.produtos.stream().filter(produto ->
                        !id.equals(produto.getId()))
                .collect(Collectors.toList());
    }


}
