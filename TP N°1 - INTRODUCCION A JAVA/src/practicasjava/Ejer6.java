package practicasjava;

import java.util.Scanner;

public class Ejer6 {
   
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int nro1, doble, triple;
        double raiz;
        
        System.out.println("Ingrese su número: ");
        nro1 = s.nextInt();
        
        doble = nro1 * 2;
        triple = nro1 * 3;
        
        raiz = Math.sqrt(nro1);

        System.out.println("El doble: " + doble);
        System.out.println("El triple: " + triple);
        System.out.println("La raiz: " + raiz);
    }
}
