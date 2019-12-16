package br.edmos.cucumber;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CadastroPessoaStepdefs {
	@Quando("informar o {string}")
	public void informar_o(String cpf) {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Dado("Que o usuário informou o {string}")
	public void que_o_usuário_informou_o(String primeiroNome) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Dado("Que o usuário informou o {string} da Pessoa")
	public void que_o_usuário_informou_o_da_Pessoa(String sobreNome) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Quando("o {string} da Pessoa não existir no cadastro")
	public void o_da_Pessoa_não_existir_no_cadastro(String cpf) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Quando("que o {string} é um CPF {string}")
	public void que_o_é_um_CPF(String cpf, String valido) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Então("Realiza o cadastro da Pessoa")
	public void realiza_o_cadastro_da_Pessoa() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}
}
