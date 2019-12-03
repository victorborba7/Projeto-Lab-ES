package model.bean;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class EnderecoTest {
	Endereco endereco = new Endereco();
	
	@Test
	void testToString() {
		endereco.setRua("Rua a");
		assertNotNull(endereco.toString());
	}
	
	@Test
	void testGetRua() {
		endereco.setRua("Rua a");
		assertNotNull(endereco.getRua());
	}
	
	@Test
	void testGetNumero() {
		endereco.setNumero("123");
		assertNotNull(endereco.getNumero());
	}
	
	@Test
	void testGetBairro() {
		endereco.setBairro("Bairro b");
		assertNotNull(endereco.getBairro());
	}
	
	@Test
	void testGetCidade() {
		endereco.setCidade("Cidade c");
		assertNotNull(endereco.getCidade());
	}
	
	@Test
	void testGetEstado() {
		endereco.setEstado("Estado e");
		assertNotNull(endereco.getEstado());
	}
	
}
