package br.edu.ifsp.arq.dw2s6.atividade2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Checkout {
	@Autowired
	@Qualifier("cartaoCreditoRedecard")
	private Operadora operadora;

	public void finalizar(Compra compra, CartaoCredito cartaoCredito) {
		
		//var impressoraHp = new ImpressoraHP();
		operadora.autorizar(compra, cartaoCredito);
	}
}
