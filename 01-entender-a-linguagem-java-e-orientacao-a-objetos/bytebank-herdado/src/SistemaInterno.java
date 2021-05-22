
public class SistemaInterno {

	private int senha = 3333;
	
	public void autentica(Autenticavel a) {
	
		boolean autenticou = a.autentica(this.senha);
		
		if(autenticou) {
			System.out.println("Acesso liberado!");
		}else {
			System.out.println("Acesso negado!");
		}
	}	
}
