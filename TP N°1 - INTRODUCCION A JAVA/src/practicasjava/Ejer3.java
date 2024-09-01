package practicasjava;

import java.util.Scanner;

public class Ejer3 {
    
    public static void main(String[]args){
        
        Scanner s = new Scanner(System.in);
        
        String nombre, apellido;
        
        System.out.println("Ingrese su nombre: ");
        nombre = s.nextLine();
        
        System.out.println("Ingrese su apellido: ");
        apellido = s.nextLine();
        
        System.out.println("Su nombre completo es: " + nombre + " " + apellido);
    }
    
}
