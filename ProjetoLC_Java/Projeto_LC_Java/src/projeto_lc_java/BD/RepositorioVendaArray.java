/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.BD;
import projeto_lc_java.ClassesBasicas.Venda;
import projeto_lc_java.BD.Interfaces.IRepositorioVenda;

/**
 *
 * @author NATI4
 */
public class RepositorioVendaArray implements IRepositorioVenda{
    private Venda vendas[];
    private int    indice;
    
    public RepositorioVendaArray(){
        this.vendas = new Venda[1000];
        this.indice   = 0;
    }
    
    
    //Métodos Classe Básica
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
    
    //Métodos da Interface
    
    @Override
    public void inserir(Venda venda){
        this.vendas[this.indice] = venda;
        this.indice++;
    }
    
    @Override
    public void excluir(String nf){
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
    
    @Override
    public Venda consultar(String nf){
        for(int i=0;i<this.indice;i++){
            if(this.vendas[i].getNf().equals(nf)){
                return this.vendas[i];
            }
        }
        return null;
    }
    
    @Override
    public void atualizar(Venda venda){
        for(int i=0; i<this.indice;i++){
            if(this.vendas[i].getNf().equals(venda.getNf())){
                this.vendas[i] = venda;
            }
        }
    }
    
    @Override
    public boolean jaExiste(String nf){
         for(int i=0;i<this.indice;i++){
            if(this.vendas[i].getNf().equals(nf)){
                return true;
            }
        }
        return false;
    }
}
