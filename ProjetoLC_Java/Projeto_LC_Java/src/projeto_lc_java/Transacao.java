/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_lc_java;

import java.util.Date;

/**
 *
 * @author Marlene
 */
public class Transacao {
    private String nf;
    private String data;
    private Produto produto;

    //Construtor de Transacao sem os parâmetros
    public Transacao(){
        this.nf      = null;
        this.data    = null;
        this.produto = null;
    }
    //Construtor de Transacao com todos os parâmetros
    public Transacao(String nf, String data, Produto produto){
        this.nf      = nf;
        this.data    = data;
        this.produto = produto;
    }
    
    //Métodos Get's and Set's
    
//NotaFiscal
    public String getNf(){
        return this.nf;
    }
    public void setNf(String nf){
        this.nf = nf;
    }
    
//Data da Transacao (Compra ou Venda)
    public String getData(){
        return this.data;
    }
    public void setData(String data){
        this.data = data;
    }
    
//Produto da transacao (Compra ou Venda)
    public Produto getProduto(){
        return this.produto;
    }
    public void setProduto(Produto produto){
        this.produto = produto;
    }
}
