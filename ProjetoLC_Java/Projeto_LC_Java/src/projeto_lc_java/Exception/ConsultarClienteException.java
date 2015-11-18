/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.Exception;


/**
 *
 * @author ProExC
 */
public class ConsultarClienteException extends Exception{
    private String cpf;
    
    public ConsultarClienteException(String cpf){
        super("Cliente não encontrado!");
        this.cpf = cpf;
    }
    
    public String getCliente(){
        return this.cpf;
    }
    public void setCliente(String cpf){
        this.cpf = cpf;
    }
}
