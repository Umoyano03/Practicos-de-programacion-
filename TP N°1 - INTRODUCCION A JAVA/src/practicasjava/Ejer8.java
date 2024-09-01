package practicasjava;

import java.util.Scanner;

public class Ejer8 {
    
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int nro1;
        
        System.out.println("Ingrese su número: ");
        nro1 = s.nextInt();
        
        if(nro1 % 2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        
    }
    
}
