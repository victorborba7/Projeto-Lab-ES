package facade;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import business.AlunoBO;
import business.AlunoBOImpl;
import business.EntidadeBO;
import business.EntidadeBOImpl;
import business.ProfessorBO;
import business.ProfessorBOImpl;
import business.ProfessorEntidadeBO;
import business.ProfessorEntidadeBOImpl;
import model.bean.Aluno;
import model.bean.Entidade;
import model.bean.Professor;
import model.bean.ProfessorEntidade;

public class AppFacadeImpl implements AppFacade {
	
	private AlunoBO alunoBO;
	private ProfessorBO professorBO;
	private EntidadeBO entidadeBO;
	private ProfessorEntidadeBO professorEntidadeBO;
	
	public AppFacadeImpl() {
	}

	private void reportException(Exception e){
	}
	
	public void createAluno(Aluno aluno) {
		System.out.println("AppFacadeImpl.createAluno()");
		try{
			alunoBO.createAluno(aluno);
		}catch (Exception e) {
			reportException(e);
		}
	}

	public void updateAluno(Aluno aluno) {
		try{
			alunoBO.updateAluno(aluno);
		}catch (Exception e) {
			reportException(e);
		}
	}

	public List<Aluno> searchAluno(Aluno aluno) {
		List<Aluno> result = new ArrayList<Aluno>();
		try{
			result = alunoBO.searchAluno(aluno);
		}catch (Exception e) {
			reportException(e);
		}
		return result;
	}

	public void listAlunos() {
		try{
			alunoBO.listAll();
		}catch (Exception e) {
			reportException(e);
		}
	}

	public void createProfessor(Professor professor) {
		try{
			professorBO.createProfessor(professor);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			reportException(e);
		}		
	}

	public List<Professor> listProfessores() {
		List<Professor> result = null;
		try{
			result = professorBO.listAll();
		}catch (Exception e) {
			reportException(e);
		}
		return result;
	}

	public List<Professor> searchProfessor(Professor professor) {
		List<Professor> result = null;
		try{
			result = professorBO.searchProfessor(professor);
		}catch (Exception e) {
			reportException(e);
		}
		return result;
	}

	public void updateProfessor(Professor professor) {
		try{
			professorBO.updateProfessor(professor);
		}catch (Exception e) {
			reportException(e);
		}
	}

	public void createEntidade(Entidade entidade) {
		try{
			entidadeBO.createEntidade(entidade);
		}catch (Exception e) {
			reportException(e);
		}
	}

	public List<Entidade> listEntidade() {
		List<Entidade> result = null;
		try{
			result = entidadeBO.listAll();
		}catch (Exception e) {
			reportException(e);
		}
		return result; 
	}

	public List<Entidade> searchEntidade(Entidade entidade) {
		List<Entidade> result = null;
		try{
			result = entidadeBO.searchEntidade(entidade);
		}catch (Exception e) {
			reportException(e);
		}
		return result;
	}

	public void updateEntidade(Entidade entidade) {
		try{
			entidadeBO.updateEntidade(entidade);
		}catch (Exception e) {
			reportException(e);
		}
	}

	public void createProfessorEntidade(List<ProfessorEntidade> relacionamentos) {
		try{
			professorEntidadeBO.createProfessorEntidade(relacionamentos);
		}catch (Exception e) {
			reportException(e);
		}
	}
}
