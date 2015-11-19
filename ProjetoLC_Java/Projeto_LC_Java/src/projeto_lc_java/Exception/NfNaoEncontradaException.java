/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.Exception;

/**
 *
 * @author NATI4
 */
public class NfNaoEncontradaException extends Exception{
    private String nf;
    
    public NfNaoEncontradaException(String nf){
        super("Nota fiscal não encontrado!");
        this.nf = nf;
    }
    
    public String getNf(){
        return this.nf;
    }
    public void setNf(String nf){
        this.nf = nf;
    }
}
