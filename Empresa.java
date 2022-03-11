
public class Empresa{
  private String endereco;
  private String cidade;
  private String telefone;
  private String email;
  private boolean matriz;
  private Funcionario gerente;
  Empresa(String endereco, String cidade, String telefone, String email, boolean matriz){
    this.endereco = endereco;
    this.cidade = cidade;
    this.telefone = telefone; 
    this.email = email;
    this.matriz = matriz;
  }
  void setEndereco(String endereco){
    this.endereco = endereco;
  }
  String getEndereco(){
    return endereco;
  }
  void setMatriz(boolean matriz){
    this.matriz = matriz;
  }
  boolean isMatriz(){
    return matriz;
  }
  Funcionario getGerente(){
    return gerente;
  }
  void setGerente(Funcionario gerente){
    this.gerente = gerente;
  }

  
}