/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.BD;
import projeto_lc_java.ClassesBasicas.Venda;
import projeto_lc_java.BD.Interfaces.IRepositorioVenda;
import projeto_lc_java.Exception.NfNaoEncontradaException;
/**
 *
 * @author NATI4
 */
public class RepositorioVendaLista implements IRepositorioVenda{
    private Venda venda;
    private RepositorioVendaLista ponteiro;
    
    
    //Métodos Básicos
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
       
    //Métodos da Interface
    @Override
    public void inserir(Venda venda){
        if(this.ponteiro == null){
            this.ponteiro.setVenda(venda);
            this.ponteiro = new RepositorioVendaLista();
        }else{
            this.ponteiro.inserir(venda);
        }
    }
    
    @Override
    public Venda consultar(String nf) throws NfNaoEncontradaException{
        if(this.venda.getNf().equals(nf)){
            return this.venda;
        }else{
            this.ponteiro.consultar(nf);
        }
        throw new NfNaoEncontradaException(nf);
    }
    
    @Override
    public void excluir(String nf){
       if(this.venda != null){
            if(this.venda.getNf().equals(nf)){
                this.venda = this.ponteiro.venda;
                this.ponteiro = this.ponteiro.ponteiro;
            }else{
                this.ponteiro.excluir(nf);
            }
        }
    }
    
    @Override
    public void atualizar(Venda venda){
        if(this.ponteiro.getVenda().getNf().equals(venda.getNf())){
            this.ponteiro.setVenda(venda);
        }else{
            atualizar(this.ponteiro.getPonteiro().getVenda());
        }
    }
    
    @Override
    public boolean jaExiste(String nf){
        if(this.venda.getNf().equals(nf)){
            return true;
        }else{
            this.ponteiro.jaExiste(nf);
        }
        return false;
    }
}
