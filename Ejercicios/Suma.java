package Ejercicios;

public class Suma {

    static int sumaPares = 0;
    static int sumaImpares = 0;

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            } else {
                sumaImpares += i;
          }
        }

        System.out.println("Suma Pares: " + sumaPares);
        System.out.println("Suma Impares " + sumaImpares);
    }
}
