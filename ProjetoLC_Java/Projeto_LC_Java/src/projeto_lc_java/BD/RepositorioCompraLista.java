/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.BD;
import projeto_lc_java.Compra;

/**
 *
 * @author NATI4
 */
public class RepositorioCompraLista {
    private Compra compra;
    private RepositorioCompraLista ponteiro;
    
    public RepositorioCompraLista(Compra compra){
        this.compra = compra;
        this.ponteiro = null;
    }
    
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
          
    public void inserirCompra(RepositorioCompraLista proximo){
        RepositorioCompraLista aux;
        if(this.ponteiro.equals(null)){
            this.ponteiro.setPonteiro(proximo);
        }else{
            aux = this.ponteiro;
            inserirCompra(aux);
        }
    }
    
    public Compra consultarCompra(String nf){
        RepositorioCompraLista aux;
        if(this.compra.getNf().equals(nf)){
            return this.compra;
        }else{
            aux = this.ponteiro;
            consultarCompra(aux.compra.getNf());
        }
        return null;
    }
    
    public void excluirCompra(RepositorioCompraLista proximo){
        
        if(this.ponteiro.getCompra().getNf().equals(proximo.getCompra().getNf())){
            this.ponteiro.setPonteiro(proximo.getPonteiro());
            proximo.setPonteiro(null);
        }else{
            excluirCompra(this.ponteiro.getPonteiro());
        }
    }
    
    public void atualizarCompra(String nf, Compra compra){
        if(this.ponteiro.getCompra().getNf().equals(nf)){
            this.ponteiro.setCompra(compra);
        }else{
            atualizarCompra(nf,this.ponteiro.getPonteiro().getCompra());
        }
    }
}
