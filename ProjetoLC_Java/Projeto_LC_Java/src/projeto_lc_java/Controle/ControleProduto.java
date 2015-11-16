/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.Controle;
import projeto_lc_java.Produto;
//import projeto_lc_java.BD.RepositorioProdutoLista;
import projeto_lc_java.BD.RepositorioProdutoArray;



/**
 *
 * @author NATI4
 */
public class ControleProduto {
    private RepositorioProdutoArray produtos;
     
    //private RepositorioClienteJLista clientes = new RepositorioClienteJLista();
     
    public ControleProduto(RepositorioProdutoArray produto){
        this.produtos = produto;
    }
     
    public void cadastrarCliente(Produto produto) throws RepositorioException{
        //REGRA DE NEGOCIO
        produtos.inserirProduto(produto);
    }
     
    public void removerCliente(Produto produto) throws RepositorioException{
        //REGRA DE NEGOCIO
        produtos.excluirProduto(produto);
    }
     
    public void modificarCliente(Produto produto) throws RepositorioException{
        //REGRA DE NEGOCIO
        produtos.atualizarProduto(produto.getDescricao(),produto);
    }
     
    public Produto procurarProduto(String descricao){
        //REGRA DE NEGOCIO
        return (Produto) produtos.consultarProduto(descricao);
    }
}
