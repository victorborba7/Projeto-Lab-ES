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
	private ServletUtil util = new ServletUtil();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		switch(request.getParameter("operacao")) {
		case "cadastrar":
			addDojo(request, response);
			break;
		case "buscar":
			searchDojo(request, response);
			break;
		case "editar":
			updateDojo(request, response);
			break;
		}
		
	}
	
	private void addDojo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Entidade ent = new Entidade();
		ent = util.criarEntidade(request);
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			entidade.createEntidade(ent);
			response.getWriter().write("Cadastrado com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write("Não foi possivel realizar o cadastro");
		}
	}
	
	private void searchDojo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Entidade ent = new Entidade();
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			ent = entidade.getEntidade(request.getParameter("nome_dojo_buscar"));
			response.getWriter().write("Dojo: " + util.printaTudo(ent));
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write("Não foi possivel realizar o cadastro");
		}
	}
	
	private void updateDojo(HttpServletRequest request, HttpServletResponse response) {
		Entidade ent = new Entidade();
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			//ent = entidade.getEntidade(request.getParameter("nome_dojo_buscar"));
			ent = entidade.getEntidade("Teste Dojo 1");
			ent.setCnpj("6564654645");
			entidade.updateEntidade(ent);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
