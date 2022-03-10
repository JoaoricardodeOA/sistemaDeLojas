public class Cliente{
  private String nome;
  private String cpf;
  private Produto produto;
  Cliente(String nome, String cpf){
  this.nome = nome;
  this.cpf = cpf;
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
  
}