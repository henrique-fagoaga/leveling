package ex3_6;

public class Animal {
	String nome;
	int qtdPata;
	
	public Animal() {}
	
	public Animal(String nome) {
		this.setNome(nome);
	}
	
	public Animal(String nome, int qtdPata) {
		this(nome);
		this.setQtdPata(qtdPata);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setQtdPata(int qtdPata) {
		this.qtdPata = qtdPata;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getQtdPata() {
		return this.qtdPata;
	}
	
	public void exibirDetalhes() {
		System.out.printf("Nome: %s | Pata(s): %d\n", this.getNome(), this.getQtdPata());
	}
}
