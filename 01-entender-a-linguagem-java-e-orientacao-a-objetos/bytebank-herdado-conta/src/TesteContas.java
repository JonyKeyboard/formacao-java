
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(1000.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		SeguroDeVida sv = new SeguroDeVida();
		sv.setValorSeguro(1000);
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc);
		calc.registra(sv);
		
		System.out.println(calc.getTributo());
		
		
	}

}
