package br.edu.cesmac.si.fix003.teste;

import br.edu.cesmac.si.fix003.model.Professor;

public class TestaProfessor {
	public static void main(String[] args) {
		Professor professor = new Professor("111111");
		professor.setNome("Mozart");

		Professor professor1 = new Professor("222222");
		professor1.setNome("Carlos");

		Professor professor2 = new Professor("333333");
		professor2.setNome("Carol");

		System.out.println(professor.toString());
		System.out.println(professor1.equals(professor2));
	}
}