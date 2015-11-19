/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.BD.Interfaces;

import projeto_lc_java.ClassesBasicas.ClienteJuridico;
import projeto_lc_java.Exception.ClienteNaoEncontradoException;

/**
 *
 * @author Aluno
 */
public interface IRepositorioClienteJ {
    public void inserir(ClienteJuridico cliente);
    public void excluir(String cnpj);
    public ClienteJuridico consultar(String cnpj) throws ClienteNaoEncontradoException;
    public void atualizar(ClienteJuridico cliente);
    
    public boolean jaExiste(String cnpj);
}
