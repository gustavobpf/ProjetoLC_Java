/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.Controle;
import projeto_lc_java.ClienteFisico;

//Exccptions
import projeto_lc_java.Exception.ClienteJaCadastradoException;
import projeto_lc_java.Exception.ClienteNaoEncontradoException;

//Repositorios
import projeto_lc_java.BD.RepositorioClienteFisicoArray;
//import projeto_lc_java.BD.RepositorioClienteFLista;


/**
 *
 * @author NATI4
 */
public class ControleClienteFisico {
    private RepositorioClienteFisicoArray clientes;
     
    //private RepositorioClienteJLista clientes = new RepositorioClienteJLista();
     
    public ControleClienteFisico(RepositorioClienteFisicoArray cliente){
        this.clientes = cliente;
    }
     
    public void cadastrar(ClienteFisico cliente) throws ClienteNaoEncontradoException,ClienteJaCadastradoException {
        if(this.clientes.consultar(cliente.getCpf()) == null){
            this.clientes.inserir(cliente);
        }else{
            throw new ClienteJaCadastradoException(cliente.getCpf());
        }
    }
    
    
}
