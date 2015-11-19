/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.BD;
import projeto_lc_java.BD.Interfaces.IRepositorioCompra;
import projeto_lc_java.ClassesBasicas.Compra;
import projeto_lc_java.Exception.NfNaoEncontradaException;
/**
 *
 * @author NATI4
 */
public class RepositorioCompraArray implements IRepositorioCompra{
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
    @Override
    public void inserir(Compra compra){
        this.compras[this.indice] = compra;
        this.indice++;
    }
    
    @Override
    public void excluir(String nf){
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
    
    
    @Override
    public Compra consultar(String nf) throws NfNaoEncontradaException{
        for(int i=0;i<this.indice;i++){
            if(this.compras[i].getNf().equals(nf)){
                return this.compras[i];
            }
        }
        throw new NfNaoEncontradaException(nf);
    }
    
    @Override
    public void atualizar(Compra compra){
        for(int i=0; i<this.indice;i++){
            if(this.compras[i].getNf().equals(compra.getNf())){
                this.compras[i] = compra;
            }
        }
    }
    
    @Override
    public boolean jaExiste(String nf){
        for(int i=0;i<this.indice;i++){
                if(this.compras[i].getNf().equals(nf)){
                    return true;
                }
            }
        return false;
    }
}
