/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.Controle;
import projeto_lc_java.ClienteFisico;
//import projeto_lc_java.BD.RepositorioClienteFLista;
import projeto_lc_java.BD.RepositorioClienteFisicoArray;
//import projeto_lc_java.Exception.InserirClienteException;
//import projeto_lc_java.Exception.InserirRepositorioClienteException;

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
     
    public void cadastrarCliente(ClienteFisico cliente) /*throws InserirRepositorioClienteException*/{
        if(!cliente.getCpf().equals("") || !cliente.getCpf().equals(null) || !cliente.getCpf().equals(" ")) {
            clientes.inserirCliente(cliente);
        }
        /*
        else{
            InserirRepositorioClienteException e;
            e = new InserirRepositorioClienteException(cliente);
            throw e;
        }*/
    }
     
    public void removerCliente(String cpf) throws RepositorioException{
        //REGRA DE NEGOCIO
        clientes.excluirCliente(cpf);
    }
     
    public void modificarCliente(ClienteFisico cliente) throws RepositorioException{
        //REGRA DE NEGOCIO
        clientes.atualizarCliente(cliente.getCpf(),cliente);
    }
     
    public ClienteFisico procurarCliente(String cpf) throws RepositorioException{
        //REGRA DE NEGOCIO
        return (ClienteFisico) clientes.consultarCliente(cpf);
    }
}
