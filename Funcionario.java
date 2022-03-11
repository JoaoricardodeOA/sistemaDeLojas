public class Funcionario{
  private String nome; 
  private String cpf;
  private String cargo;
  Funcionario(String nome, String cpf, String cargo){
    this.nome = nome;
    this.cpf = cpf;
    this.cargo = cargo;
  }
  String getNome(){
    return this.nome;
  }
  void setNome(String nome){
    this.nome = nome;
  }
  String getCpf(){
    return this.cpf;
  }
  String getCargo(){
    return this.cargo;
  }
  void setCargo(String cargo){
    this.cargo = cargo;
  }
}