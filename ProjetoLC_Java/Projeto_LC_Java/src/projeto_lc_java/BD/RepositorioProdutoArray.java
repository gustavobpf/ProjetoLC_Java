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
 * @author Ana Carolina
 */
public class RepositorioProdutoArray implements IRepositorioProduto{
    private Produto produto[];
    private int     indice;
    
    public RepositorioProdutoArray(){
        this.produto = new Produto[1000];
        this.indice  = 0;
    }
    
    //Métodos Padrões
    public Produto[] getProduto(){
        return this.produto;
    }
    public void setProduto(Produto produto[]){
        this.produto = produto;
    }
    
    public int getIndice(){
        return this.indice;
    }
    public void setIndice(int indice){
        this.indice = indice;
    }
    
    //Métodos da Interface
    @Override
    public void inserir(Produto produto){
        this.produto[this.indice] = produto;
        this.indice++;
    }
    
    @Override
    public void excluir(String cod){
        Produto aux[] = new Produto[100];
        int j=0;
        for(int i=0;i<this.indice;i++){
            if(!this.produto[i].getCod().equals(cod)){
                aux[j] = this.produto[i];
                j++;
            }
        }
        this.produto = aux;
    }
    
    @Override
    public Produto consultar(String cod) throws ProdutoNaoEncontradoException{
        for(int i=0;i<this.indice;i++){
            if(this.produto[i].getDescricao().equals(cod)){
                return this.produto[i];
            }
        }
        throw new ProdutoNaoEncontradoException(cod);
    }
    
    @Override
    public void atualizar(Produto produto){
        for(int i=0; i<this.indice;i++){
            if(this.produto[i].getCod().equals(produto.getCod())){
              this.produto[i] = produto;
            }
        }
    }
    
    @Override
    public boolean jaExiste(String cod){
        for(int i=0;i<this.indice;i++){
            if(this.produto[i].getCod().equals(cod)){
                return true;
            }
        }
        return false;
    }
    
}
