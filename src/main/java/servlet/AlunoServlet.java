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
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Aluno a = new Aluno();
		switch(request.getParameter("operacao")) {
		case "cadastrar":
			addAluno(a, request);
		}
	}
	
	private void addAluno(Aluno a, HttpServletRequest request) {
		try {
			aluno.createAluno(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
