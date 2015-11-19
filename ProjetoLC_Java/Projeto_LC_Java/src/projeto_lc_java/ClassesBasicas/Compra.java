/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_lc_java.ClassesBasicas;

import java.util.Date;

/**
 *
 * @author Marlene
 */
public class Compra {
    private String nf;
    private String data;
    private Produto produto;
    private Cliente cliente;

    //Construtor de Transacao sem os parâmetros
    public Compra(){
        this.nf      = null;
        this.data    = null;
        this.produto = null;
        this.cliente = null;
    }
    //Construtor de Compra com todos os parâmetros
    public Compra(String nf, String data, Produto produto, Cliente cliente){
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
    
//Data da Compra (Compra)
    public String getData(){
        return this.data;
    }
    public void setData(String data){
        this.data = data;
    }
    
//Produto da Compra (Compra)
    public Produto getProduto(){
        return this.produto;
    }
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    
//Cliente da Compra (Compra)    
    public Cliente getCliente(){
        return this.cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
}
