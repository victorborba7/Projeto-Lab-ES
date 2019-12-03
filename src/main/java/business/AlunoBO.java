package business;

import java.util.List;

import model.bean.Aluno;

public interface AlunoBO {
	public void createAluno(Aluno aluno) throws Exception;
	public void updateAluno(Aluno aluno) throws Exception;
	public List<Aluno> searchAluno(String name) throws Exception;
	public List<Aluno> listAll() throws Exception;
}
