package business;

import java.util.List;
import java.util.logging.Logger;

import model.bean.ProfessorEntidade;
import model.dao.DAO;
import model.dao.DAOImpl;

public class ProfessorEntidadeBOImpl implements ProfessorEntidadeBO {

	DAO<ProfessorEntidade> dao = new DAOImpl<ProfessorEntidade>(ProfessorEntidade.class);
	private Logger logger = Logger.getGlobal();

	public void createProfessorEntidade(List<ProfessorEntidade> relacionamentos)
	throws Exception {
		System.out.println("ProfessorEntidadeBOImpl.createProfessorEntidade()");
		try {
			for (ProfessorEntidade professorEntidade : relacionamentos) {
				dao.save(professorEntidade);
			}
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao associar o professor às suas entidades!"
				+ " Verifique se todos os dados foram preenchidos corretamente.");
		} catch (Exception e) {
			logger.info(e.getMessage());
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao salvar os relacionamentos.");
		}
	}
}
