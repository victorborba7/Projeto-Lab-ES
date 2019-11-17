/**
 * 
 */
package servlet;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import model.bean.Endereco;
import model.bean.Entidade;
import model.bean.Professor;

/**
 * @author roribeir
 *
 */
public class ServletUtil {
	
	public void criarEndereco(Endereco endereco, HttpServletRequest request) {
		endereco.setBairro(request.getParameter("bairro"));
		endereco.setCep(request.getParameter("cep"));
		endereco.setCidade(request.getParameter("cidade"));
		endereco.setEstado(request.getParameter("estado"));
		endereco.setNumero(request.getParameter("numero"));
		endereco.setRua(request.getParameter("rua"));
	}

	public void criarEntidade(Entidade entidade, Endereco endereco, HttpServletRequest request) {
		criarEndereco(endereco, request);
		entidade.setCnpj(request.getParameter("cnpj"));
		entidade.setEndereco(endereco);
		entidade.setNome(request.getParameter("nome_dojo"));
		entidade.setTelefone1(request.getParameter("telefone1"));
		entidade.setTelefone2(request.getParameter("telefone2"));
	}
	
	public void criarProfessor(Professor professor, Entidade entidade, Endereco endereco, HttpServletRequest request) {
		criarEntidade(entidade, endereco, request);
		List<Entidade> ent = new ArrayList<Entidade>();
		ent.add(entidade);
		professor.setEntidades(ent);
	}
}
