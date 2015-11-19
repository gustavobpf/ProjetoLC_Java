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
public class InserirRepositorioClienteException extends Exception{
    private ClienteFisico cliente;
    
    public InserirRepositorioClienteException(ClienteFisico cliente){
        super("CPF do cliente Invalido!");
        this.cliente = cliente;
    }
    
    public ClienteFisico getCliente(){
        return this.cliente;
    }
    public void setCliente(ClienteFisico cliente){
        this.cliente = cliente;
    }
}
