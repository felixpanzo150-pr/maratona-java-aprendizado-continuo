package academy.felix.learnjava.javacore.Bintroducaometodos.test;

import academy.felix.learnjava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.felix.learnjava.javacore.Bintroducaometodos.dominio.ImpressoraEstudande;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudande impressora = new ImpressoraEstudande();

        estudante01.nome = "Calunga";
        estudante01.idade = 13;
        estudante01.sexo = 'M';


        estudante02.nome = "Ngando";
        estudante02.idade = 13;
        estudante02.sexo = 'M';



        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

        System.out.println("#########################");

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

   }
}
