package academy.felix.learnjava.introducao;
/*
 Prática:

 Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

 Eu <nome>, morando no endereço <endereço>,
 confirmo que recebi o salario de <salario>, na data <data>

 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Mauro, ";
        String endereco = "Luanda- Kinaxixi";
        double salario = 543.12;
        String dataRecebimentoSalario = "20/12/2022";
        String relatorio = "Eu " +nome+ "morando no endereço " +endereco+" confirmo que recebi o salario de "+salario+ ", na data " +dataRecebimentoSalario;

        System.out.println(relatorio);
    }

}
