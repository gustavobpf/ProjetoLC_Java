/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.BD;

import projeto_lc_java.Produto;
/**
 *
 * @author Andressa
 */
public class RepositorioProdutoLista {
    private Produto produto;
    private RepositorioProdutoLista ponteiro;
    
    
    
    public RepositorioProdutoLista(Produto produto){
        this.produto = produto;
        this.ponteiro = null;
    }
    
    public Produto getProduto(){
        return this.produto;
    }
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    
    public RepositorioProdutoLista getPonteiro(){
        return this.ponteiro;
    }
    
    public void setPonteiro(RepositorioProdutoLista proximo){
        this.ponteiro = proximo;
    }
          
    public void inserirProduto(RepositorioProdutoLista proximo){
        RepositorioProdutoLista aux;
        if(this.ponteiro.equals(null)){
            this.ponteiro.setPonteiro(proximo);
        }else{
            aux = this.ponteiro;
            inserirProduto(aux);
        }
    }
    
    public Produto consultarProduto(String descricao){
        RepositorioProdutoLista aux;
        if(this.produto.getDescricao().equals(descricao)){
            return this.produto;
        }else{
            aux = this.ponteiro;
            consultarProduto(aux.produto.getDescricao());
        }
        return null;
    }
    
    public void excluirCliente(RepositorioProdutoLista proximo){
        
        if(this.ponteiro.getProduto().getDescricao().equals(proximo.getProduto().getDescricao())){
            this.ponteiro.setPonteiro(proximo.getPonteiro());
            proximo.setPonteiro(null);
        }else{
            excluirCliente(this.ponteiro.getPonteiro());
        }
    }
    
    public void atualizarCliente(String descricao, Produto produto){
        if(this.ponteiro.getProduto().getDescricao().equals(descricao)){
            this.ponteiro.setProduto(produto);
        }else{
            atualizarCliente(descricao,this.ponteiro.getPonteiro().getProduto());
        }
    }
}
