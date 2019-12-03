package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import business.AlunoBOImpl;
import business.ProfessorBOImpl;
import model.bean.Aluno;
import model.bean.Entidade;
import model.bean.Professor;

/**
 * Servlet implementation class AlunoServlet
 */
@WebServlet("/aluno/*")
public class AlunoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final AlunoBOImpl aluno = new AlunoBOImpl();
	private final ProfessorBOImpl professor = new ProfessorBOImpl();
	private final ServletUtil util = new ServletUtil();
	private final Logger logger = Logger.getGlobal();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		switch(request.getParameter("operacao")) {
		case "cadastrar":
			try {
				addAluno(request, response);
			} catch (IOException e) {
				logger.info(e.getMessage());
			}
			break;
		case "buscar":
			try {
				searchAluno(request, response);
			} catch(IOException e) {
				logger.info(e.getMessage());
			}
			break;
		case "editar":
			try {
				updateAluno(request, response);
			} catch(IOException e) {
				logger.info(e.getMessage());
			}
			break;
		case "listar":
			try {
				listarAlunos(request, response);
			} catch (IOException e) {
				logger.info(e.getMessage());
			}
			break;
		case "filtrar":
			try {
				listAlunoName(request, response);
			} catch (IOException e) {
				logger.info(e.getMessage());
			}
			break;
		case "transformar":
			try {
				transformarAluno(request, response);
			} catch(IOException e) {
				logger.info(e.getMessage());
			}
		}
	}
	
	private void addAluno(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Aluno a = new Aluno();
		a = util.criarAluno(request);
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			aluno.createAluno(a);
			response.getWriter().write("true");
		} catch (Exception e) {
			logger.info(e.getMessage());
			response.getWriter().write("false");
		}
	}
	
	private void searchAluno(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Aluno a = new Aluno();
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		
		try {
			a = aluno.getAluno(request.getParameter("nome_aluno_buscar"));
			ObjectMapper mapper = new ObjectMapper();
			String result = mapper.writeValueAsString(a);
			request.setAttribute("result", result);
			response.getWriter().write("Aluno: " + result);
		} catch (Exception e) {
			logger.info(e.getMessage());
			response.getWriter().write("false");
		}
	}
	
	private void updateAluno(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Aluno a = new Aluno();
		Aluno newAluno = new Aluno();
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			newAluno = aluno.getAluno(request.getParameter("nome"));
			a = util.criarAluno(request);
			newAluno.copyProperties(a);
			aluno.updateAluno(newAluno);
			response.getWriter().write("true");
		} catch (Exception e) {
			logger.info(e.getMessage());
			response.getWriter().write("false");
		}
	}
	
	private void listarAlunos(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<Aluno> alunos;
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			alunos = aluno.listAll();
			ObjectMapper mapper = new ObjectMapper();
			String result = mapper.writeValueAsString(alunos);
			request.setAttribute("result", result);
			System.out.println(result);
			response.getWriter().write("Alunos: " + result);;
		} catch (IOException e) {
			logger.info(e.getMessage());
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
	}
	
	private void listAlunoName(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<Aluno> alunos;
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			alunos = aluno.searchAluno(request.getParameter("nome_aluno_filtrar"));
			ObjectMapper mapper = new ObjectMapper();
			String result = mapper.writeValueAsString(alunos);
			request.setAttribute("result", result);
			System.out.println(result);
			response.getWriter().write("Alunos: " + result);
		} catch (IOException e) {
			logger.info(e.getMessage());
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
	}
	
	private void transformarAluno(HttpServletRequest request, HttpServletResponse response) throws IOException{
		Aluno oldAluno;
		Professor newProf = new Professor();
		try {
			oldAluno = aluno.getAluno(request.getParameter("nome_aluno"));
			List<Entidade> ent = new ArrayList<>();
			ent.add(oldAluno.getEntidade());
			newProf.setEntidades(ent);
			newProf.setFiliado(oldAluno.getFiliado());
			professor.createProfessor(newProf);
		} catch (IOException e) {
			logger.info(e.getMessage());
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
	}
}
