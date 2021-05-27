
public class FluxoComError {

    public static void main(String[] args) throws MinhaExcecao {
        System.out.println("Ini do main");
        try {
        	metodo1();
     
        }catch (ArithmeticException | NullPointerException ex) {
        	System.out.println("Null "+ ex.getMessage());
        	ex.printStackTrace();
		}
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        metodo2();
        System.out.println("Fim do metodo2");
    }
}