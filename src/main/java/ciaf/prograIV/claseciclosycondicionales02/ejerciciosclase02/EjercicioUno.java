package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;

import java.util.Scanner;


public class EjercicioUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ano: ");
        int anio = scanner.nextInt();

        if (esBisiesto(anio)) {
            System.out.println(anio + " es un ano bisiesto.");
        } else {
            System.out.println(anio + " no es un ano bisiesto.");
        }
    }


    static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}