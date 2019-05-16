package br.com.unimep.av1;

public class Gato extends Animal implements Felino {
	private String corPelo;
	private String corDosOlhos;
	private String raca;
	
	public Gato(String nome) {
		super(nome);
	}

	public void andar(){
		System.out.println("Vou Andar agora...");
	}
	
	//Métodos da Interface Felino	
	
	@Override
	public void miar() {
		System.out.println("Miauu!");
		
	}

	@Override
	public void ativarGarras() {
		System.out.println("Rrrrrrr");
		
	}
	
	public String getCorPelo() {
		return corPelo;
	}

	//Getters and Setters para manipulação dos Atributos

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}


	public String getCorDosOlhos() {
		return corDosOlhos;
	}


	public void setCorDosOlhos(String corDosOlhos) {
		this.corDosOlhos = corDosOlhos;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}

}
