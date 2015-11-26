/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.Controle;
import projeto_lc_java.ClassesBasicas.Venda;
import projeto_lc_java.BD.Interfaces.IRepositorioVenda;
import projeto_lc_java.BD.RepositorioProdutoArray;

import projeto_lc_java.Exception.NfJaCadastradaException;
import projeto_lc_java.Exception.NfNaoEncontradaException;

/**
 *
 * @author NATI4
 */
public class ControleVenda {
    private IRepositorioVenda vendas;
    
     
    public ControleVenda(IRepositorioVenda vendas){
        this.vendas = vendas;
    }

    public ControleVenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    public void cadastrar(Venda venda) throws NfJaCadastradaException {
        if(venda.getNf() != null || venda.getNf() != "" || 
           venda.getNf() != " "){
            
            
            if(!this.vendas.jaExiste(venda.getNf())){
                this.vendas.inserir(venda);
            }else{
                throw new NfJaCadastradaException(venda.getNf());
            }
        }
    }
    
    public void remover(String nf) throws NfNaoEncontradaException {
        if(this.vendas.jaExiste(nf)){
            this.vendas.excluir(nf);
        }else{
            throw new NfNaoEncontradaException(nf);
        }
    }
    
    public void modificar(Venda venda) throws NfNaoEncontradaException {
        if(this.vendas.jaExiste(venda.getNf())){
            this.vendas.atualizar(venda);
        }else{
            throw new NfNaoEncontradaException(venda.getNf());
        }
    }
    
    public Venda procurar(String nf) throws NfNaoEncontradaException {
        if(this.vendas.jaExiste(nf)){
            return this.vendas.consultar(nf);
        }else{
            throw new NfNaoEncontradaException(nf);
        }
    }
}
