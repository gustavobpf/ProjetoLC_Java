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
public class RepositorioCompraLista implements IRepositorioCompra{
    private Compra compra;
    private RepositorioCompraLista ponteiro;
    
    //Métodos Básicos
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
          
    
    //Métodos da Interface
    
    @Override
    public void inserir(Compra compra){
        if(this.ponteiro == null){
            this.ponteiro.setCompra(compra);
            this.ponteiro = new RepositorioCompraLista();
        }else{
            this.ponteiro.inserir(compra);
        }
    }
    
    @Override
    public Compra consultar(String nf) throws NfNaoEncontradaException{
        if(this.compra.getNf().equals(nf)){
            return this.compra;
        }else{
            this.ponteiro.consultar(nf);
        }
        throw new NfNaoEncontradaException(nf);
    }
    
    @Override
    public void excluir(String nf){
        if(this.compra != null){
            if(this.compra.getNf().equals(nf)){
                this.compra = this.ponteiro.compra;
                this.ponteiro = this.ponteiro.ponteiro;
            }else{
                this.ponteiro.excluir(nf);
            }
        }
    }
    
    @Override
    public void atualizar(Compra compra){
        if(this.ponteiro.getCompra().getNf().equals(compra.getNf())){
            this.ponteiro.setCompra(compra);
        }else{
            atualizar(this.ponteiro.getPonteiro().getCompra());
        }
    }
    
    @Override
    public boolean jaExiste(String nf){
        if(this.compra.getNf().equals(nf)){
            return true;
        }else{
            this.ponteiro.jaExiste(nf);
        }
        return false;
    }
}
