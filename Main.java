import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	    int op, codigo;
	    double preco;
	    String endereco, cidade, telefone, email, nome, cpf, cargo,descricao;
	    boolean matriz;
	    Funcionario funcionario1, funcionario2;
	    Produto produto1, produto2;
	    Vendas vendas = new Vendas();
	    Cliente cliente;
	    System.out.println("Digite o endereço da sua loja: ");
	    endereco = sc.nextLine();
	    System.out.println("Digite a cidade da sua loja: ");
	    cidade = sc.nextLine();
	    System.out.println("Digite o telefone da sua loja: ");
	    telefone = sc.nextLine();
	    System.out.println("Digite a cidade da sua loja: ");
	    email = sc.nextLine();
	    System.out.println("Digite se a loja é a matriz sua empresa: ");
	    matriz = sc.nextBoolean();sc.nextLine();
	    Empresa loremIpsum = new Empresa(endereco,cidade,telefone,email,matriz);
	    System.out.println("Digite o nome do funcionário: ");
	    nome = sc.nextLine();
	    System.out.println("Digite o cpf do funcionário: ");
	    cpf = sc.nextLine();
	    System.out.println("Digite o cargo do funcionário: ");
	    cargo = sc.nextLine();
	    funcionario1 = new Funcionario(nome, cpf,cargo);
	    if(cargo == "gerente"){
	      loremIpsum.setGerente(funcionario1);
	    }
	    System.out.println("Digite o nome do funcionário: ");
	    nome = sc.nextLine();
	    System.out.println("Digite o cpf do funcionário: ");
	    cpf = sc.nextLine();
	    System.out.println("Digite o cargo do funcionário: ");
	    cargo = sc.nextLine();
	    funcionario2 = new Funcionario(nome, cpf,cargo);
	    if(cargo == "gerente"){
	      loremIpsum.setGerente(funcionario2);
	    }
	    System.out.println("Digite o nome do produto: ");
	    nome = sc.nextLine();
	    System.out.println("Digite o preço do produto: ");
	    preco =sc.nextDouble(); sc.nextLine();
	    System.out.println("Digite o descrição do produto: ");
	    descricao = sc.nextLine();
	    produto1 = new Produto(nome,preco,descricao);
	    vendas.adicionarProduto(produto1);
	    System.out.println("Digite o nome do produto: ");
	    nome = sc.nextLine();
	    System.out.println("Digite o preço do produto: ");
	    preco = sc.nextDouble();sc.nextLine();
	    System.out.println("Digite o descrição do produto: ");
	    descricao = sc.nextLine();
	    produto2 = new Produto(nome,preco,descricao);
	    vendas.adicionarProduto(produto2);
	    vendas.getEstoque();
	    System.out.println("Digite o nome do cliente: ");
	    nome = sc.nextLine();
	    System.out.println("Digite o cpf do cliente ");
	    cpf = sc.nextLine();
	    cliente = new Cliente(nome, cpf);
	    System.out.println("Digite o código do produto do cliente ");
	    codigo = sc.nextInt();sc.nextLine();
	    cliente.adicionarProduto(vendas.getProduto(codigo));
	    vendas.removerProduto(codigo);
	    System.out.println("valor a ser pago: "+cliente.valorTotal());
	    System.out.println("Digite o código do produto pago pelo cliente ");
	    codigo = sc.nextInt();sc.nextLine();
	    cliente.removerProduto(codigo);
    }
}