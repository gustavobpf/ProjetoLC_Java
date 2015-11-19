/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.Controle;
import projeto_lc_java.ClassesBasicas.Produto;
import projeto_lc_java.BD.Interfaces.IRepositorioProduto;


//Exccptions
import projeto_lc_java.Exception.ProdutoJaCadastradoException;
import projeto_lc_java.Exception.ProdutoNaoEncontradoException;



/**
 *
 * @author NATI4
 */
public class ControleProduto {
    private IRepositorioProduto produtos;
     
    public ControleProduto(IRepositorioProduto produtos){
        this.produtos = produtos;
    }

    public ControleProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    public void cadastrar(Produto produto) throws ProdutoJaCadastradoException {
        if(produto.getCod() != null || produto.getCod() != "" || 
           produto.getCod() != " "){
             if(!this.produtos.jaExiste(produto.getCod())){
                this.produtos.inserir(produto);
            }else{
                throw new ProdutoJaCadastradoException(produto.getCod());
            }
        }
    }
    
    public void remover(String cod) throws ProdutoNaoEncontradoException {
        if(this.produtos.jaExiste(cod)){
            this.produtos.excluir(cod);
        }else{
            throw new ProdutoNaoEncontradoException(cod);
        }
    }
    
    public void modificar(Produto produto) throws ProdutoNaoEncontradoException {
        if(this.produtos.jaExiste(produto.getCod())){
            this.produtos.atualizar(produto);
        }else{
            throw new ProdutoNaoEncontradoException(produto.getCod());
        }
    }
    
    public Produto procurar(String cod) throws ProdutoNaoEncontradoException {
        if(this.produtos.jaExiste(cod)){
            return this.produtos.consultar(cod);
        }else{
            throw new ProdutoNaoEncontradoException(cod);
        }
    }
}
