import java.util.Scanner;
public class Ejer7 {
    public static void  main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("COLOQUE EL NUMERO DE RESPUESTAS CORRECTAS: ");
        int correc = scanner.nextInt();


        System.out.print("COLOQUE EL NUMERO DE RESPUESTAS INCORRECTAS: ");
        int incor = scanner.nextInt();


        System.out.print("COLOQUE EL NUMERO DE RESPUESTAS EN BLANCO: ");
        int enBlanco = scanner.nextInt();

        int notaFinal = (correc * 5) + (incor * -1) + (enBlanco * 0);

        System.out.println("La nota final del estudiante es: " + notaFinal);



        scanner.close();
    }
}
