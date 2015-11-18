/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_lc_java.BD;

import projeto_lc_java.ClienteFisico;
import projeto_lc_java.Exception.InserirClienteException;
import projeto_lc_java.Exception.ConsultarClienteException;
import projeto_lc_java.Exception.AtualizarClienteException;

/**
 *
 * @author Marlene
 */
public class RepositorioClienteFisicoArray {
    private ClienteFisico clientes[];
    private int           indice;
    
    public RepositorioClienteFisicoArray(){
        this.clientes = new ClienteFisico[1000];
        this.indice   = 0;
    }
    
    public ClienteFisico[] getClientes(){
        return this.clientes;
    }
    
    public void setClientes(ClienteFisico cliente[]){
        this.clientes = cliente;
    }
    
    public int getIndice(){
        return this.indice;
    }
    
    public void setIndice(int indice){
        this.indice = indice;
    }
    
    
    
    public void inserirCliente(ClienteFisico cliente) throws InserirClienteException{
        if(this.indice < 1000){
            this.clientes[this.indice] = cliente;
            this.indice++;
        }else{
            InserirClienteException e;
            e = new InserirClienteException(cliente);
            throw e;
        }
        
    }
    
    public void excluirCliente(String cpf){
        ClienteFisico aux[] = new ClienteFisico[1000];
        int j=0;
        for(int i=0; i<this.indice;i++){
           if(!this.clientes[i].getCpf().equals(cpf)){
               aux[j] = this.clientes[i];
               j++;
           }
        }
        this.clientes = aux;
    }
    
    public ClienteFisico consultarCliente(String cpf) throws ConsultarClienteException{
        for(int i=0;i<this.indice;i++){
            if(this.clientes[i].getCpf().equals(cpf)){
                return this.clientes[i];
            }else{
                ConsultarClienteException e;
                e = new ConsultarClienteException(cpf);
                throw e;
            }
        }
        return null;
    }
    
    public void atualizarCliente(String cpf, ClienteFisico cliente) throws AtualizarClienteException{
        for(int i=0; i<this.indice;i++){
            if(this.clientes[i].getCpf().equals(cpf)){
                this.clientes[i] = cliente;
            }else{
                AtualizarClienteException e;
                e = new AtualizarClienteException(cliente);
                throw e;
            }
        }
    }
}
