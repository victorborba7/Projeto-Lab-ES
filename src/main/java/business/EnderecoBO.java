package business;

import java.util.List;

import model.bean.Endereco;

public interface EnderecoBO {
	public void createEndereco(Endereco aluno) throws Exception;
	public void updateEndereco(Endereco aluno) throws Exception;
	public List<Endereco> searchEndereco(Endereco aluno) throws Exception;
	public List<Endereco> listAll() throws Exception;
}
