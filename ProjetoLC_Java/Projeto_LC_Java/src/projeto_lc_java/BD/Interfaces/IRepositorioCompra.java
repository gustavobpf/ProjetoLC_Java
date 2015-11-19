/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.BD.Interfaces;

import projeto_lc_java.ClassesBasicas.Compra;

/**
 *
 * @author Aluno
 */
public interface IRepositorioCompra {
    public void inserir(Compra compra);
    public void excluir(String nf);
    public Compra consultar(String nf);
    public void atualizar(Compra compra);
    
}
