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

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		Aluno aluno = new Aluno();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCreateAluno() {
		fail("Not yet implemented");
	}

}
