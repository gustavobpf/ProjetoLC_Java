package silviohgs;
// importacao das classes
import projeto_lc_java.ClassesBasicas.ClienteFisico;
import projeto_lc_java.ClassesBasicas.ClienteJuridico;
import projeto_lc_java.ClassesBasicas.Compra;
import projeto_lc_java.ClassesBasicas.Produto;
import projeto_lc_java.ClassesBasicas.Venda;
import projeto_lc_java.Exception.ClienteJaCadastradoException;
import projeto_lc_java.Exception.ClienteNaoEncontradoException;
import projeto_lc_java.Exception.NfJaCadastradaException;
import projeto_lc_java.Exception.NfNaoEncontradaException;
import projeto_lc_java.Exception.ProdutoJaCadastradoException;
import projeto_lc_java.Exception.ProdutoNaoEncontradoException;
import projeto_lc_java.Fachada.Fachada;

public class Programa {
    
    public static void main(String[] args) throws ClienteNaoEncontradoException, ClienteJaCadastradoException, ProdutoNaoEncontradoException, ProdutoJaCadastradoException, NfNaoEncontradaException, NfJaCadastradaException {
        
        
        //instanciando e inicializando 
        Fachada.getInstance();
        ClienteFisico cli = new ClienteFisico();
        ClienteFisico cli1 = new ClienteFisico();
        ClienteJuridico clij = new ClienteJuridico();
        Produto prod[] = new Produto[10];
                Compra compra = new Compra();
        Venda venda = new Venda();
        
        Produto produto = new Produto();
        Produto produto1 = new Produto();
        
        
        // cliente fisico
        cli.setNome("Silvio");
        cli.setCpf("1234");
        cli.setEndereco("rua abc");
        
               
        
        // cliente juridico
        clij.setNome("programabem");
        clij.setCnpj("12345");
        clij.setEndereco("rua def");
        
        // produto
        produto.setCod("a123");
        produto.setDescricao("arruela");
        produto.setPreco(1.00);
        produto.setQtd(1);
        
        
        prod[0]=produto;
                        
        // compra
        compra.setCliente(clij);
        compra.setData("22/02/2022");
        compra.setNf("1111");
        compra.setProduto(prod);
      
        venda.setCliente(cli);
        venda.setNf("123");
        venda.setData("22/02/2022");
        venda.setProduto(prod);
        
       // cadastrar
        Fachada.getInstance().cadastrarCliente(cli);
        Fachada.getInstance().cadastrarClienteJ(clij);
        Fachada.getInstance().cadastrarProduto(produto);
        Fachada.getInstance().cadastrarCompra(compra);
        Fachada.getInstance().cadastrarVenda(venda);
        
        System.err.println(Fachada.getInstance().consultarCliente(cli.getCpf()).getCpf());
                
        // atualizar
        Fachada.getInstance().atualizarCliente(cli);
        try{
        Fachada.getInstance().atualizarClienteJ(clij);
        }
        catch(ClienteNaoEncontradoException ex){
        Fachada.getInstance().atualizarCompra(compra);
        }
        try{
        Fachada.getInstance().atualizarProduto(produto);
        }catch(ProdutoNaoEncontradoException ex){
            System.err.println("");
        }           
        Fachada.getInstance().atualizarVenda(venda);
        
        //consultar
        Fachada.getInstance().consultarCliente(cli.getCpf());
        try{
        Fachada.getInstance().consultarProduto(produto.getCod());
        }catch(ProdutoNaoEncontradoException ex){
        }
        
        Fachada.getInstance().consultarVenda(venda.getNf());
        try{
        Fachada.getInstance().consultarClienteJ(clij.getCnpj());
        }catch(ClienteNaoEncontradoException ex){
        
        System.err.println("teste");
        }
        Fachada.getInstance().consultarVenda(venda.getNf());
        //remover
        Fachada.getInstance().removerCliente(cli.getCpf());
        Fachada.getInstance().removerClienteJ(clij.getCnpj());
        Fachada.getInstance().removerCompra(compra.getNf());
        try{
        Fachada.getInstance().removerProduto(produto.getCod());
        }catch(ProdutoNaoEncontradoException ex){
        }
        
        Fachada.getInstance().removerVenda(venda.getNf());
        
    }
}
