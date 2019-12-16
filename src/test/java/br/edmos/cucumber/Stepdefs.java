package br.edmos.cucumber;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

import static org.junit.Assert.*;

import br.edmos.cucumber.util.PessoaFisicaUtil;

public class Stepdefs {
	private static String cpf;
	
	@Dado("Operador precisa garantir que o CPF é válido")
	public void operador_precisa_garantir_que_o_CPF_é_válido() {
		
	}

	@Quando("informa o {string}")
	public void informa_o(String string) {
		// Write code here that turns the phrase above into concrete actions
		Stepdefs.cpf = string;
	}
	
	@Então("Confirma que CPF é {string}")
	public void confirma_que_CPF_é(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String cpfValido = PessoaFisicaUtil.validarCpf(Stepdefs.cpf);
		assertEquals(cpfValido, string);
	}
}