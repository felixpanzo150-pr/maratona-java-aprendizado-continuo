package academy.felix.learnjava.introducao;

public class Aula05EstruturaCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo

        byte dia = 5;
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opcao invalida");
        }
        char sexo = 'F';
        switch (sexo){
            case 'F':
                System.out.println("Homem");
                break;
            case 'M': {
                System.out.println("Mulher");
            }
                default:


                    System.out.printf("Invalido");
                    break;

        }
    }
}
