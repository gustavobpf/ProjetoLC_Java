/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_lc_java.BD;

import projeto_lc_java.Produto;
/**
 *
 * @author Ana Carolina
 */
public class RepositorioProdutoArray {
    private Produto produto[];
    private int     indice;
    
    public RepositorioProdutoArray(){
        this.produto = new Produto[1000];
        this.indice  = 0;
    }
    
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
    
    public void inserirProduto(Produto produto){
        this.produto[this.indice] = produto;
        this.indice++;
    }
    
    public void excluirProduto(Produto produto){
        Produto aux[] = new Produto[100];
        int j=0;
        for(int i=0;i<this.indice;i++){
            if(!this.produto.equals(produto)){
                aux[j] = this.produto[i];
                j++;
            }
        }
        this.produto = aux;
    }
    
    public Produto consultarProduto(String descricao){
        for(int i=0;i<this.indice;i++){
            if(this.produto[i].getDescricao().equals(descricao)){
                return this.produto[i];
            }
        }
        return null;
    }
    
    public void atualizarProduto(String descricao, Produto produto){
        for(int i=0; i<this.indice;i++){
            if(this.produto[i].getDescricao().equals(descricao)){
              this.produto[i] = produto;
            }
        }
    }
    
}
