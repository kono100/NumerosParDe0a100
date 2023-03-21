package pkg0a100comfor;

public class Main {

    public static void main(String[] arguments) {

        /*1) Faça um algoritmo que imprima os valores pares de 0 até 100.
        Dica: Utilize o operador mod %(resto).*/
        
        int x;

        for (x = 1; x <= 100; x++) {

            if ((x % 2 == 0)) {
                System.out.print(" " + x);
            }

        }
    }
}