
public class TesteConexao {

	public static void main(String[] args) {
		
		try {
			Conexao con = new Conexao();
			con.leDados();
			con.fecha();
		}catch (Exception e) {
			System.out.println("Deu erro na conex�o");
		}
	}
	
}
