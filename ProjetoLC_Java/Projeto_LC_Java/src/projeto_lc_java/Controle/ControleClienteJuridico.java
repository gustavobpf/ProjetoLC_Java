/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.Controle;

//Interfaces e Classes Básicas
import projeto_lc_java.BD.Interfaces.IRepositorioClienteJ;
import projeto_lc_java.ClassesBasicas.ClienteJuridico;

//Exccptions
import projeto_lc_java.Exception.ClienteJaCadastradoException;
import projeto_lc_java.Exception.ClienteNaoEncontradoException;

/**
 *
 * @author NATI4
 */
public class ControleClienteJuridico {
    private IRepositorioClienteJ clientes;
     
    public ControleClienteJuridico(IRepositorioClienteJ clientes){
        this.clientes = clientes;
    }

    public ControleClienteJuridico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    public void cadastrar(ClienteJuridico cliente) throws ClienteJaCadastradoException {
        if(cliente.getCnpj() != null || cliente.getCnpj() != "" || 
           cliente.getCnpj() != " "){
             if(!this.clientes.jaExiste(cliente.getCnpj())){
                this.clientes.inserir(cliente);
            }else{
                throw new ClienteJaCadastradoException(cliente.getCnpj());
            }
        }
    }
    
    public void remover(String cnpj) throws ClienteNaoEncontradoException {
        if(this.clientes.jaExiste(cnpj)){
            this.clientes.excluir(cnpj);
        }else{
            throw new ClienteNaoEncontradoException(cnpj);
        }
    }
    
    public void modificar(ClienteJuridico cliente) throws ClienteNaoEncontradoException {
         if(cliente.getCnpj() != null || cliente.getCnpj() != "" || 
           cliente.getCnpj() != " "){
            if(!this.clientes.jaExiste(cliente.getCnpj())){
                this.clientes.atualizar(cliente);
            }else{
                throw new ClienteNaoEncontradoException(cliente.getCnpj());
            }
        }
    }
    
    public ClienteJuridico procurar(String cnpj) throws ClienteNaoEncontradoException {
        if(cnpj != null || cnpj != "" || cnpj != " "){
            if(this.clientes.jaExiste(cnpj)){
                return this.clientes.consultar(cnpj);
            }else{
                throw new ClienteNaoEncontradoException(cnpj);
            }
        }else{
            throw new ClienteNaoEncontradoException(cnpj);
        }
    }
}
