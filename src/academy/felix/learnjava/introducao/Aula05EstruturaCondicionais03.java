package academy.felix.learnjava.introducao;

public class Aula05EstruturaCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 8000;
        // (condição) ? verdadeiro : falso

        String resultado = salario > 5000 ? "Eu vou doar 500 pro Felix." : "Ainda nao tenho condicoes, mas vou ter.";

        System.out.println(resultado);
    }
}
