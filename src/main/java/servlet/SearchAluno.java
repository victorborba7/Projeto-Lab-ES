package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.EntidadeBOImpl;
import model.bean.Entidade;

/**
 * Servlet implementation class SearchAluno
 */
public class SearchAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntidadeBOImpl entidade = new EntidadeBOImpl();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchAluno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Entidade e = new Entidade();
    	e.setCnpj("123");
    	e.setNome("Nome");
    	e.setTelefone1("111");
    	e.setTelefone2("222");
    	
    	try {
			entidade.createEntidade(e);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			request.setAttribute("alunos", entidade.searchEntidade(e).toString());
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}

}
