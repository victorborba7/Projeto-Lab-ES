package servlet;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import business.EntidadeBOImpl;
import model.bean.Entidade;

/**
 * Servlet implementation class DojoServlet
 */
@WebServlet("/dojo/*")
public class DojoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final EntidadeBOImpl entidade = new EntidadeBOImpl();
	private final ServletUtil util = new ServletUtil();
	private final Logger logger = Logger.getGlobal();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		switch(request.getParameter("operacao")) {
		case "cadastrar":
			try {
				addDojo(request, response);
			} catch(IOException e) {
				logger.info(e.getMessage());
			}
			break;
		case "buscar":
			try {
				searchDojo(request, response);
			}catch (IOException e) {
				logger.info(e.getMessage());
			}
			break;
		case "editar":
			updateDojo(request, response);
			break;
		}
		
	}
	
	private void addDojo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Entidade ent = new Entidade();
		ent = util.criarEntidade(request);
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			entidade.createEntidade(ent);
			response.getWriter().write("Cadastrado com sucesso");
		} catch (Exception e) {
			logger.info(e.getMessage());
			response.getWriter().write("Não foi possivel realizar o cadastro");
		}
	}
	
	private void searchDojo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Entidade ent = new Entidade();
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			ent = entidade.getEntidade(request.getParameter("nome_dojo_buscar"));
			ObjectMapper mapper = new ObjectMapper();
			String result = mapper.writeValueAsString(ent);
			request.setAttribute("result", result);
			response.getWriter().write("Dojo: " + result);
		} catch (Exception e) {
			logger.info(e.getMessage());
			response.getWriter().write("Não foi possivel realizar o cadastro");
		}
	}
	
	private void updateDojo(HttpServletRequest request, HttpServletResponse response) {
		Entidade ent = new Entidade();
		Entidade newEnt = new Entidade();
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		try {
			newEnt = entidade.getEntidade(request.getParameter("nome_dojo_buscar"));
			ent = util.criarEntidade(request);
			newEnt.copyProperties(ent);
			entidade.updateEntidade(newEnt);
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
	}
}
