/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.BD;

import projeto_lc_java.BD.Interfaces.IRepositorioClienteJ;
import projeto_lc_java.ClassesBasicas.ClienteJuridico;
import projeto_lc_java.Exception.ClienteNaoEncontradoException;

/**
 *
 * @author Andressa
 */
public class RepositorioClienteJLista implements IRepositorioClienteJ{
    
    private ClienteJuridico cliente;
    private RepositorioClienteJLista ponteiro;
    
    
    //Métodos Padroes 
    public ClienteJuridico getCliente(){
        return this.cliente;
    }
    public void setCliente(ClienteJuridico cliente){
        this.cliente = cliente;
    }
    
    public RepositorioClienteJLista getPonteiro(){
        return this.ponteiro;
    }
    
    public void setPonteiro(RepositorioClienteJLista proximo){
        this.ponteiro = proximo;
    }
    
    
    //Métodos da Interface
    public void inserir(ClienteJuridico cliente){
        if(this.ponteiro == null){
            this.ponteiro.setCliente(cliente);
            this.ponteiro = new RepositorioClienteJLista();
        }else{
            this.ponteiro.inserir(cliente);
        }
    }
    
    public ClienteJuridico consultar(String cnpj) throws ClienteNaoEncontradoException{
        if(this.cliente.getCnpj().equals(cnpj)){
            return this.cliente;
        }else{
            this.ponteiro.consultar(cnpj);
        }
        throw new ClienteNaoEncontradoException(cnpj);
    }
    
    public void excluir(String cnpj){
        if(this.cliente != null){
            if(this.cliente.getCnpj().equals(cnpj)){
                this.cliente = this.ponteiro.cliente;
                this.ponteiro = this.ponteiro.ponteiro;
            }else{
                this.ponteiro.excluir(cnpj);
            }
        }
    }
    
    public void atualizar(ClienteJuridico cliente){
         if(this.cliente.getCnpj().equals(cliente.getCnpj())){
            this.cliente = cliente;
        }else{
            this.ponteiro.atualizar(cliente);
        }
    }


    @Override
    public boolean jaExiste(String cnpj) {
        if(this.cliente.getCnpj().equals(cnpj)){
            return true;
        }else{
            this.ponteiro.jaExiste(cnpj);
        }
        return false;
    }
    
}
