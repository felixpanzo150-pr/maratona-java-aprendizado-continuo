package academy.felix.learnjava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //Dado o valor de um carro, descubra quantas vezes pode ser parcelado.
    //Condicao valorParcela >= 1000

    public static void main(String[] args) {
        double valorTotal = 30000;
        for ( int parcela = 1; parcela <= valorTotal; parcela++){
        double valorParcela = valorTotal / parcela;
        if (valorParcela < 1000){
            continue;
        }
        System.out.println("Parcela "+ parcela+ "Kz "+valorParcela);
    }
    }
}
