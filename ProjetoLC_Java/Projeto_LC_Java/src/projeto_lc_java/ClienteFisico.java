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
public class ClienteFisico extends Cliente{
    private String cpf;
    private String rg;
    private String celular;
    
    //Construtor de ClienteFisico sem parâmetros
    public ClienteFisico(){
        this.cpf     = null;
        this.rg      = null;
        this.celular = null;
    }
    //Construtor de ClienteFisico com todos parâmetros
    public ClienteFisico(String nome, String ddd, String fone, String email,
            String endereco, String cpf, String rg, String celular){
            super(nome,ddd,fone,email,endereco);
        
        this.cpf     = cpf;
        this.rg      = rg;
        this.celular = celular;
    }
    
    //Métodos Get's and Set's
    
//CPF
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
//RG
    public String getRg(){
        return this.rg;
    }
    public void setRg(String rg){
        this.rg = rg;
    }
    
//Celular
    public String getCelular(){
        return this.celular;
    }
    public void setCelular(String celular){
        this.celular = celular;
    }
    
    
}
