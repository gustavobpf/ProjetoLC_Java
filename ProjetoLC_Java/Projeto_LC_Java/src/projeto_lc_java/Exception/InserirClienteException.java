/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.Exception;

import projeto_lc_java.ClassesBasicas.ClienteFisico;

/**
 *
 * @author ProExC
 */
public class InserirClienteException extends Exception{
    private ClienteFisico cliente;
    
    public InserirClienteException(ClienteFisico cliente){
        super("Limite de Cadastro excedido!");
        this.cliente = cliente;
    }
    
    public ClienteFisico getCliente(){
        return this.cliente;
    }
    public void setCliente(ClienteFisico cliente){
        this.cliente = cliente;
    }
    
}
