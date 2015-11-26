/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.Controle;
//Interfaces e Classes Básicas

import projeto_lc_java.ClassesBasicas.Compra;
import projeto_lc_java.ClassesBasicas.Produto;
import projeto_lc_java.BD.Interfaces.IRepositorioProduto;
import projeto_lc_java.BD.Interfaces.IRepositorioCompra;

//Exccptions
import projeto_lc_java.Exception.NfJaCadastradaException;
import projeto_lc_java.Exception.NfNaoEncontradaException;

/**
 *
 * @author NATI4
 */
public class ControleCompra {
    private IRepositorioCompra compras;
    private IRepositorioProduto produtos;
     
    public ControleCompra(IRepositorioCompra compras){
        this.compras = compras;
    }

    public ControleCompra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    public void cadastrar(Compra compra) throws NfJaCadastradaException {
        if(compra.getNf() != null || compra.getNf() != "" || 
           compra.getNf() != " "){
            
            
            if(!this.compras.jaExiste(compra.getNf())){
                this.compras.inserir(compra);
            }else{
                throw new NfJaCadastradaException(compra.getNf());
            }
        }
    }
    
    public void remover(String nf) throws NfNaoEncontradaException {
        if(this.compras.jaExiste(nf)){
            this.compras.excluir(nf);
        }else{
            throw new NfNaoEncontradaException(nf);
        }
    }
    
    public void modificar(Compra compra) throws NfNaoEncontradaException {
        if(this.compras.jaExiste(compra.getNf())){
            this.compras.atualizar(compra);
        }else{
            throw new NfNaoEncontradaException(compra.getNf());
        }
    }
    
    public Compra procurar(String nf) throws NfNaoEncontradaException {
        if(this.compras.jaExiste(nf)){
            return this.compras.consultar(nf);
        }else{
            throw new NfNaoEncontradaException(nf);
        }
    }
}
