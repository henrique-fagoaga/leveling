package ex3_6;

//Dado que ornitorrincos s�o animais da ordem monotremata da classe de mam�feros,
//conceitualmente faz sentido ele herdar da classe Mam�fero e implementar atributos
//espec�ficos que o caracterizam como um "mam�fero que bota ovo".

public class Ornitorrinco extends Mamifero {
	int qtdOvo;
	String tamanhoOvo;
	
	public Ornitorrinco(String nome, int qtdPata) {
		super(nome, qtdPata);
	}

	public Ornitorrinco(String nome, int qtdPata, int qtdOvo, String tamanhoOvo) {
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
