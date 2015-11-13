/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_lc_java.BD;

import projeto_lc_java.ClienteFisico;

/**
 *
 * @author Marlene
 */
public class BancoClienteFisico {
    private ClienteFisico clientes[];
    private int           indice;
    
    public BancoClienteFisico(){
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
    
    
    
    public void inserirCliente(ClienteFisico cliente){
        this.clientes[this.indice] = cliente;
        this.indice++;
    }
    
    public void excluirCliente(String cpf){
        ClienteFisico aux[] = new ClienteFisico[1000];
        int j=0;
        for(int i=0; i<this.indice;i++){
           if(this.clientes[i].getCpf() != cpf){
               aux[j] = this.clientes[i];
               j++;
           }
        }
        clientes = aux;
    }
    
    public ClienteFisico consultarCliente(String cpf){
        ClienteFisico aux = new ClienteFisico();
        for(int i=0;i<this.indice;i++){
            if(this.clientes[i].getCpf().equals(cpf)){
                aux = this.clientes[i];
                break;
            }
        }
        return aux;
    }
    
    public void atualizarCliente(String cpf, ClienteFisico cliente){
        for(int i=0; i<this.indice;i++){
            if(this.clientes[i].getCpf().equals(cpf)){
                this.clientes[i] = cliente;
            }
        }
    }
}
