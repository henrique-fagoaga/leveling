package ex3_6;

public class Oviparo extends Animal {
	int qtdOvo;
	String tamanhoOvo;
	
	public Oviparo() {}
	
	public Oviparo(String nome, int qtdPata) {
		super(nome, qtdPata);
	}

	public Oviparo(String nome, int qtdPata, int qtdOvo, String tamanhoOvo) {
		this(nome, qtdPata);
		this.setQtdOvo(qtdOvo);
		this.setTamanhoOvo(tamanhoOvo);
	}
	
	public void setQtdOvo(int qtdOvo) {
		this.qtdOvo = qtdOvo;
	}
	
	public void setTamanhoOvo(String tamanhoOvo) {
		this.tamanhoOvo = tamanhoOvo;
	}
	
}
