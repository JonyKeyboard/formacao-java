
public class CalculadorImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel tributo) {
		this.totalImposto += tributo.getValorImposto();
	}
	
	public double getTributo() {
		return totalImposto;
	}
	
	
}
