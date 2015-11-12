/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_lc_java;

/**
 *
 * @author Aluno
 */
public class Venda extends Transacao {
    private ClienteFisico cliente;
    
    
    //Construtor de Venda sem parâmetros
    public Venda(){
        this.cliente = null;
    }
    //Construtor de Venda com todos os parâmetros
    public Venda(ClienteFisico cliente){
        this.cliente = cliente;
    }
    
    //Métodos Get's and Set's
    
//Cliente
    public ClienteFisico getCliente(){
        return this.cliente;
    }
    public void setCliente(ClienteFisico cliente){
        this.cliente = cliente;
    }
    

}
