package academy.felix.learnjava.javacore.Bintroducaometodos.test;

import academy.felix.learnjava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.felix.learnjava.javacore.Bintroducaometodos.dominio.ImpressoraEstudande;

public class EstudanteTest02 {
        public void main(String[] args) {
            Estudante estudante01 = new Estudante();
            Estudante estudante02 = new Estudante();

            ImpressoraEstudande impressora = new ImpressoraEstudande();

            estudante01.nome = "Calunga";
            estudante01.idade = 13;
            estudante01.sexo = 'M';


            estudante02.nome = "Ngando";
            estudante02.idade = 13;
            estudante02.sexo = 'M';

            estudante01.imprime();
            estudante02.imprime();
        }
    }
