import java.util.Scanner;

public class Ejer6{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("INGRESE SU NOMBRE: ");
        String nom = scanner.nextLine();

        System.out.println("INGRESE SU PRIMER APELLIDO: ");
        String apell1 = scanner.nextLine();

        System.out.println("INGRESE SU SEGUNDO APELLIDO: ");
        String apell2 = scanner.nextLine();

        char nombre = nom.charAt(0);
        char apellidouno = apell1.charAt(0);
        char apellidodos= apell2.charAt(0);

        System.out.println("LAS INICIALES SON: " + nombre + apellidouno + apellidodos);

        scanner.close();




    }
}
