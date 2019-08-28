package business;

import java.util.List;

import model.bean.Entidade;

public interface EntidadeBO {
	public void createEntidade(Entidade entidade) throws Exception;
	public void updateEntidade(Entidade entidade) throws Exception;
	public List<Entidade> searchEntidade(Entidade entidade) throws Exception;
	public List<Entidade> listAll() throws Exception;
}
