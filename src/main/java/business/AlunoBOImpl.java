package business;

import java.util.List;

import model.bean.Aluno;
import model.dao.DAO;
import model.dao.DAOImpl;
import util.FiliadoID;

public class AlunoBOImpl implements AlunoBO {
	private static DAO<Aluno> dao = new DAOImpl<Aluno>(Aluno.class);

	public void createAluno(Aluno aluno) throws Exception {
		System.out.println("AlunoBOImpl.createAluno()");
		try {
			aluno.getFiliado().setId(FiliadoID.getNextID());
			dao.save(aluno);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao cadastrar o aluno!"
				+ " Verifique se todos os dados foram preenchidos corretamente.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao salvar o aluno.");
		}
	}

	public void updateAluno(Aluno aluno) throws Exception{
		try {
			Aluno old = null;
			old = dao.get(aluno);
			if(old!=null){		
				old.copyProperties(aluno);
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			throw new IllegalArgumentException( "Ocorreu um erro ao salvar os dados do aluno."
				+ " Verifique se todos os dados foram preenchidos corretamente!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao salvar o aluno.");
		}
	}
	
	

	public List<Aluno> searchAluno(Aluno aluno) throws Exception {
		List<Aluno> result;
		try {
			result = dao.search(aluno);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Ocorreu um erro ao salvar os dados do aluno."
				+ " Verifique se todos os dados foram preenchidos corretamente!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao buscar os aluno.");
		}
		return result;
	}

	public List<Aluno> listAll() throws Exception {
		List<Aluno> result;
		try {
			result = dao.list();
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Ocorreu um erro ao obter a lista de alunos."
				+ " Verifique se todos os dados foram preenchidos corretamente!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido o obter a lista de alunos.");
		}
		return result;
	}
}