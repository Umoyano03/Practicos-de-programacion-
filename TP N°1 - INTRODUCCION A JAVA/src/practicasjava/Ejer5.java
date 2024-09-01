package practicasjava;

import java.util.Scanner;

public class Ejer5 {
 
    public static void main(String[] args){
        //F = 32 + (9 * C / 5)
        Scanner s = new Scanner(System.in);
        
        double grados, faren;
        
        System.out.println("Ingrese la temperatura deseada: ");
        grados = s.nextDouble();
        
        faren = 32 + (9 * grados / 5);
        
        System.out.println("El resultados en grados Farenheit es: " + faren);
    }
    
}
