/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.BD;
import projeto_lc_java.ClassesBasicas.Compra;
/**
 *
 * @author NATI4
 */
public class RepositorioCompraArray {
    private Compra compras[];
    private int    indice;
    
    public RepositorioCompraArray(){
        this.compras = new Compra[1000];
        this.indice   = 0;
    }
    
    
    //Métodos Básicos
    public Compra[] getCompras(){
        return this.compras;
    }
    
    public void setClientes(Compra compras[]){
        this.compras = compras;
    }
    
    public int getIndice(){
        return this.indice;
    }
    
    public void setIndice(int indice){
        this.indice = indice;
    }
    
    
    //Métodos da Interface
    public void inserirCompra(Compra compra){
        this.compras[this.indice] = compra;
        this.indice++;
    }
    
    public void excluirCompra(String nf){
        Compra aux[] = new Compra[1000];
        int j=0;
        for(int i=0; i<this.indice;i++){
           if(!this.compras[i].getNf().equals(nf)){
               aux[j] = this.compras[i];
               j++;
           }
        }
        this.compras = aux;
    }
    
    public Compra consultarCompra(String nf){
        for(int i=0;i<this.indice;i++){
            if(this.compras[i].getNf().equals(nf)){
                return this.compras[i];
            }
        }
        return null;
    }
    
    public void atualizarCompra(String nf, Compra compra){
        for(int i=0; i<this.indice;i++){
            if(this.compras[i].getNf().equals(nf)){
                this.compras[i] = compra;
            }
        }
    }
}
