/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_lc_java.BD;

import projeto_lc_java.BD.Interfaces.IRepositorioClienteF;
import projeto_lc_java.ClassesBasicas.ClienteFisico;


import projeto_lc_java.Exception.ClienteNaoEncontradoException;


/**
 *
 * @author Marlene
 */
public class RepositorioClienteFisicoArray implements IRepositorioClienteF{
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
    
    
    @Override
    public void inserir(ClienteFisico cliente){
        if(this.indice < 1000){
            this.clientes[this.indice] = cliente;
            this.indice++;
        }
        
    }
    
    @Override
    public void excluir(String cpf){
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
    
    @Override
    public ClienteFisico consultar(String cpf) throws ClienteNaoEncontradoException{
        for(int i=0;i<this.indice;i++){
            if(this.clientes[i].getCpf().equals(cpf)){
                return this.clientes[i];
            }
        }
        throw new ClienteNaoEncontradoException(cpf);
    }
    
    @Override
    public void atualizar(ClienteFisico cliente){
        for(int i=0; i<this.indice;i++){
            if(this.clientes[i].getCpf().equals(cliente.getCpf())){
                this.clientes[i] = cliente;
            }
        }
    }
    
    
     public boolean jaExiste(String cpf){
        for(int i=0;i<this.indice;i++){
            if(!this.clientes[i].getCpf().equals(cpf)){
                return false;
            }
        }
        return true;
    }
     
}
