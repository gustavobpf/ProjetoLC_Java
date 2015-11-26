/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_lc_java;
import java.io.FileWriter;  
import java.io.File;  
import java.io.IOException;

import projeto_lc_java.Fachada.Fachada;
import projeto_lc_java.ClassesBasicas.ClienteFisico;
import projeto_lc_java.ClassesBasicas.ClienteJuridico;
import projeto_lc_java.ClassesBasicas.Produto;
import projeto_lc_java.ClassesBasicas.Venda;
import projeto_lc_java.ClassesBasicas.Compra;
/**
 *
 * @author Marlene
 */
public class Projeto_LC_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       Fachada fachada = new Fachada();
       
       ClienteFisico clientef = new ClienteFisico();
       ClienteJuridico clientej = new ClienteJuridico();
       Produto produto = new Produto();
       Compra compra = new Compra();
       Venda venda = new Venda();
       
       clientef.setCpf("00000000000");
       clientef.setNome("Gustavo Freitas");
       clientef.setEndereco("Rua da Capitao da Silva");
       clientef.setDdd("81");
       clientef.setFone("11111111");
       clientef.setCelular("99999999");
       clientef.setEmail("gustavo@lc.com.br");
       
       clientej.setCnpj("0000000000000");
       clientej.setNomeFantasia("Empresa X");
       clientej.setEndereco("Rua Souza e Silva");
       clientej.setDdd("81");
       clientej.setFone("22222222");
       clientej.setFax("33333333");
       clientej.setEmail("empresax@lc.com.br");
       
       produto.setCod("00");
       produto.setDescricao("Produto 00");
       produto.setPreco(15);
       produto.setQtd(30);
       
       compra.setCliente(clientef);
       compra.setData("2015/11/25");
       compra.setNf("000");
       compra.setProduto(produto);
       
       
       
       
    }
    
}
