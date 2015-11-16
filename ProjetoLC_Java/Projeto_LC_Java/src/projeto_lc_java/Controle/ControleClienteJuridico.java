/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.Controle;
//import projeto_lc_java.BD.RepositorioClienteJLista;
import projeto_lc_java.BD.RepositorioClienteJuridicoArray;
import projeto_lc_java.ClienteJuridico;

/**
 *
 * @author NATI4
 */
public class ControleClienteJuridico {
    private RepositorioClienteJuridicoArray clientes;
     
    //private RepositorioClienteJLista clientes = new RepositorioClienteJLista();
     
    public ControleClienteJuridico(RepositorioClienteJuridicoArray cliente){
        this.clientes = cliente;
    }
     
    public void cadastrarCliente(ClienteJuridico cliente) throws RepositorioException{
        //REGRA DE NEGOCIO
        clientes.inserirCliente(cliente);
    }
     
    public void removerCliente(String cnpj) throws RepositorioException{
        //REGRA DE NEGOCIO
        clientes.excluirCliente(cnpj);
    }
     
    public void modificarCliente(ClienteJuridico cliente) throws RepositorioException{
        //REGRA DE NEGOCIO
        clientes.atualizarCliente(cliente.getCnpj(),cliente);
    }
     
    public ClienteJuridico procurarCliente(String cnpj){
        //REGRA DE NEGOCIO
        return (ClienteJuridico) clientes.consultarCliente(cnpj);
    }
}
