package business;

import java.util.List;

import model.bean.Entidade;
import model.dao.DAO;
import model.dao.DAOImpl;

public class EntidadeBOImpl implements EntidadeBO {
	
	private static DAO<Entidade> dao = new DAOImpl<Entidade>(Entidade.class);

	public void createEntidade(Entidade entidade) throws Exception {
		System.out.println("EntidadeBOImpl.createEntidade()");
		try {
			dao.save(entidade);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao cadastrar o dojo!"
				+ " Verifique se todos os dados foram preenchidos corretamente.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao salvar o dojo.");
		}
	}

	public List<Entidade> listAll() throws Exception {
		List<Entidade> result;
		try {
			result = dao.list();
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao listar entidades!"
				+ " Verifique se todos os dados foram preenchidos corretamente.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao listar entidades.");
		}
		return result;
	}

	public List<Entidade> searchEntidade(Entidade entidade) throws Exception {
		List<Entidade> result;
		try {
			result = dao.search(entidade);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao buscar entidades!"
				+ " Verifique se todos os dados foram preenchidos corretamente.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao buscar entidades.");
		}
		return result;
	}

	public void updateEntidade(Entidade entidade) throws Exception {
		try {
			dao.save(entidade);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao atualizar a entidade!"
				+ " Verifique se todos os dados foram preenchidos corretamente.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao atualizar a entidade.");
		}
	}
	
	public Entidade getEntidade(String name) throws Exception{
		Entidade enti;
		try {
			enti = dao.get(name, "dojoName");
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao buscar a entidade!"
				+ " Verifique se todos os dados foram preenchidos corretamente.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao atualizar a entidade.");
		}
		return enti;
	}
	
	public void remove(String name) throws Exception {
		try {
			dao.delete(getEntidade(name));
		} catch(IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao buscar a entidade!"
					+ " Verifique se todos os dados foram preenchidos corretamente.");
		}
	}
}
