package academy.felix.learnjava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudande {
    public void imprime(Estudante estudante){
        System.out.println("--------------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
