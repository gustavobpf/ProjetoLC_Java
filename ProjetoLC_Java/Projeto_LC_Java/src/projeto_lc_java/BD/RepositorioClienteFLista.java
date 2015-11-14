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
    /*
    public BancoClienteFLista proximo(){
        if(this.ponteiro != null){
            return this.ponteiro.getPonteiro();
        }else{
            return null;
        }
    }
    */
      
    public void inserirLista(RepositorioClienteFLista proximo){
        RepositorioClienteFLista aux;
        if(this.ponteiro.equals(null)){
            this.ponteiro.setPonteiro(proximo);
        }else{
            aux = this.ponteiro;
            inserirLista(aux);
        }
    }
    
    public ClienteFisico consultarLista(String cpf){
        RepositorioClienteFLista aux;
        if(this.cliente.getCpf().equals(cpf)){
            return this.cliente;
        }else{
            aux = this.ponteiro;
            consultarLista(aux.cliente.getCpf());
        }
        return null;
    }
    
    public void excluirLista(RepositorioClienteFLista proximo){
        RepositorioClienteFLista aux = null;
        /*
        if(this.ponteiro.equals(proximo)){
            aux.setPonteiro(this.ponteiro.getPonteiro());
            this.ponteiro.setPonteiro(aux);
            this.ponteiro.getPonteiro().getPonteiro().setPonteiro(null);
        }else{
            aux.setPonteiro(this.ponteiro);
            excluirLista(aux);
        }
        */
    }
    
}
