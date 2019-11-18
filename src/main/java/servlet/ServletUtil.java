/**
 * 
 */
package servlet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import business.EntidadeBOImpl;
import model.bean.Aluno;
import model.bean.Endereco;
import model.bean.Entidade;
import model.bean.Filiado;
import model.bean.Professor;

/**
 * @author roribeir
 *
 */
public class ServletUtil {
	private EntidadeBOImpl entidade = new EntidadeBOImpl();
	
	public Endereco criarEndereco(HttpServletRequest request) {
		Endereco endereco = new Endereco();
		endereco.setBairro(request.getParameter("bairro"));
		endereco.setCep(request.getParameter("cep"));
		endereco.setCidade(request.getParameter("cidade"));
		endereco.setEstado(request.getParameter("estado"));
		endereco.setNumero(request.getParameter("numero"));
		endereco.setRua(request.getParameter("rua"));
		return endereco;
	}

	public Entidade criarEntidade(HttpServletRequest request) {
		Entidade entidade = new Entidade();
		entidade.setCnpj(request.getParameter("cnpj"));
		entidade.setEndereco(criarEndereco(request));
		entidade.setNome(request.getParameter("nome_dojo"));
		entidade.setTelefone1(request.getParameter("telefone1"));
		entidade.setTelefone2(request.getParameter("telefone2"));
		return entidade;
	}
	
	public Filiado criarFiliado(HttpServletRequest request) {
		Filiado f = new Filiado();
		f.setCpf(request.getParameter("cpf"));
		f.setDataCadastro(LocalDate.now());
		f.setDataNascimento(null);
		f.setEmail(null);
		f.setEndereco(criarEndereco(request));
		f.setFaixas(null);
		f.setNome(request.getParameter("nome"));
		f.setObservacoes(null);
		f.setRegistroCbj(request.getParameter("registro_cbj"));
		f.setRg(request.getParameter("rg"));
		f.setTelefone1(request.getParameter("telefone1"));
		f.setTelefone2(null);
		return f;
	}
	
	public Professor criarProfessor(HttpServletRequest request) {
		Professor professor = new Professor();
		Entidade e = new Entidade();
		List<Entidade> ent = new ArrayList<Entidade>();
		try {
			System.out.println(request.getParameter("nome_dojo"));
			e = entidade.getEntidade(request.getParameter("nome_dojo"));
			ent.add(e);
			professor.setEntidades(ent);
			professor.setFiliado(criarFiliado(request));
			return professor;
		} catch (Exception e1) {
			e1.printStackTrace();
			return null;
		}
		
	}
	
	public Aluno criarAluno(HttpServletRequest request) {
		Aluno aluno = new Aluno();
		Entidade ent = null;
		Professor prof = null;
		aluno.setEntidade(ent);
		aluno.setProfessor(prof);
		aluno.setFiliado(criarFiliado(request));
		return aluno;
	}
	
	public String printaTudo(Object O) {
		System.out.println(O.toString());
		return O.toString();
	}
}
