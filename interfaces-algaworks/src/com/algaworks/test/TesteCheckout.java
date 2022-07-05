package com.algaworks.test;

import com.algaworks.caixa.Checkout;
import com.algaworks.caixa.Compra;
import com.algaworks.impressao.Impressora;
import com.algaworks.impressao.impressoras.Epson;
import com.algaworks.pagamento.Cartao;
import com.algaworks.pagamento.Operadora;
import com.algaworks.pagamento.operadora.Cielo;

public class TesteCheckout {
	
	public static void main(String[] args) {
		
		Operadora operadora = new Cielo();
		Impressora impressora = new Epson();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Antonio J Nexes");
		cartao.setNumeroCartao("321");
		
		Compra compra = new Compra();
		compra.setNomeCliente("Antonio Jose Neves");
		compra.setProduto("Sabonete");
		compra.setValorTotal(2.5);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
		
	}
	
	
	
}
