package model.validator;

import model.bean.Aluno;

public class AlunoValidator implements Validator<Aluno>{
	public boolean validate(Aluno obj) {
		return true;
	}
}