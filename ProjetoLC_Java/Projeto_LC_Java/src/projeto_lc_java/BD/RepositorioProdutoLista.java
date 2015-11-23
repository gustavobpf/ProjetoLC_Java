/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.BD;

import projeto_lc_java.BD.Interfaces.IRepositorioProduto;
import projeto_lc_java.ClassesBasicas.Produto;
import projeto_lc_java.Exception.ProdutoNaoEncontradoException;
/**
 *
 * @author Andressa
 */
public class RepositorioProdutoLista implements IRepositorioProduto{
    private Produto produto;
    private RepositorioProdutoLista ponteiro;
    
    
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
    
    
    //Métodos da Interface
    @Override
    public void inserir(Produto produto){
        if(this.ponteiro == null){
            this.ponteiro.setProduto(produto);
            this.ponteiro = new RepositorioProdutoLista();
        }else{
            this.ponteiro.inserir(produto);
        }
    }
    
    @Override
    public Produto consultar(String cod) throws ProdutoNaoEncontradoException{
       if(this.produto.getCod().equals(cod)){
            return this.produto;
        }else{
            this.ponteiro.consultar(cod);
        }
       throw new ProdutoNaoEncontradoException(cod);
       // ;
    }
    
    @Override
    public void excluir(String cod){
        if(this.produto != null){
            if(this.produto.getCod().equals(cod)){
                this.produto = this.ponteiro.produto;
                this.ponteiro = this.ponteiro.ponteiro;
            }else{
                this.ponteiro.excluir(cod);
            }
        }
    }
    
    @Override
    public void atualizar(Produto produto){
        if(this.produto.getCod().equals(produto.getCod())){
            this.produto = produto;
        }else{
            this.ponteiro.atualizar(produto);
        }
    }
    
    @Override
    public boolean jaExiste(String cod){
        if(this.produto.getCod().equals(cod)){
            return true;
        }else{
            this.ponteiro.jaExiste(cod);
        }
        return false;
    }
}
