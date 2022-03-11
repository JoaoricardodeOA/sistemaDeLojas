import java.util.ArrayList;

public class Cliente{
  private String nome;
	  private String cpf;
	  private ArrayList<Produto> escolhidos;
	  Cliente(String nome, String cpf){
	    this.nome = nome;
	    this.cpf = cpf;
	    escolhidos = new ArrayList<>();
	  }
	  public void setNome(String nome) {
		this.nome = nome;
	  }
	  public String getCpf() {
		  return cpf;
	  }
	  public String getNome() {
		  return nome;
	  }
	  void adicionarProduto(Produto produto){
	    escolhidos.add(produto);
	    System.out.println("produto = "+ escolhidos.indexOf(produto));
	  }
	  void removerProduto(int produto){
	    escolhidos.remove(produto);
	  }
	  double valorTotal(){
	    double valorTotal=0;
	    for(Produto produto:escolhidos){
	      valorTotal = valorTotal + produto.getPreco();
	    }
	  return valorTotal;
	  }
}