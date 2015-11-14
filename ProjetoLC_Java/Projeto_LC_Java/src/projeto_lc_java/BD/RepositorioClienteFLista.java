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
public class RepositorioClienteFLista {
    private ClienteFisico cliente;
    private RepositorioClienteFLista ponteiro;
    // private BancoClienteFLista ultimo;
    
    
    
    public RepositorioClienteFLista(ClienteFisico cliente){
        this.cliente = cliente;
        this.ponteiro = null;
        //this.ultimo = null;
    }
    
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
          
    public void inserirCliente(RepositorioClienteFLista proximo){
        RepositorioClienteFLista aux;
        if(this.ponteiro.equals(null)){
            this.ponteiro.setPonteiro(proximo);
        }else{
            aux = this.ponteiro;
            inserirCliente(aux);
        }
    }
    
    public ClienteFisico consultarCliente(String cpf){
        RepositorioClienteFLista aux;
        if(this.cliente.getCpf().equals(cpf)){
            return this.cliente;
        }else{
            aux = this.ponteiro;
            consultarCliente(aux.cliente.getCpf());
        }
        return null;
    }
    
    public void excluirCliente(RepositorioClienteFLista proximo){
        RepositorioClienteFLista aux = null;
        if(this.ponteiro.getCliente().getCpf().equals(proximo.getCliente().getCpf())){
            this.ponteiro.setPonteiro(proximo.getPonteiro());
            proximo.setPonteiro(null);
        }else{
            this.ponteiro.consultarCliente(this.ponteiro.getPonteiro().getCliente().getCpf());
        }
    }
    
}
