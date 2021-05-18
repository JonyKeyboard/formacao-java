
public class TestFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("Prof. Nico");
		nico.setCpf("45545454545-23");
		nico.setSalario(4000.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		

		
	}

}
