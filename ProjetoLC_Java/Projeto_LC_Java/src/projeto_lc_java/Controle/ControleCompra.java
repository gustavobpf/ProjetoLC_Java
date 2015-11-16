/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.Controle;
import projeto_lc_java.Compra;
//import projeto_lc_java.BD.RepositorioCompraLista;
import projeto_lc_java.BD.RepositorioCompraArray;

/**
 *
 * @author NATI4
 */
public class ControleCompra {
    private RepositorioCompraArray compras;
     
    //private RepositorioClienteJLista clientes = new RepositorioClienteJLista();
     
    public ControleCompra(RepositorioCompraArray compra){
        this.compras = compra;
    }
     
    public void cadastrarCompra(Compra compra) throws RepositorioException{
        //REGRA DE NEGOCIO
        compras.inserirCompra(compra);
    }
     
    public void removerCompra(String nf) throws RepositorioException{
        //REGRA DE NEGOCIO
        compras.excluirCompra(nf);
    }
     
    public void modificarCompra(String nf,Compra compra) throws RepositorioException{
        //REGRA DE NEGOCIO
        compras.atualizarCompra(compra.getNf(),compra);
    }
     
    public Compra procurarCompra(String nf){
        //REGRA DE NEGOCIO
        return (Compra) compras.consultarCompra(nf);
    }
}
