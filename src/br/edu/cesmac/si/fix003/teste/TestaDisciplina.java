package br.edu.cesmac.si.fix003.teste;

import br.edu.cesmac.si.fix003.model.Disciplina;

public class TestaDisciplina {
    public static void main (String[] args) {
        Disciplina disciplina1 = new Disciplina("Matem�tica Computacional");
        disciplina1.setNome("Arcanjo");
        disciplina1.setCarga_horaria("40 Horas");

        Disciplina disciplina2 = new Disciplina("Probabilidade e Estat�stica");
        disciplina2.setNome("Amanda");
        disciplina2.setCarga_horaria("80 Horas");

        System.out.println(disciplina1.equals(disciplina2));
    }
}