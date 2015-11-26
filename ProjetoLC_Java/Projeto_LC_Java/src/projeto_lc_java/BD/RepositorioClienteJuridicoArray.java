/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_lc_java.BD;

import projeto_lc_java.BD.Interfaces.IRepositorioClienteJ;
import projeto_lc_java.ClassesBasicas.ClienteJuridico;

/**
 *
 * @author Marlene
 */
public class RepositorioClienteJuridicoArray implements IRepositorioClienteJ{
    private ClienteJuridico clientes[];
    private int     indice;
    
    public RepositorioClienteJuridicoArray(){
        this.clientes = new ClienteJuridico[1000];
        this.indice   = 0;
    }
    
    //Métodos Padrões da classe
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
    
    
    //Métodos da Interface
    @Override
    public void inserir(ClienteJuridico cliente){
        this.clientes[this.indice] = cliente;
        this.indice++;
    }
    
    @Override
    public void excluir(String cnpj){
        ClienteJuridico aux[] = new ClienteJuridico[1000];
        int j=0;
        for(int i=0; i<this.indice-1;i++){
           if(this.clientes[i].getCnpj() != cnpj){
               aux[j] = this.clientes[i];
               j++;
           }
        }
        this.clientes = aux;
    }
    
    @Override
    public ClienteJuridico consultar(String cnpj){
        ClienteJuridico aux = new ClienteJuridico();
        for(int i=0;i<this.indice-1;i++){
            if(this.clientes[i].getCnpj().equals(cnpj)){
                aux = this.clientes[i];
            }
        }
        return aux;
    }
    
    @Override
    public void atualizar(ClienteJuridico cliente){
        for(int i=0; i<this.indice-1;i++){
            if(this.clientes[i].getCnpj().equals(cliente.getCnpj())){
                this.clientes[i] = cliente;
            }
        }
    }

    @Override
    public boolean jaExiste(String cnpj) {
        for(int i=0;i<this.indice-1;i++){
            if(this.clientes[i].getCnpj().equals(cnpj)){
                return true;
            }
        }
        return false;
    }
    
}
