/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.Controle;
import projeto_lc_java.BD.Interfaces.IRepositorioClienteF;
import projeto_lc_java.ClassesBasicas.ClienteFisico;

//Exccptions
import projeto_lc_java.Exception.ClienteJaCadastradoException;
import projeto_lc_java.Exception.ClienteNaoEncontradoException;

//Repositorios
//import projeto_lc_java.BD.RepositorioClienteFisicoArray;
//import projeto_lc_java.BD.RepositorioClienteFLista;


/**
 *
 * @author NATI4
 */
public class ControleClienteFisico {
    private IRepositorioClienteF clientes;
     
    //private RepositorioClienteJLista clientes = new RepositorioClienteJLista();
     
    public ControleClienteFisico(IRepositorioClienteF clientes){
        this.clientes = clientes;
    }

    public ControleClienteFisico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    public void cadastrar(ClienteFisico cliente) throws ClienteJaCadastradoException {
        if(!this.clientes.jaExiste(cliente.getCpf())){
            this.clientes.inserir(cliente);
        }else{
            throw new ClienteJaCadastradoException(cliente.getCpf());
        }
    }
    
    public void remover(String cpf){
        if(this.clientes.jaExiste(cpf)){
            this.clientes.excluir(cpf);
        }
    }
    
    
}
