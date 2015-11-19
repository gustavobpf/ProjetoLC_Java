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
public class RepositorioCompraLista {
    private Compra compra;
    private RepositorioCompraLista ponteiro;
    
    
    public Compra getCompra(){
        return this.compra;
    }
    public void setCompra(Compra compra){
        this.compra = compra;
    }
    
    public RepositorioCompraLista getPonteiro(){
        return this.ponteiro;
    }
    
    public void setPonteiro(RepositorioCompraLista proximo){
        this.ponteiro = proximo;
    }
          
    public void inserir(RepositorioCompraLista proximo){
        RepositorioCompraLista aux;
        if(this.ponteiro.equals(null)){
            this.ponteiro.setPonteiro(proximo);
        }else{
            aux = this.ponteiro;
            inserir(aux);
        }
    }
    
    public Compra consultar(String nf){
        RepositorioCompraLista aux;
        if(this.compra.getNf().equals(nf)){
            return this.compra;
        }else{
            aux = this.ponteiro;
            consultar(aux.compra.getNf());
        }
        return null;
    }
    
    public void excluir(String nf){
        
        if(this.ponteiro.getCompra().getNf().equals(nf)){
            this.ponteiro.setPonteiro(proximo.getPonteiro());
            proximo.setPonteiro(null);
        }else{
            excluir(this.ponteiro.getPonteiro());
        }
    }
    
    public void atualizar(Compra compra){
        if(this.ponteiro.getCompra().getNf().equals(nf)){
            this.ponteiro.setCompra(compra);
        }else{
            atualizar(nf,this.ponteiro.getPonteiro().getCompra());
        }
    }
}
