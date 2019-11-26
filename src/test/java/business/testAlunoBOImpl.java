/**
 * 
 */
package business;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.bean.Aluno;

/**
 * @author roribeir
 *
 */
class testAlunoBOImpl {
	AlunoBOImpl alunoBO = new AlunoBOImpl();
	Aluno aluno = new Aluno();
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		aluno.setEntidade(null);
		aluno.setFiliado(null);
		aluno.setProfessor(null);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void testCreateAluno() {
		try {
			alunoBO.createAluno(aluno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fail("Not yet implemented");
	}

}
