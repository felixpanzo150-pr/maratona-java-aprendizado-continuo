package academy.felix.learnjava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void  subtrairDoisNumeros(){
        System.out.println(21 -2);
    }


    // Parámetros
    public void multiplicaDoisNumeros(int num1, float num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return num1/num2;
        }
        System.out.println("Nao existe divisao por zero");
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Nao existe divisao por zero");
            //return 0;
        }else {
        System.out.println(num1/num2);

    }

    }

    public void alteraDoisNumeros(int num1, int mum2){
        num1 = 99;
        mum2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+mum2);

    }
}
