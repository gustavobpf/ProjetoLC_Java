/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_lc_java;

/**
 *
 * @author Aluno
 */
public class Produto {
    private int             cod;
    private String          descricao;
    private int             qtd;
    private double          preco;
    
    //Construtor de Produto sem parâmetros
    public Produto(){
        this.cod        = 0;
        this.descricao  = null;
        this.qtd        = 0;
        this.preco      = 0;
    }
    
//Construtor de Produto com todos os parâmetros
    public Produto(int cod, String descricao, int qtd, double preco,
            double desconto){
        this.cod        = cod;
        this.descricao  = descricao;
        this.qtd        = qtd;
        this.preco      = preco;
    }

    //Métodos Get's and Set's
    
//Cod
    public int getCod(){
        return this.cod;
    }
    public void setCod(int cod){
        this.cod = cod;
    }
    
//Descricao
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao.toUpperCase();
    }
    
//Quantidade
    public int getQtd(){
        return this.qtd;
    }
    public void setQtd(int qtd){
        this.qtd = qtd;
    }
    
//Preco
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
}