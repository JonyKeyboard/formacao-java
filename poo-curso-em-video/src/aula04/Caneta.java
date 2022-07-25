package aula04;

public class Caneta {
	
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public Caneta(String modelo, float ponta, String cor) {
		this.tampar();
		this.tampada = false;
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
	}

	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar( ) {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("INFO CANETA");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: " + this.cor);
		System.out.println("Status: " + this.tampada);
	}
	
}
