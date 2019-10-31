package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.EntidadeBOImpl;
import model.bean.Endereco;
import model.bean.Entidade;

/**
 * Servlet implementation class DojoServlet
 */
public class DojoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntidadeBOImpl entidade = new EntidadeBOImpl();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Entidade ent = new Entidade();
		Endereco end = new Endereco();
		criarEndereco(end, request);
		criarEntidade(ent, end, request);
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		printaTudo(ent);
		try {
			entidade.createEntidade(ent);
			response.getWriter().write("Cadastrado com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write("Não foi possivel realizar o cadastro");
		}
	}
	
	private void criarEndereco(Endereco endereco, HttpServletRequest request) {
		endereco.setBairro(request.getParameter("bairro"));
		endereco.setCep(request.getParameter("cep"));
		endereco.setCidade(request.getParameter("cidade"));
		endereco.setEstado(request.getParameter("estado"));
		endereco.setNumero(request.getParameter("numero"));
		endereco.setRua(request.getParameter("rua"));
	}

	private void criarEntidade(Entidade entidade, Endereco endereco, HttpServletRequest request) {
		entidade.setCnpj(request.getParameter("cnpj"));
		entidade.setEndereco(endereco);
		entidade.setNome(request.getParameter("nome_dojo"));
		entidade.setTelefone1(request.getParameter("telefone1"));
		entidade.setTelefone2(request.getParameter("telefone2"));
	}
	
	private void printaTudo(Entidade ent) {
		System.out.println(ent.toString());
	}
}
