package academy.felix.learnjava.introducao;

public class Aula05EstruturaCondicionais06 {
    public static void main(String[] args) {
        // Utilizando o switch e dado os valores de 1 a 7, imprima se é dia util ou final de semana
        // Considerando 1 como domingo
        byte dia = 2;
        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.printf("Dia de semana");
                break;
            default:
                System.out.printf("Opcao invalida");
                break;
        }
    }
}
