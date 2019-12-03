package servlet;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import business.ProfessorBOImpl;
import model.bean.Entidade;
import model.bean.Professor;

/**
 * Servlet implementation class DojoServlet
 */
@WebServlet("/professor/*")
public class ProfessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final ProfessorBOImpl professor = new ProfessorBOImpl();
	private final ServletUtil util = new ServletUtil();
	private final Logger logger = Logger.getGlobal();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("operacao"));
		switch(request.getParameter("operacao")) {
		case "cadastrar":
			try {
				addProfessor(request, response);
			} catch(IOException e) {
				logger.info(e.getMessage());
			}
			break;
		case "buscar":
			try {
				searchProfessor(request, response);
			} catch(IOException e) {
				logger.info(e.getMessage());
			}
			break;
		case "editar":
			try {
				updateProfessor(request, response);
			} catch(IOException e) {
				logger.info(e.getMessage());
			}
			break;
		case "listar":
			try {
				listarProfessores(request, response);
			} catch(IOException e) {
				logger.info(e.getMessage());
			}
			break;
		case "filtrar":
			try {
				listaProfessorNome(request, response);
			} catch (IOException e) {
				logger.info(e.getMessage());
			}
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
			response.getWriter().write("true");
		} catch (Exception e) {
			logger.info(e.getMessage());
			response.getWriter().write("false");
		}
	}
	
	private void searchProfessor(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Professor prof = new Professor();
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			prof = professor.getProfessor(request.getParameter("nome_professor_buscar"));
			ObjectMapper mapper = new ObjectMapper();
			String result = mapper.writeValueAsString(prof);
			request.setAttribute("result", result);
			response.getWriter().write("Professor: " + result);
		} catch (Exception e) {
			logger.info(e.getMessage());
			response.getWriter().write("false");
		}
	}
	
	private void updateProfessor(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Professor prof = new Professor();
		Professor newProf = new Professor();
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			newProf = professor.getProfessor(request.getParameter("nome_professor_filtrar"));
			prof = util.criarProfessor(request);
			newProf.copyProperties(prof);
			professor.updateProfessor(prof);
			response.getWriter().write("true");
		} catch (Exception e) {
			logger.info(e.getMessage());
			response.getWriter().write("false");
		}
		
	}
	private void listarProfessores(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<Professor> profs;
		response.setContentType("text/plain");
		response.setCharacterEncoding("UFT-8");
		try {
			profs = professor.listAll();
			System.out.println("Quantidade de professeres encontrados: " + profs.size());
			ObjectMapper mapper = new ObjectMapper();
			String result = mapper.writeValueAsString(profs);
			request.setAttribute("result", result);
			System.out.println(result);
			response.addHeader("result", result);
			response.getWriter().write("Professores: " + result);
		} catch (IOException e) {
			logger.info(e.getMessage());
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
	}
	
	private void listaProfessorNome(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<Professor> profs;
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			profs = professor.searchProfessor(request.getParameter("nome_dojo_filtrar"));
			ObjectMapper mapper = new ObjectMapper();
			String result = mapper.writeValueAsString(profs);
			System.out.println(result);
			request.setAttribute("result", result);
			response.addHeader("result", result);
			response.getWriter().write("Dojos: " + result);
		} catch (IOException e) {
			logger.info(e.getMessage());
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
	}
}
