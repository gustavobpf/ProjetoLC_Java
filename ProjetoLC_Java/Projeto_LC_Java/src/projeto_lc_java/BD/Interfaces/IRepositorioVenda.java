/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.BD.Interfaces;

import projeto_lc_java.ClassesBasicas.Venda;
import projeto_lc_java.Exception.NfNaoEncontradaException;
/**
 *
 * @author NATI4
 */
public interface IRepositorioVenda {
    public void inserir(Venda venda);
    public void excluir(String nf);
    public Venda consultar(String nf) throws NfNaoEncontradaException;
    public void atualizar(Venda venda);
    
    public boolean jaExiste(String descricao);
}
