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
public class ClienteNaoEncontradoException extends Exception{
    private String cpf;
    
    public ClienteNaoEncontradoException(String cpf){
        super("Cliente não encontrado!");
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
