
public class TesteReferencias {

	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		Funcionario e1 = new EditorVideo();
		e1.setNome("Ant�nio");
		e1.setSalario(1000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(e1);
		
		System.out.println(controle.getSoma());
		
		
		
		
		
		
	}
	  
	 
}
