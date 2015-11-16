/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.BD;
import projeto_lc_java.Venda;

/**
 *
 * @author NATI4
 */
public class RepositorioVendaArray {
     private Venda vendas[];
    private int    indice;
    
    public RepositorioVendaArray(){
        this.vendas = new Venda[1000];
        this.indice   = 0;
    }
    
    public Venda[] getVendas(){
        return this.vendas;
    }
    
    public void setClientes(Venda vendas[]){
        this.vendas = vendas;
    }
    
    public int getIndice(){
        return this.indice;
    }
    
    public void setIndice(int indice){
        this.indice = indice;
    }
    
    
    
    public void inserirVenda(Venda venda){
        this.vendas[this.indice] = venda;
        this.indice++;
    }
    
    public void excluirVenda(String nf){
        Venda aux[] = new Venda[1000];
        int j=0;
        for(int i=0; i<this.indice;i++){
           if(!this.vendas[i].getNf().equals(nf)){
               aux[j] = this.vendas[i];
               j++;
           }
        }
        this.vendas = aux;
    }
    
    public Venda consultarVenda(String nf){
        for(int i=0;i<this.indice;i++){
            if(this.vendas[i].getNf().equals(nf)){
                return this.vendas[i];
            }
        }
        return null;
    }
    
    public void atualizarVenda(String nf, Venda venda){
        for(int i=0; i<this.indice;i++){
            if(this.vendas[i].getNf().equals(nf)){
                this.vendas[i] = venda;
            }
        }
    }
}
