package business;

import java.util.List;

import model.bean.Endereco;
import model.dao.DAO;
import model.dao.DAOImpl;

public class EnderecoBOImpl implements EnderecoBO {
	private static DAO<Endereco> dao = new DAOImpl<Endereco>(Endereco.class);

	public void createEndereco(Endereco endereco) throws Exception {
		System.out.println("EnderecoBOImpl.createEndereco()");
		try {
			dao.save(endereco);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao cadastrar o endereco!"
				+ " Verifique se todos os dados foram preenchidos corretamente.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao salvar o endereco.");
		}
	}

	public void updateEndereco(Endereco endereco) throws Exception{
		try {
			dao.save(endereco);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			throw new IllegalArgumentException( "Ocorreu um erro ao salvar os dados do endereco."
				+ " Verifique se todos os dados foram preenchidos corretamente!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao salvar o endereco.");
		}
	}
	
	

	public List<Endereco> searchEndereco(Endereco endereco) throws Exception {
		List<Endereco> result;
		try {
			result = dao.search(endereco);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Ocorreu um erro ao salvar os dados do endereco."
				+ " Verifique se todos os dados foram preenchidos corretamente!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao buscar os endereco.");
		}
		return result;
	}

	public List<Endereco> listAll() throws Exception {
		List<Endereco> result;
		try {
			result = dao.list();
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Ocorreu um erro ao obter a lista de enderecos."
				+ " Verifique se todos os dados foram preenchidos corretamente!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido o obter a lista de enderecos.");
		}
		return result;
	}
	
	public Endereco getEndereco(String endereco) throws Exception{
		Endereco end;
		try {
			end = dao.get(endereco, "enderecoRua");
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException( "Ocorreu um erro ao buscar a endereco!"
				+ " Verifique se todos os dados foram preenchidos corretamente.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Desculpe, ocorreu um erro desconhecido ao atualizar a endereco.");
		}
		return end;
	}
}