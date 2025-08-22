package academy.felix.learnjava.introducao;

public class Aula04Operadore {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 /(double) numero02;

        System.out.println(resultado);

        // %

        int resto = 21 % 7;
        System.out.println(resto);

        // Boolean👇🏾
        // < (menor); > (maior); (<= (menor igual), >= (maior igual), ==(igual), !=(diferente)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMenorIgualQueVinte = 10 <= 20;
        boolean isDezMiorIgualQueVinte = 10 >= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDiferenteQueVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " +isDezMenorQueVinte);
        System.out.println("isDezMenorIgualQueVinte " +isDezMenorIgualQueVinte);
        System.out.println("isDezMaiorIgualQueVinte " +isDezMiorIgualQueVinte);
        System.out.println("isDezIgualVinte " +isDezIgualVinte);
        System.out.println("isDiferenteQueVinte " +isDiferenteQueVinte);

        // Operadores lógicos - && (AND) //(OR)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " +isPlaystationCincoCompravel);

        // Operadores de atribuição: = , +=, -=, /=, %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 2800
        bonus *= 2; //1800
        bonus /= 2; //1800
        bonus %= 2; //1800
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador +=1; // contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;

        System.out.println(contador2++);
    }
}
