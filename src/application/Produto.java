package application;

public class Produto {
	
	private String nome;
	private Double preco;
	private int quantidade;
	private double total;
	
	public Produto() {
	}

	public Produto(String nome, Double preco, int quantidade, Double total) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.total = total;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "Produto info : "+getNome()+", "+getPreco()+", "+getQuantidade()+", "+getTotal();
	}
	

}
