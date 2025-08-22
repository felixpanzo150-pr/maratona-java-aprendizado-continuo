package academy.felix.learnjava.javacore.Bintroducaometodos.test;

import academy.felix.learnjava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTes01");
        calculadora.subtrairDoisNumeros();
    }
}
