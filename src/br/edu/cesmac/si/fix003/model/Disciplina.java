package br.edu.cesmac.si.fix003.model;

import br.edu.cesmac.si.fix003.exception.DisciplinaNullException;

public class Disciplina implements Comparable<Disciplina> {
	private String identificador;
	private String nome;
	private String carga_horaria;

	public Disciplina(String identificador) {
		this.identificador = identificador;
		checarSeIdentificadorFoiInformado();
	}

	private void checarSeIdentificadorFoiInformado() {

		if (identificador == null) {

			throw new DisciplinaNullException("Identificador não pode ser vazio");

		}
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCarga_horaria() {
		return carga_horaria;
	}

	public void setCarga_horaria(String carga_horaria) {
		this.carga_horaria = carga_horaria;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + " Carga Horária: " + this.carga_horaria;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Disciplina))
			return false;
		Disciplina comparacao = (Disciplina) obj;
		return this.identificador.equals(comparacao.identificador);
	}

	@Override
	public int compareTo(Disciplina disciplina) {
		return this.getNome().compareTo(disciplina.getNome());
	}

	public void mostrarDados() {
		System.out.println("");
		System.out.println("-----Disciplina-----");
		System.out.println("Nome: " + nome);
		System.out.println("Identificador: " + identificador);
		System.out.println("Carga Horária: " + carga_horaria);
		System.out.println("");
	}

}