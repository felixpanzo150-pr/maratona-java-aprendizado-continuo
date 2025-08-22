package academy.felix.learnjava.introducao;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        //&&(i);  else if(se não se)
        // idade < 15 catogaria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 17;
        String categoria = "nada";

        if (idade < 15){
            categoria = "Categoria Infantil";
        }else if (idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
