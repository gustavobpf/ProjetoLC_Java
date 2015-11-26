/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_lc_java;
import GUI.TelaCliente;
import java.io.File;  
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import projeto_lc_java.ClassesBasicas.ClienteFisico;
import projeto_lc_java.ClassesBasicas.ClienteJuridico;
import projeto_lc_java.ClassesBasicas.Compra;
import projeto_lc_java.ClassesBasicas.Produto;
import projeto_lc_java.ClassesBasicas.Venda;
import projeto_lc_java.Exception.ClienteJaCadastradoException;
import projeto_lc_java.Exception.ClienteNaoEncontradoException;
import projeto_lc_java.Exception.ProdutoJaCadastradoException;
import projeto_lc_java.Fachada.Fachada;
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
       Produto produto[], produto00, produto01, produto02, produto03;
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
       
       produto   = new Produto[100];
       produto00 = new Produto();
       produto01 = new Produto();
       produto02 = new Produto();
       produto03 = new Produto();
       
       produto00.setCod("00");
       produto00.setDescricao("Produto 00");
       produto00.setPreco(15);
       produto00.setQtd(30);
       
       produto01.setCod("01");
       produto01.setDescricao("Produto 01");
       produto01.setPreco(20);
       produto01.setQtd(45);
       
       produto02.setCod("02");
       produto02.setDescricao("Produto 02");
       produto02.setPreco(45);
       produto02.setQtd(22);
       
       produto03.setCod("03");
       produto03.setDescricao("Produto 03");
       produto03.setPreco(12);
       produto03.setQtd(88);
       
       produto03.setCod("04");
       produto03.setDescricao("Produto 04");
       produto03.setPreco(28.80);
       produto03.setQtd(31);
       
             
       produto[0] = produto00;
       produto[1] = produto01;
       produto[2] = produto02;
       produto[3] = produto03;
       
       compra.setCliente(clientef);
       compra.setData("2015/11/25");
       compra.setNf("000");
       compra.setProduto(produto);
       
       venda.setCliente(clientej);
       venda.setData("2015/11/26");
       venda.setNf("000");
       venda.setProduto(produto);
      
       try{
            fachada.cadastrarCliente(clientef);
       }catch (ClienteJaCadastradoException ex){
           ex.getMessage();
       }
       
       try{
           fachada.cadastrarClienteJ(clientej);
       }catch (ClienteJaCadastradoException ex){
           ex.getMessage();
       }
       
       try{
           fachada.cadastrarProduto(produto00);
           fachada.cadastrarProduto(produto01);
           fachada.cadastrarProduto(produto02);
           fachada.cadastrarProduto(produto03);
       }catch (ProdutoJaCadastradoException ex){
           ex.getMessage();
       }
/*
       try{
           fachada.cadastrarCompra(compra);
       }
  */     
       
    }
    
}
