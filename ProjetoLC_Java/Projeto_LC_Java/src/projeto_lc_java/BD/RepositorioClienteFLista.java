/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */     



package projeto_lc_java.BD;

//import java.util.List;
import projeto_lc_java.BD.Interfaces.IRepositorioClienteF;
import projeto_lc_java.ClassesBasicas.ClienteFisico;
import projeto_lc_java.Exception.ClienteNaoEncontradoException;

/**
 *
 * @author Aluno
 */
public class RepositorioClienteFLista implements IRepositorioClienteF{
    private ClienteFisico cliente;
    private RepositorioClienteFLista ponteiro;
    
   //Métodos Padroes 
    
    public ClienteFisico getCliente(){
        return this.cliente;
    }
    public void setCliente(ClienteFisico cliente){
        this.cliente = cliente;
    }
    
    public RepositorioClienteFLista getPonteiro(){
        return this.ponteiro;
    }
    
    public void setPonteiro(RepositorioClienteFLista proximo){
        this.ponteiro = proximo;
    }
    
    //Métodos da Interface
    @Override
    public void inserir(ClienteFisico cliente){
        if(this.ponteiro.equals(null)){
            this.ponteiro.setCliente(cliente);
            this.ponteiro = new RepositorioClienteFLista();
        }else{
            this.ponteiro.inserir(cliente);
        }
    }
    
    @Override
    public ClienteFisico consultar(String cpf) throws ClienteNaoEncontradoException{
        if(this.cliente.getCpf().equals(cpf)){
            return this.cliente;
        }else{
            this.ponteiro.consultar(cpf);
        }
        throw new ClienteNaoEncontradoException(cpf);
    }
    
    @Override
    public void excluir(String cpf) {
        if(this.cliente != null){
            if(this.cliente.getCpf().equals(cpf)){
                this.cliente = this.ponteiro.cliente;
                this.ponteiro = this.ponteiro.ponteiro;
            }else{
                this.ponteiro.excluir(cpf);
            }
        }
    }

    @Override
    public void atualizar(ClienteFisico cliente) {
        if(this.cliente.getCpf().equals(cliente.getCpf())){
            this.cliente = cliente;
        }else{
            this.ponteiro.atualizar(cliente);
        }
    }

    @Override
    public boolean jaExiste(String cpf) {
        if(this.cliente.getCpf().equals(cpf)){
            return true;
        }else{
            this.ponteiro.jaExiste(cpf);
        }
        return false;
    }

    
}