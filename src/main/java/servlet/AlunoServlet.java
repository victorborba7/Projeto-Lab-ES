package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.AlunoBOImpl;
import model.bean.Aluno;

/**
 * Servlet implementation class AlunoServlet
 */
@WebServlet("/aluno/*")
public class AlunoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AlunoBOImpl aluno = new AlunoBOImpl();
	private ServletUtil util = new ServletUtil();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		switch(request.getParameter("operacao")) {
		case "cadastrar":
			addAluno(request, response);
			break;
		case "buscar":
			searchAluno(request, response);
			break;
		case "editar":
			updateAluno(request, response);
			break;
		}
	}
	
	private void addAluno(HttpServletRequest request, HttpServletResponse response) {
		Aluno a = new Aluno();
		a = util.criarAluno(request);
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			aluno.createAluno(a);
			response.getWriter().write("Cadastrado com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void searchAluno(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Aluno a = new Aluno();
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			a = aluno.getAluno(request.getParameter("nome_aluno_buscar"));
			response.getWriter().write("Aluno: " + util.printaTudo(a));
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write("Não foi possivel realizar o cadastro");
		}
	}
	
	private void updateAluno(HttpServletRequest request, HttpServletResponse response) {
		Aluno a = new Aluno();
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			a = aluno.getAluno("Aluno Teste 1");
			aluno.updateAluno(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
