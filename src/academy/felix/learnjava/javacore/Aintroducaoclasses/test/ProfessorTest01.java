package academy.felix.learnjava.javacore.Aintroducaoclasses.test;

import academy.felix.learnjava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 123;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " Idade: "+professor.idade + " Sexo: " +professor.sexo);

    }
}
