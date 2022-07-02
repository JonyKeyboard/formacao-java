
public class SeguroDeVida implements Tributavel {
	
	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValorSeguro(double valor) {
		this.valor = valor;
	}

	@Override
	public double getValorImposto() {
		return this.valor*0.1;
	}
	
}
