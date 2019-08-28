package business;

import java.util.List;
import model.bean.Professor;
import model.dao.DAO;
import model.dao.DAOImpl;
import util.FiliadoID;

public class ProfessorBOImpl implements ProfessorBO {
	
	private static DAO<Professor> dao = new DAOImpl<Professor>(Professor.class);



	public void createProfessor(Professor professor) throws Exception {
		try {
			professor.getFiliado().setId(FiliadoID.getNextID());
			dao.save(professor);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao cadastrar o professor!"
				+ " Verifique se todos os dados foram preenchidos corretamente.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao salvar o professor.");
		}
	}
	
	public void updateProfessor(Professor professor) throws Exception {
		try {
			dao.save(professor);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao atualizar os dados do professor!"
				+ " Verifique se todos os dados foram preenchidos corretamente.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao atualizar o professor.");
		}
	}

	public List<Professor> listAll() throws Exception {
		List<Professor> result;
		try {
			result = dao.list();
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Ocorreu um erro ao listar de professores."
				+ " Verifique se todos os dados foram preenchidos corretamente!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao listar professores.");
		}
		return result;
	}

	public List<Professor> searchProfessor(Professor professor)
			throws Exception {
		List<Professor> result;
		try {
			result = dao.search(professor);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Ocorreu um erro ao buscar os professores."
				+ " Verifique se todos os dados foram preenchidos corretamente!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao buscar os professores.");
		}
		return result;
	}
}
