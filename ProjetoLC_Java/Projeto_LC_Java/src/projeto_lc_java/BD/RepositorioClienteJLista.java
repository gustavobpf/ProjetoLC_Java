/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.BD;

import projeto_lc_java.ClienteJuridico;

/**
 *
 * @author Andressa
 */
public class RepositorioClienteJLista {
    
    private ClienteJuridico cliente;
    private RepositorioClienteJLista ponteiro;
    // private BancoClienteFLista ultimo;
    
    
    
    public RepositorioClienteJLista(ClienteJuridico cliente){
        this.cliente = cliente;
        this.ponteiro = null;
    }
    
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
          
    public void inserirCliente(RepositorioClienteJLista proximo){
        RepositorioClienteJLista aux;
        if(this.ponteiro.equals(null)){
            this.ponteiro.setPonteiro(proximo);
        }else{
            aux = this.ponteiro;
            inserirCliente(aux);
        }
    }
    
    public ClienteJuridico consultarCliente(String cnpj){
        RepositorioClienteJLista aux;
        if(this.cliente.getCnpj().equals(cnpj)){
            return this.cliente;
        }else{
            aux = this.ponteiro;
            consultarCliente(aux.cliente.getCnpj());
        }
        return null;
    }
    
    public void excluirCliente(RepositorioClienteJLista proximo){
        
        if(this.ponteiro.getCliente().getCnpj().equals(proximo.getCliente().getCnpj())){
            this.ponteiro.setPonteiro(proximo.getPonteiro());
            proximo.setPonteiro(null);
        }else{
            excluirCliente(this.ponteiro.getPonteiro());
        }
    }
    
    public void atualizarCliente(String cnpj, ClienteJuridico cliente){
        if(this.ponteiro.getCliente().getCnpj().equals(cnpj)){
            this.ponteiro.setCliente(cliente);
        }else{
            atualizarCliente(cnpj,this.ponteiro.getPonteiro().getCliente());
        }
    }
}
