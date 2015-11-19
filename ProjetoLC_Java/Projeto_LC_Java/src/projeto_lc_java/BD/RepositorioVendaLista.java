/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.BD;
import projeto_lc_java.ClassesBasicas.Venda;
/**
 *
 * @author NATI4
 */
public class RepositorioVendaLista {
    private Venda venda;
    private RepositorioVendaLista ponteiro;
    
    public RepositorioVendaLista(Venda venda){
        this.venda = venda;
        this.ponteiro = null;
    }
    
    public Venda getVenda(){
        return this.venda;
    }
    public void setVenda(Venda venda){
        this.venda = venda;
    }
    
    public RepositorioVendaLista getPonteiro(){
        return this.ponteiro;
    }
    
    public void setPonteiro(RepositorioVendaLista proximo){
        this.ponteiro = proximo;
    }
          
    public void inserirCompra(RepositorioVendaLista proximo){
        RepositorioVendaLista aux;
        if(this.ponteiro.equals(null)){
            this.ponteiro.setPonteiro(proximo);
        }else{
            aux = this.ponteiro;
            inserirCompra(aux);
        }
    }
    
    public Venda consultarVenda(String nf){
        RepositorioVendaLista aux;
        if(this.venda.getNf().equals(nf)){
            return this.venda;
        }else{
            aux = this.ponteiro;
            consultarVenda(aux.venda.getNf());
        }
        return null;
    }
    
    public void excluirVenda(RepositorioVendaLista proximo){
        
        if(this.ponteiro.getVenda().getNf().equals(proximo.getVenda().getNf())){
            this.ponteiro.setPonteiro(proximo.getPonteiro());
            proximo.setPonteiro(null);
        }else{
            excluirVenda(this.ponteiro.getPonteiro());
        }
    }
    
    public void atualizarVenda(String nf, Venda venda){
        if(this.ponteiro.getVenda().getNf().equals(nf)){
            this.ponteiro.setVenda(venda);
        }else{
            atualizarVenda(nf,this.ponteiro.getPonteiro().getVenda());
        }
    }
}
