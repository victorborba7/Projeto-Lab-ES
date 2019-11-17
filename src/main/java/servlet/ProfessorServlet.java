package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.ProfessorBOImpl;
import model.bean.Endereco;
import model.bean.Entidade;
import model.bean.Professor;

/**
 * Servlet implementation class DojoServlet
 */
public class ProfessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProfessorBOImpl professor = new ProfessorBOImpl();
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
	
	private String printaTudo(Professor prof) {
		System.out.println(prof.toString());
		return prof.toString();
	}
	
	private void addDojo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Professor prof = new Professor();
		Entidade ent = new Entidade();
		Endereco end = new Endereco();
		util.criarEndereco(end, request);
		util.criarEntidade(ent, end, request);
		util.criarProfessor(prof, ent, end, request);
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			professor.createProfessor(prof);
			response.getWriter().write("Cadastrado com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write("Não foi possivel realizar o cadastro");
		}
	}
	
	private void searchDojo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Professor prof = new Professor();
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		System.out.println(request.getParameter("nome_dojo_buscar"));
		try {
			prof = professor.getProfessor(request.getParameter("nome_dojo_buscar"));
			response.getWriter().write("Dojo: " + printaTudo(prof));
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write("Não foi possivel realizar o cadastro");
		}
	}
	
	private void updateDojo(HttpServletRequest request, HttpServletResponse response) {
		Professor prof = new Professor();
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			//ent = entidade.getEntidade(request.getParameter("nome_dojo_buscar"));
			//prof = professor.getProfessor(request.getParameter(""));
			prof = professor.getProfessor("");
			professor.updateProfessor(prof);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
