package br.edu.ifsp.arq.dw2s6.atividade2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Utils {

    public static String validacaoOpercao(String nroCartao, double valorCompra){

        String messageVidacao = "";

        messageVidacao += validaoCartao(nroCartao) == true ?"Número do cartão validado com sucesso" : "Número do cartão inválido";

        messageVidacao += validateValorCompra(valorCompra) == true ? "\nCompra pode ser finalizada":"\nO valor da compra é acima do aceitado";

        return messageVidacao;
    }
    public static boolean validaoCartao(String nroCartao){
        Pattern padrao = Pattern.compile("^1234.");
        Matcher matcher = padrao.matcher(nroCartao);
        return matcher.find();
    }

    public static boolean validateValorCompra(double valorCompra){
        return valorCompra < 1000;
    }
}
