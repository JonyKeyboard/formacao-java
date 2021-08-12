package com.entrevista.test;

import com.entrevista.caixa.Checkout;
import com.entrevista.caixa.Compra;
import com.entrevista.impressao.Impressora;
import com.entrevista.impressao.impressora.ImpressoraEpson;
import com.entrevista.pagamento.Cartao;
import com.entrevista.pagamento.Operadora;
import com.entrevista.pagamento.operadora.Cielo;

public class TesteCheckout {
	
	public static void main(String[] args) {
		

		Operadora operadora = new Cielo();
		Impressora impressora = new ImpressoraEpson();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Stanley J. N. Pires");
		cartao.setNumerodoCartao("123");
		
		Compra compra = new Compra();
		compra.setNomeCliente("Stanley Jony Nunes Pires");
		compra.setProduto("Sabonete");
		compra.setValorTotal(2.4);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
		
		
	}
	
	
	
}
