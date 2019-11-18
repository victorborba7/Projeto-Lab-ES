package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.ProfessorBOImpl;
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
			addProfessor(request, response);
			break;
		case "buscar":
			searchProfessor(request, response);
			break;
		case "editar":
			updateProfessor(request, response);
			break;
		}
		
	}
	
	private void addProfessor(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Professor prof = new Professor();
		prof = util.criarProfessor(request);
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
	
	private void searchProfessor(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Professor prof = new Professor();
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			prof = professor.getProfessor(request.getParameter("nome_professor_buscar"));
			response.getWriter().write("Professor: " + util.printaTudo(prof));
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write("Não foi possivel realizar o cadastro");
		}
	}
	
	private void updateProfessor(HttpServletRequest request, HttpServletResponse response) {
		Professor prof = new Professor();
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			//ent = entidade.getEntidade(request.getParameter("nome_dojo_buscar"));
			//prof = professor.getProfessor(request.getParameter(""));
			prof = professor.getProfessor("Professor Teste 1");
			professor.updateProfessor(prof);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}