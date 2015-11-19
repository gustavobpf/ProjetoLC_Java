/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.Controle;

//Interfaces e Classes Básicas
import projeto_lc_java.BD.Interfaces.IRepositorioClienteF;
import projeto_lc_java.ClassesBasicas.ClienteFisico;

//Exccptions
import projeto_lc_java.Exception.ClienteJaCadastradoException;
import projeto_lc_java.Exception.ClienteNaoEncontradoException;

/**
 *
 * @author NATI4
 */
public class ControleClienteFisico {
    private IRepositorioClienteF clientes;
     
    public ControleClienteFisico(IRepositorioClienteF clientes){
        this.clientes = clientes;
    }

    public ControleClienteFisico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    public void cadastrar(ClienteFisico cliente) throws ClienteJaCadastradoException {
        if(cliente.getCpf() != null || cliente.getCpf() != "" || 
           cliente.getCpf() != " "){
             if(!this.clientes.jaExiste(cliente.getCpf())){
                this.clientes.inserir(cliente);
            }else{
                throw new ClienteJaCadastradoException(cliente.getCpf());
            }
        }
    }
    
    public void remover(String cpf) throws ClienteNaoEncontradoException {
        if(this.clientes.jaExiste(cpf)){
            this.clientes.excluir(cpf);
        }else{
            throw new ClienteNaoEncontradoException(cpf);
        }
    }
    
    public void modificar(ClienteFisico cliente) throws ClienteNaoEncontradoException {
        if(this.clientes.jaExiste(cliente.getCpf())){
            this.clientes.atualizar(cliente);
        }else{
            throw new ClienteNaoEncontradoException(cliente.getCpf());
        }
    }
    
    public ClienteFisico procurar(String cpf) throws ClienteNaoEncontradoException {
        if(this.clientes.jaExiste(cpf)){
            return this.clientes.consultar(cpf);
        }else{
            throw new ClienteNaoEncontradoException(cpf);
        }
    }
}
