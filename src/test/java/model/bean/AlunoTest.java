package model.bean;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlunoTest {
	Filiado filiado;
	Professor professor;
	Entidade entidade;
	Aluno aluno;
	
	@BeforeEach
	void setUp() throws Exception {
		entidade = new Entidade();
		professor = new Professor();
		filiado = new Filiado();
		aluno = new Aluno();
		professor.setFiliado(filiado);
		aluno.setFiliado(filiado);
		aluno.setProfessor(professor);
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void test() {
		assertNotNull(aluno.getFiliado(), "Filiado is null");
	}

}
