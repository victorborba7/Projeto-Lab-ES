package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.AlunoBOImpl;
import model.bean.Aluno;
import model.bean.Endereco;
import model.bean.Entidade;

/**
 * Servlet implementation class AlunoServlet
 */
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
			break;
		case "editar":
			break;
		}
	}
	
	private void addAluno(HttpServletRequest request, HttpServletResponse response) {
		Aluno a = util.criarAluno(request);
		try {
			aluno.createAluno(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
