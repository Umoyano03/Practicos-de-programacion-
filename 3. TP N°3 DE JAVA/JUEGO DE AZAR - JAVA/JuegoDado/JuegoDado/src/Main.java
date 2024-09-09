/*EJERCICIO : JUEGO DE DADOS*/

import java.util.Random;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Random random = new Random();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenido al juego de dados");
            System.out.println("Lanza los dados");
            System.out.println("Si saca 7 u 11 usted gana ");
            System.out.println("Si saca 2, 3 O 12 pierde ");
            System.out.println("Si es cualquier otro numero siga intentando ");

            while (true) {
                System.out.println("Presiona 'r' para lanzar los dados...");
                String input = scanner.next();

                if (input.equalsIgnoreCase("r")) {
                    int numero = random.nextInt(6) + random.nextInt(6) + 2;
                    System.out.println("Sacaste un " + numero);

                    if (numero == 7 || numero == 11) {
                        System.out.println("¡Ganaste!");
                        break;
                    } else if (numero == 2 || numero == 3 || numero == 12) {
                        System.out.println("Perdiste...");
                        break;
                    }
                } else {
                    System.out.println("Presiona 'r' para lanzar los dados...");
                }
            }
        }
    }

