package br.edu.ifsp.arq.dw2s6.atividade2;

import org.springframework.stereotype.Component;

@Component
public class CartaoCreditoRedecard implements Operadora {
	
	public void autorizar(Compra compra, CartaoCredito cartaoCredito) {

		System.out.println(Utils.validacaoOpercao(cartaoCredito.getNroCartao(),compra.getValorProduto()));

	}

}
