/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_lc_java.BD;

import projeto_lc_java.ClienteJuridico;

/**
 *
 * @author Marlene
 */
public class BancoClienteJuridico {
    private ClienteJuridico clientes[];
    private int     indice;
    
    public BancoClienteJuridico(){
        this.clientes = new ClienteJuridico[1000];
        this.indice   = 0;
    }
    
    public ClienteJuridico[] getClientes(){
        return this.clientes;
    }
    
    public void setClientes(ClienteJuridico cliente[]){
        this.clientes = cliente;
    }
    
    public int getIndice(){
        return this.indice;
    }
    
    public void setIndice(int indice){
        this.indice = indice;
    }
    
    
    
    public void cadastrarCliente(ClienteJuridico cliente){
        this.clientes[this.indice] = cliente;
        this.indice++;
    }
    
    public void excluirCliente(String cpf){
        ClienteJuridico aux[] = new ClienteJuridico[1000];
        int j=0;
        for(int i=0; i<this.indice;i++){
           if(this.clientes[i].getCnpj() != cpf){
               aux[j] = this.clientes[i];
               j++;
           }
        }
        clientes = aux;
    }
    
    public ClienteJuridico consultarCliente(String cpf){
        ClienteJuridico aux = new ClienteJuridico();
        for(int i=0;i<this.indice;i++){
            if(this.clientes[i].getCnpj().equals(cpf)){
                aux = this.clientes[i];
            }
        }
        return aux;
    }
    
    public void atualizarCliente(ClienteJuridico cliente){
        for(int i=0; i<this.indice;i++){
            if(this.clientes[i].getCnpj().equals(cliente.getCnpj())){
                this.clientes[i] = cliente;
            }
        }
    }
}
