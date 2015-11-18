/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */     



package projeto_lc_java.BD;

//import java.util.List;
import projeto_lc_java.ClienteFisico;

/**
 *
 * @author Aluno
 */
public class RepositorioClienteFLista implements IRepositorioCliente{
    private ClienteFisico cliente;
    private RepositorioClienteFLista ponteiro;
    // private BancoClienteFLista ultimo;
    
    
    
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
    public ClienteFisico consultar(String cpf){
        RepositorioClienteFLista aux;
        if(this.cliente.getCpf().equals(cpf)){
            return this.cliente;
        }else{
            aux = this.ponteiro;
            consultar(aux.cliente.getCpf());
        }
        return null;
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
    
    
    /*
    public void excluir(String cpf){
        
        if(this.cliente.getCpf().equals(cpf)){
            this.ponteiro.setPonteiro(proximo.getPonteiro());
            proximo.setPonteiro(null);
        }else{
            excluir(this.ponteiro.getPonteiro());
        }
    }
    
    public void atualizar(ClienteFisico cliente){
        if(this.ponteiro.getCliente().getCpf().equals(cliente.getCpf())){
            this.ponteiro.setCliente(cliente);
        }else{
            atualizar(this.ponteiro.getPonteiro().getCliente());
        }
    }
    
    */

    
}