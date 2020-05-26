package br.edu.cesmac.si.fix003.teste;

import br.edu.cesmac.si.fix003.model.Disciplina;
import br.edu.cesmac.si.fix003.model.Professor;

public class TestaExceptions {

	public static void main(String[] args) {
		Disciplina sexo = new Disciplina("ABCABC");
		Professor carlos = new Professor("112233");
		
		carlos.mostrarDados();
		sexo.mostrarDados();
	}
	


}
