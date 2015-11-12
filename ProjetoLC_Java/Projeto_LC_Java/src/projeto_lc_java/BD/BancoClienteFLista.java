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
public class BancoClienteFLista {
    private ClienteFisico cliente;
    private BancoClienteFLista proximo;
    
    
    public BancoClienteFLista(ClienteFisico cliente){
        this.cliente = cliente;
        this.proximo = null;
    }
    
    public ClienteFisico getCliente(){
        return this.cliente;
    }
    public void setCliente(ClienteFisico cliente){
        this.cliente = cliente;
    }
    
    public BancoClienteFLista getLista(){
        return this.proximo;
    }
    
    public void setLista(BancoClienteFLista proximo){
        this.proximo = proximo;
    }
   
      
    public void inserirLista(BancoClienteFLista proximo){
        this.proximo.setLista(proximo.getLista());
    }
    
    public ClienteFisico consultarLista(String cpf){
        BancoClienteFLista aux;
        if(this.cliente.getCpf().equals(cpf)){
            return this.cliente;
        }else{
            aux = this.proximo;
            consultarLista(aux.cliente.getCpf());
        }
        
        return null;
    }
    
    public void excluirLista(String cpf){
        BancoClienteFLista aux;
        if(this.cliente.equals(consultarLista(cpf))){
            
            
            aux = this.proximo.getLista();
            
        }
        
        
    }
}
