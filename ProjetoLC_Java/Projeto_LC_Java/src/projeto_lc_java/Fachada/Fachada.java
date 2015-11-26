/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.Fachada;

//Interfaces
import projeto_lc_java.BD.Interfaces.IRepositorioClienteF;
import projeto_lc_java.BD.Interfaces.IRepositorioClienteJ;
import projeto_lc_java.BD.Interfaces.IRepositorioProduto;
import projeto_lc_java.BD.Interfaces.IRepositorioCompra;
import projeto_lc_java.BD.Interfaces.IRepositorioVenda;

//Repositorios
import projeto_lc_java.BD.RepositorioClienteFisicoArray;
import projeto_lc_java.BD.RepositorioClienteJuridicoArray;
import projeto_lc_java.BD.RepositorioProdutoArray;
import projeto_lc_java.BD.RepositorioCompraArray;
import projeto_lc_java.BD.RepositorioVendaArray;

//Classes Básicas
import projeto_lc_java.ClassesBasicas.ClienteFisico;
import projeto_lc_java.ClassesBasicas.ClienteJuridico;
import projeto_lc_java.ClassesBasicas.Produto;
import projeto_lc_java.ClassesBasicas.Compra;
import projeto_lc_java.ClassesBasicas.Venda;

//Controles
import projeto_lc_java.Controle.ControleClienteFisico;
import projeto_lc_java.Controle.ControleClienteJuridico;
import projeto_lc_java.Controle.ControleProduto;
import projeto_lc_java.Controle.ControleCompra;
import projeto_lc_java.Controle.ControleVenda;

//Exceções
import projeto_lc_java.Exception.ClienteJaCadastradoException;
import projeto_lc_java.Exception.ClienteNaoEncontradoException;
import projeto_lc_java.Exception.ProdutoJaCadastradoException;
import projeto_lc_java.Exception.ProdutoNaoEncontradoException;
import projeto_lc_java.Exception.NfJaCadastradaException;
import projeto_lc_java.Exception.NfNaoEncontradaException;


/**
 *
 * @author Aluno
 */
public class Fachada {
     private ControleClienteFisico clientes;
     private ControleClienteJuridico clientesj;
     private ControleProduto produtos;
     private ControleCompra compras;
     private ControleVenda vendas;
     private static Fachada instance;
     
     public Fachada(){
        IRepositorioClienteF repositorioClientesF = new RepositorioClienteFisicoArray();
        clientes = new ControleClienteFisico(repositorioClientesF);
        
        IRepositorioClienteJ repositorioClientesJ = new RepositorioClienteJuridicoArray();
        clientesj = new ControleClienteJuridico(repositorioClientesJ);
        
        IRepositorioProduto repositorioProdutos = new RepositorioProdutoArray();
        produtos = new ControleProduto(repositorioProdutos);
        
        IRepositorioCompra repositorioCompras = new RepositorioCompraArray();
        compras = new ControleCompra(repositorioCompras);
        
        IRepositorioVenda repositorioVendas = new RepositorioVendaArray();
        vendas = new ControleVenda(repositorioVendas);
     }
     
     
     
     public static Fachada getInstance()  {
        if (Fachada.instance == null) {
            Fachada.instance = new Fachada();
        }
        return Fachada.instance;
     }  
    
     //Cliente Fisico
     public void cadastrarCliente(ClienteFisico cliente) throws ClienteJaCadastradoException{
        this.clientes.cadastrar(cliente);
     }
     
     public void removerCliente(String cpf) throws ClienteNaoEncontradoException{
        this.clientes.remover(cpf);
     }
     
     public void atualizarCliente(ClienteFisico cliente) throws ClienteNaoEncontradoException{
        this.clientes.modificar(cliente);
     }
     
     public ClienteFisico consultarCliente(String cpf) throws ClienteNaoEncontradoException{
        return this.clientes.procurar(cpf);
     }
   
    
    //Cliente Juridico
     public void cadastrarClienteJ(ClienteJuridico cliente) throws ClienteJaCadastradoException{
        this.clientesj.cadastrar(cliente);
     }
     
     public void removerClienteJ(String cpf) throws ClienteNaoEncontradoException{
        this.clientesj.remover(cpf);
     }
     
     public void atualizarClienteJ(ClienteJuridico cliente) throws ClienteNaoEncontradoException{
        this.clientesj.modificar(cliente);
     }
     
     public ClienteJuridico consultarClienteJ(String cpf) throws ClienteNaoEncontradoException{
        return this.clientesj.procurar(cpf);
     }
     
     //Produtos
     public void cadastrarProduto(Produto produto) throws ProdutoJaCadastradoException{
        this.produtos.cadastrar(produto);
     }
     
     public void removerProduto(String cod) throws ProdutoNaoEncontradoException{
        this.produtos.remover(cod);
     }
     
     public void atualizarProduto(Produto produto) throws ProdutoNaoEncontradoException{
        this.produtos.modificar(produto);
     }
     
     public Produto consultarProduto(String cod) throws ProdutoNaoEncontradoException{
        return this.produtos.procurar(cod);
     }
     
     //Compras
     public void cadastrarCompra(Compra compra) throws NfJaCadastradaException{
        this.compras.cadastrar(compra);
     }
     
     public void removerCompra(String nf) throws NfNaoEncontradaException{
        this.compras.remover(nf);
     }
     
     public void atualizarCompra(Compra compra) throws NfNaoEncontradaException{
        this.compras.modificar(compra);
     }
     
     public Compra consultarCompra(String nf) throws NfNaoEncontradaException{
        return this.compras.procurar(nf);
     }
     
     //Vendas
     public void cadastrarVenda(Venda venda) throws NfJaCadastradaException{
        
        this.vendas.cadastrar(venda);
     }
     
     public void removerVenda(String nf) throws NfNaoEncontradaException{
        this.vendas.remover(nf);
     }
     
     public void atualizarVenda(Venda venda) throws NfNaoEncontradaException{
        this.vendas.modificar(venda);
     }
     
     public Venda consultarVenda(String nf) throws NfNaoEncontradaException{
       return this.vendas.procurar(nf);
     }
}
