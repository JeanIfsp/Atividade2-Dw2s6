package br.edu.ifsp.arq.dw2s6.atividade2;

import org.springframework.stereotype.Component;

@Component
public class CartaoCreditoCielo implements Operadora {

	@Override
	public void autorizar(Compra compra, CartaoCredito cartaoCredito) {
		// TODO Auto-generated method stub
		System.out.println(Utils.validacaoOpercao(cartaoCredito.getNroCartao(),compra.getValorProduto()));
		
	}

}
