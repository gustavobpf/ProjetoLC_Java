/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto_lc_java.Controle;
import projeto_lc_java.ClassesBasicas.Venda;
//import projeto_lc_java.BD.RepositorioVendaLista;
import projeto_lc_java.BD.RepositorioVendaArray;

/**
 *
 * @author NATI4
 */
public class ControleVenda {
    private RepositorioVendaArray vendas;
     
    //private RepositorioClienteJLista clientes = new RepositorioClienteJLista();
     
    public ControleVenda(RepositorioVendaArray venda){
        this.vendas = venda;
    }
     
    public void cadastrarVenda(Venda venda) throws RepositorioException{
        //REGRA DE NEGOCIO
        vendas.inserirVenda(venda);
    }
     
    public void removerVenda(String nf) throws RepositorioException{
        //REGRA DE NEGOCIO
        vendas.excluirVenda(nf);
    }
     
    public void modificarCliente(String nf,Venda venda) throws RepositorioException{
        //REGRA DE NEGOCIO
        vendas.atualizarVenda(venda.getNf(),venda);
    }
     
    public Venda procurarVenda(String nf){
        //REGRA DE NEGOCIO
        return (Venda) vendas.consultarVenda(nf);
    }
}
