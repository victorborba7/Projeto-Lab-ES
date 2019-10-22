package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.Aluno;
import model.dao.DAOImpl;

/**
 * Servlet implementation class SearchAluno
 */
public class SearchAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DAOImpl dao = new DAOImpl(Aluno.class);
	
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
		request.setAttribute("alunos", "Foi");
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}

}
