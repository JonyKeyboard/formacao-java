
public class Gerente extends Funcionario {

	private int senha;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override 
	public double getBonificacao() { 
		return super.getBonificacao() + getSalario(); 
	}
	  
	 
}
