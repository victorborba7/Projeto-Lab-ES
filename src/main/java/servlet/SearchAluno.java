package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.AlunoBOImpl;
import model.bean.Aluno;
import model.bean.Endereco;
import model.bean.Entidade;
import model.bean.Filiado;
import model.bean.Professor;

/**
 * Servlet implementation class SearchAluno
 */
public class SearchAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AlunoBOImpl aluno = new AlunoBOImpl();
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchAluno() {
        super();
    }

	/**
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Aluno a = new Aluno();
    	Entidade e = new Entidade();
    	Endereco end = new Endereco();
    	Filiado f = new Filiado();
    	Professor p = new Professor();
    	f.setId(1l);
    	f.setEndereco(end);
    	e.setEndereco(end);
    	e.setCnpj("123");
    	e.setNome("nome");
    	e.setTelefone1("11");
    	e.setTelefone2("erw");
    	a.setFiliado(f);
    	a.setEntidade(e);
    	a.setProfessor(p);
    	p.setFiliado(f);
    	//p.setEntidades(null);
    	
    	try {
			aluno.createAluno(a);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
		try {
			request.setAttribute("alunos", /*aluno.searchAluno(a).get(0).toString()*/"Cadastrou");
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}

}
