package br.edu.cesmac.si.fix003.model;

import java.util.ArrayList;
import java.util.Collections;

import br.edu.cesmac.si.fix003.exception.ProfessorNullException;

public class Professor {
	private String matricula;
	private String nome;
	private String sexo;
	private String nascimento;
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public Professor(String matricula) {
		this.matricula = matricula;
		checarSeMatriculaFoiInformado();
	}

	private void checarSeMatriculaFoiInformado() {

		if (matricula == null) {

			throw new ProfessorNullException("Matricula não pode ser vazio");

		}
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public ArrayList<Disciplina> getDisciplina() {
		return disciplinas;
	}

	public void setDisciplina(ArrayList<Disciplina> disciplina) {
		this.disciplinas = disciplina;
	}

	@Override
	public String toString() {
		return " Nome: " + this.nome + "  Matricula: " + this.matricula;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Professor))
			return false;
		Professor comparacao = (Professor) obj;
		return this.matricula.equals(comparacao.matricula);
	}

	public void mostrarDados() {
		System.out.println("");
		System.out.println("-----Professor-----");
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Sexo: " + sexo);
		System.out.println("Data de Nascimento: " + nascimento);
		System.out.println("");
		if (temDisciplina()) {

			Collections.sort(disciplinas);

			for (Disciplina disciplina : disciplinas) {
				disciplina.mostrarDados();
			}
		}
	}

	private boolean temDisciplina() {
		return (this.disciplinas != null && this.disciplinas.size() > 0);
	}
}

