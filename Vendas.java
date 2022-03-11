import java.util.ArrayList;
public class Vendas{
  private double vendas;
	  private ArrayList<Produto> estoque;
	  Vendas(){
	    estoque = new ArrayList<>();
	  }
	  void getEstoque() {
		double valorTotal=0;
	  int produtos=0;
	    for(Produto produto:estoque){
	      valorTotal = valorTotal + produto.getPreco();
	      produtos++;
	    }
	  System.out.println("valor total = " + valorTotal);
	  System.out.println("quantidade de produtos = " + produtos);
	  }
	  
	  void adicionarProduto(Produto produto){
	    estoque.add(produto);
	    System.out.println("produto = "+ estoque.indexOf(produto));
	  }
	  void removerProduto(int produto){
	    estoque.remove(produto);
	  }
	  Produto getProduto(int produto){
		  return estoque.get(produto);
      }
}