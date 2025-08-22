package academy.felix.learnjava.javacore.Bintroducaometodos.test;

import academy.felix.learnjava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        //calculadora.multiplicaDoisNumeros(20,10);
        calculadora.multiplicaDoisNumeros(20,10.5F);
    }
}
