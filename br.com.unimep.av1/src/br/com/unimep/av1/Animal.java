package br.com.unimep.av1;

public class Animal {
	private String nome;
	private String tipoAnimal;
	private String sexo;
	private int quantPatas;
	private int saude;
	
	public Animal(String nome) {
		this.saude = 0;
		this.nome = nome;
	}
	
	public void dormir() {
		System.out.println("Vou dormir agora... zzz");
	}
	
	public void comer() {
		System.out.println("Nham Nham");
		this.saude = 1;
	}
	
	public void acordar() {
		System.out.println("Estou acordando... Acordei!");
	}
	
	public String verificarSaude() {
		if(saude == 1)
			return "Estou bem";
		else
			return "Estou mal preciso COMER algo:\\";
	}
		
	//Getters and Setters para manipulação dos Atributos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoAnimal() {
		return tipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	public int getQuantPatas() {
		return quantPatas;
	}
	public void setQuantPatas(int quantPatas) {
		this.quantPatas = quantPatas;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}


