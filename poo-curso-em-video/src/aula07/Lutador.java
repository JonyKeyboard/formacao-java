package aula07;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private Double altura;
	private Double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	

	public Lutador(String nome, String nacionalidade, int idade, Double altura, Double peso, int vitorias, int derrotas, int empates) {
		
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = "Inválido";
		} else if(this.peso < 70.3) {
			this.categoria = "Leve";
		} else if(this.peso < 83.9) {
			this.categoria = "Médio";
		} else if(this.peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
		
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public void apresentar() {
		System.out.println("-------------------------------");
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Nacionalidade: " + this.getNacionalidade());
		System.out.println("Idade: " + this.getIdade() + " - Altura: " + this.getAltura());
		System.out.println("Peso: " + this.getPeso());
		System.out.println("Vitórias: " + this.getVitorias());
		System.out.println("Derrotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());
	}
	
	public void status() {
		System.out.println(this.getNome() + " peso " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias());
		System.out.println("Perdeu " + this.getDerrotas());
		System.out.println("Empatou " + this.getEmpates());
	}
	
	public void ganharLuta() {
		this.setVitorias(getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(getEmpates() + 1);
	}
	
}