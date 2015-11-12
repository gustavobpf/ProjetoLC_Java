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
public class ClienteJuridico extends Cliente {
    private String cnpj;
    private String ie;
    private String fax;
    private String nomeFantasia;
    
    //Construtor de ClienteJuridico sem parâmetros
    public ClienteJuridico(){
        this.cnpj         = null;
        this.ie           = null;
        this.fax          = null;
        this.nomeFantasia = null;
    }
     //Construtor de ClienteJuridico com todos os parâmetros
    public ClienteJuridico(String nome, String ddd, String fone,
           String endereco, String email, String cnpj, String ie, String fax,
           String nomeFantasia){
        
        super(nome,ddd,fone,endereco,email);
        this.cnpj         = cnpj;
        this.ie           = ie;
        this.fax          = fax;
        this.nomeFantasia = nomeFantasia;
    }
    
    //Métodos Get's and Set's
    
//CNPJ
    public String getCnpj(){
        return this.cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
//IE
    public String getIe(){
        return this.ie;
    }
    public void setIe(String ie){
        this.ie = ie;
    }
    
//FAX
    public String getFax(){
        return this.fax;
    }
    public void setFax(String fax){
        this.fax = fax;
    }
    
//NomeFantasia
    public String getNomeFantasia(){
        return this.nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }
}
