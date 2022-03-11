public class Produto{
  private String nome;
  private String descricao;
  private double preco;
  Produto(String nome, double preco, String descricao){
    this.nome = nome;
    this.preco = preco;
    this.descricao = descricao;
  }
  void setPreco(double preco){
     this.preco = preco;
  }
  double getPreco(){
    return preco;
  }
  String getDescricao() {
	return descricao;
} 
  String getNome(){
    return nome;
} 
}