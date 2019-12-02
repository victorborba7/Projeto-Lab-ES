package business;

import java.util.List;
import java.util.logging.Logger;

import model.bean.Aluno;
import model.dao.DAO;
import model.dao.DAOImpl;

public class AlunoBOImpl implements AlunoBO {
	private static DAO<Aluno> dao = new DAOImpl<>(Aluno.class);
	
	Logger logger = Logger.getGlobal();

	public void createAluno(Aluno aluno) throws Exception {
		try {
			dao.save(aluno);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao cadastrar o aluno!"
				+ " Verifique se todos os dados foram preenchidos corretamente." + "/n" + e.getMessage() + e.getStackTrace());
		} catch (Exception e) {
			logger.info(e.getMessage());
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao salvar o aluno.");
		}
	}

	public void updateAluno(Aluno aluno) throws Exception{
		try {
			dao.save(aluno);
		} catch (IllegalArgumentException e) {
			logger.info(e.getMessage());
			throw new IllegalArgumentException( "Ocorreu um erro ao update os dados do aluno.");
		} catch (Exception e) {
			logger.info(e.getMessage());
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao atualizar o aluno.");
		}
	}
	
	

	public List<Aluno> searchAluno(Aluno aluno) throws Exception {
		List<Aluno> result;
		try {
			result = dao.search("");
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Ocorreu um erro ao pesquisar os dados do aluno.");
		} catch (Exception e) {
			logger.info(e.getMessage());
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao buscar os aluno.");
		}
		return result;
	}

	public List<Aluno> listAll() throws Exception {
		List<Aluno> result;
		try {
			result = dao.search("listAluno");
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Ocorreu um erro ao obter a lista de alunos.");
		} catch (Exception e) {
			logger.info(e.getMessage());
			throw new Exception("Desculpe, ocorreu um erro desconhecido o obter a lista de alunos.");
		}
		return result;
	}
	
	public Aluno getAluno(String name) throws Exception{
		Aluno a;
		try {
			a = dao.get(name, "alunoName");
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Ocorreu um erro ao buscar a aluno!");
		} catch (Exception e) {
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao recuperar o aluno." + e.getMessage());
		}
		return a;
	}
}