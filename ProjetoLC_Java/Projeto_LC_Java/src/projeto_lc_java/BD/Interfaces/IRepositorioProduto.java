/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.BD.Interfaces;

import projeto_lc_java.ClassesBasicas.Produto;
import projeto_lc_java.Exception.ProdutoNaoEncontradoException;

/**
 *
 * @author Aluno
 */
public interface IRepositorioProduto {
    public void inserir(Produto produto);
    public void excluir(String cod);
    public Produto consultar(String cod) throws ProdutoNaoEncontradoException;
    public void atualizar(Produto produto);
    
    public boolean jaExiste(String descricao);
}
