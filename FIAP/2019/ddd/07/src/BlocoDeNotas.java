
public class BlocoDeNotas {
	private String conteudo;

	public BlocoDeNotas() {
		conteudo = "";
	}
	
	public BlocoDeNotas(String conteudo) {
		this.conteudo = conteudo;
	}

	public void inserir(String texto) {
		conteudo = conteudo.concat(texto);
	}

	public void exibir() {
		System.out.println(conteudo);
	}

	public void apagarTudo() {
		conteudo = "";
	}

	public void localizarSubstituir(char existente, char novo) {
		conteudo = conteudo.replace(existente, novo);
	}
	
	public void localizarSubstituir(String existente, String novo) {
		conteudo = conteudo.replace(existente, novo);
	}
	
	public int tamanho() {
		return this.conteudo.length();
	}
	
	public boolean possui(String pesquisa) {
		return this.conteudo.contains(pesquisa);
	}
	
	public String alterarCase(String opcao) {
		switch(opcao) {
		case "maiusculas":
			return this.conteudo.toUpperCase();
		case "minusculas":
			return this.conteudo.toLowerCase();
		default:
			return this.conteudo;
		} 
	}
}