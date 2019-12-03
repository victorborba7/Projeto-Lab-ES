package business;

import java.util.List;
import model.bean.Professor;

public interface ProfessorBO {
	public void createProfessor(Professor professor) throws Exception;
	public void updateProfessor(Professor professor) throws Exception;
	public List<Professor> searchProfessor(String name) throws Exception;
	public List<Professor> listAll() throws Exception;
}
