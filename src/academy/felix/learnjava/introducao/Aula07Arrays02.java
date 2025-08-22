package academy.felix.learnjava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char, '\u0000'
        //boolean false
        // String null

        String [] nomes = new String [4];
        nomes [0] = "Manuel";
        nomes [1] = "Manuela";
        nomes [2] = "Manuelo";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}

