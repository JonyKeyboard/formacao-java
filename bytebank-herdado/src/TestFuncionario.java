
public class TestFuncionario {

	public static void main(String[] args) {
		
		Gerente nico = new Gerente();
		nico.setNome("Prof. Nico");
		nico.setCpf("455454545-23");
		nico.setSalario(4000.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		

		
	}

}
