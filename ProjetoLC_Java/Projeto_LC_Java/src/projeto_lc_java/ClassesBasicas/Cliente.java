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
public class Cliente {
//    private String   cod;
    private String   nome;
    private String   ddd;
    private String   fone;
    private String   email;
    private String   endereco;
    private String enderecoa;
    
    //Construtor de Cliente sem parâmetros
    public Cliente(){
    //    this.cod      = "";
        this.nome     = null;
        this.ddd      = null;
        this.fone     = null;
        this.email    = null;
        this.endereco = null;
        this.enderecoa = null;
    }
    //Construtor de Cliente com todos os parâmetros
    public Cliente(String nome, String ddd, String fone, String email, String endereco){
    //    this.cod      = cod;
        this.nome     = nome;
        this.ddd      = ddd;
        this.fone     = fone;
        this.email    = email;
        this.endereco = endereco;
    }
    
    //Métodos Get's and Set's
/*//Cod
    public String getCod(){
        return this.cod;
    }
    public void setCod(String cod){
        this.cod = cod;
    }
*/
//Nome
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
//DDD
    public String getDdd(){
        return this.ddd;
    }
    public void setDdd(String ddd){
        this.ddd = ddd;
    }
    
//Fone
    public String getFone(){
        return this.fone;
    }
    public void setFone(String fone){
        this.fone = fone;
    }
    
//Email    
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

//Endereco    
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
}
