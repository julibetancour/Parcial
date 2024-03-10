package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;

import java.util.Scanner;
public class MaximoComunDivisor {

        public static void main(String[] args) {

            int numero1 = NumerPositivo("Ingrese el primer número positivo: ");
            int numero2 = NumerPositivo("Ingrese el segundo número positivo: ");

            int mcd = CalcularMCD(numero1, numero2);
            System.out.println("El máximo común divisor es: " + mcd);
        }


        private static int NumerPositivo(String mensaje) {
            Scanner scanner = new Scanner(System.in);
            int numero;
            do {
                System.out.print(mensaje);
                numero = scanner.nextInt();
            } while (numero <= 0);
            return numero;
        }

        private static int CalcularMCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return Math.abs(a);
        }
    }


