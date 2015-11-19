/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.Fachada;

import projeto_lc_java.BD.Interfaces.IRepositorioClienteF;
import projeto_lc_java.BD.RepositorioClienteFisicoArray;

import projeto_lc_java.ClassesBasicas.ClienteFisico;
import projeto_lc_java.Controle.ControleClienteFisico;
import projeto_lc_java.Exception.ClienteJaCadastradoException;


/**
 *
 * @author Aluno
 */
public class Fachada {
     private ControleClienteFisico clientes;
     private static Fachada instance;
     
     public Fachada(){
        IRepositorioClienteF repositorioClientes = new RepositorioClienteFisicoArray();
        clientes = new ControleClienteFisico(repositorioClientes);
     }
     
     public static Fachada getInstance()  {
        if (Fachada.instance == null) {
            Fachada.instance = new Fachada();
        }
        return Fachada.instance;
     }  
    
     
     public void cadastrarCliente(ClienteFisico cliente) throws ClienteJaCadastradoException{
         this.clientes.cadastrar(cliente);
     }
     
     public void removerCliente(String cpf){
         this.clientes.remover(cpf);
     }
   
    
}
