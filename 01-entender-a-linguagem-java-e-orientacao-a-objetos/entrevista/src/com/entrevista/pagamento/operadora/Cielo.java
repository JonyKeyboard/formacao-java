package com.entrevista.pagamento.operadora;

import com.entrevista.pagamento.Autorizavel;
import com.entrevista.pagamento.Cartao;
import com.entrevista.pagamento.Operadora;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumerodoCartao().startsWith("123")
				&& autorizavel.getValorTotal() < 100;
	}

}
