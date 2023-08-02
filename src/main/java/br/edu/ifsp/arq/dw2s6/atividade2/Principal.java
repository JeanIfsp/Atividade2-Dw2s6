package br.edu.ifsp.arq.dw2s6.atividade2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		var compra = new Compra();
		compra.setNroCompra(123456);
		compra.setNomeCliente("Openhaimer");
		compra.setNomeProduto("Bomba Atomica");
		compra.setValorProduto(1000);

		var cartaoCredito = new CartaoCredito();
		cartaoCredito.setNroCartao("1234567890123456");
		cartaoCredito.setNomeCliente("Openhaimer");
		cartaoCredito.setValidate("12/28");

		var checkout =  context.getBean(Checkout.class);
		checkout.finalizar(compra, cartaoCredito);
		((ConfigurableApplicationContext)context).close();
	}

}
