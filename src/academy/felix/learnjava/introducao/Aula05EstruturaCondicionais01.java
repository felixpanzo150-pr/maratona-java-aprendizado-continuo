package academy.felix.learnjava.introducao;

public class Aula05EstruturaCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >18;
        // !
        if (isAutorizadoComprarBebida != false){
            System.out.println("Autorizado a comprar bebida alcoolica");
        }else{
            System.out.println("Não autorizado a comprar bebida alcoolica");
        }

        // if(!isAutorizadoComprarBebida) se não for?
        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcoolica");
        }
        boolean c = false;
        if (c = true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora do if");
    }
}
