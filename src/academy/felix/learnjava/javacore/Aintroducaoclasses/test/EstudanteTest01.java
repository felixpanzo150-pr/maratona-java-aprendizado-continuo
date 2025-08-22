package academy.felix.learnjava.javacore.Aintroducaoclasses.test;

import academy.felix.learnjava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Felix";
        estudante.idade = 34;
        estudante.sexo = 'M';
        System.out.println("Meu nome e: " +estudante.nome);
        System.out.println("Minha idade: " +estudante.idade);
        System.out.println("Sexo: " +estudante.sexo);
    }
}
