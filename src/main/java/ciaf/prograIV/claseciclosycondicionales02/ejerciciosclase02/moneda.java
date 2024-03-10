package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;

import java.util.Scanner;
public class moneda {

    public static void main(String[] args) {
        System.out.println("Ingresa el valor a convertir:");
        Scanner sc= new Scanner(System.in);
        int valor_usd= sc.nextInt();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Dolares");
            System.out.println("2. euros");
            System.out.println("3. yens");
            System.out.println("4.TERMINAR");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("su valor en pesos  es "+  valor_usd + " en Dolares son " +  valor_usd / 3800 +  "Dolares");

                    break;
                case 2:
                    System.out.println("su valor en pesos  es "+  valor_usd + " en Euros son "+  valor_usd / 4300 +"Euros");

                    break;
                case 3:
                    System.out.println("su valor en pesos  es "+  valor_usd + " en Yens son "+  valor_usd / 26471 +"Yenss");

                    break;
                case 4:
                    System.out.println("TERMINO");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);
    }
}

