package business;

import java.util.List;
import java.util.logging.Logger;

import model.bean.Endereco;
import model.dao.DAO;
import model.dao.DAOImpl;

public class EnderecoBOImpl implements EnderecoBO {
	private static DAO<Endereco> dao = new DAOImpl<>(Endereco.class);
	private Logger logger = Logger.getGlobal();

	public void createEndereco(Endereco endereco) throws Exception {
		try {
			dao.save(endereco);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao cadastrar o endereco!");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public void updateEndereco(Endereco endereco) throws Exception{
		try {
			dao.save(endereco);
		} catch (IllegalArgumentException e) {
			logger.info(e.getMessage());
			throw new IllegalArgumentException( "Ocorreu um erro ao salvar os dados do endereco."
				+ " Verifique se todos os dados foram preenchidos corretamente!");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	

	public List<Endereco> searchEndereco(Endereco endereco) throws Exception {
		List<Endereco> result;
		try {
			result = dao.search(endereco);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Ocorreu um erro ao salvar os dados do endereco.");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return result;
	}

	public List<Endereco> listAll() throws Exception {
		List<Endereco> result;
		try {
			result = dao.list();
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Ocorreu um erro ao obter a lista de enderecos.");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return result;
	}
	
	public Endereco getEndereco(String endereco) throws Exception{
		Endereco end;
		try {
			end = dao.get(endereco, "enderecoRua");
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao buscar a endereco!");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return end;
	}
}