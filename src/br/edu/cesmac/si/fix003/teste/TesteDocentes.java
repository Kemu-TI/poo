package br.edu.cesmac.si.fix003.teste;

import java.util.ArrayList;
import br.edu.cesmac.si.fix003.model.Disciplina;
import br.edu.cesmac.si.fix003.model.Professor;

public class TesteDocentes {

	public static void main(String[] args) {
		Professor p1 = new Professor("321321");
		p1.setNome("Carlos");
		p1.setNascimento("25/11/1987");
		p1.setSexo("Masculino");

		Professor p2 = new Professor("213213");
		p2.setNome("Sandney");
		p2.setNascimento("28/12/1985");
		p2.setSexo("Masculino");

		ArrayList<Disciplina> disciplinasP1 = new ArrayList<>();
		ArrayList<Disciplina> disciplinasP2 = new ArrayList<>();

		Disciplina matematica = new Disciplina("ABA123");
		matematica.setNome("Matemática Computacional"); 
		matematica.setCarga_horaria("80");

		Disciplina probabilidade = new Disciplina("ABA321");
		probabilidade.setNome("Probabilidade e Estatística");
		probabilidade.setCarga_horaria("100");

		Disciplina algoritimo = new Disciplina("ABB123");
		algoritimo.setNome("Algoritimo");
		algoritimo.setCarga_horaria("100");

		Disciplina poo = new Disciplina("ABB321");
		poo.setNome("Programação Orientada a Objetos");
		poo.setCarga_horaria("120");

		Disciplina game = new Disciplina("ABABAB");
		game.setNome("Gameficação");
		game.setCarga_horaria("180");

		Disciplina ia = new Disciplina("BABA321");
		ia.setNome("Inteligência Artificial");
		ia.setCarga_horaria("120");

		disciplinasP1.add(matematica);
		disciplinasP1.add(probabilidade);
		disciplinasP1.add(algoritimo);
		disciplinasP2.add(poo);
		disciplinasP2.add(game);
		disciplinasP2.add(ia);

		p1.setDisciplina(disciplinasP1);
		p2.setDisciplina(disciplinasP2);

		p1.mostrarDados();
		System.out.println("");
		p2.mostrarDados();

	}

}