import java.util.Scanner;
public class Ejer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("INGRESE SU DIA DE NACIMIENTO: ");
        int dia = scanner.nextInt();

        System.out.print("INGRESE SU MES DE NACIMIENTO: ");
        int mes = scanner.nextInt();


        System.out.print("INGRESE SU AÑO DE NACIMIENTO: ");
        int año = scanner.nextInt();


        String fechaNacimiento = "" + dia + mes + año;


        int suma = 0;


        for (int i = 0; i < fechaNacimiento.length(); i++) {
            suma += Character.getNumericValue(fechaNacimiento.charAt(i));
        }


        int numeroDeLaSuerte = 0;
        while (suma > 0) {
            numeroDeLaSuerte += suma % 10;
            suma /= 10;


            if (suma == 0 && numeroDeLaSuerte > 9) {
                suma = numeroDeLaSuerte;
                numeroDeLaSuerte = 0;
            }
        }


        System.out.println("-------TU NUMERO DE LA SUERTE ES-------: " + numeroDeLaSuerte);

        scanner.close();
    }
}