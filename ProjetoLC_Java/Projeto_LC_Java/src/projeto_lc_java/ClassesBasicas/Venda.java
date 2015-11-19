/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_lc_java.ClassesBasicas;

/**
 *
 * @author Aluno
 */
public class Venda {
    private String nf;
    private String data;
    private Produto produto;
    private Cliente cliente;
    
    
    //Construtor de Venda sem parâmetros
    public Venda(){
        this.cliente = null;
    }
    //Construtor de Venda com todos os parâmetros
    public Venda(String nf, String data, Produto produto, Cliente cliente){
        this.nf      = nf;
        this.data    = data;
        this.produto = produto;
        this.cliente = cliente;
    }
    
        //Métodos Get's and Set's
    
//NotaFiscal
    public String getNf(){
        return this.nf;
    }
    public void setNf(String nf){
        this.nf = nf;
    }
    
//Data da Venda (Venda)
    public String getData(){
        return this.data;
    }
    public void setData(String data){
        this.data = data;
    }
    
//Produto da Venda (Venda)
    public Produto getProduto(){
        return this.produto;
    }
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    
//Cliente
    public Cliente getCliente(){
        return this.cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    

}
