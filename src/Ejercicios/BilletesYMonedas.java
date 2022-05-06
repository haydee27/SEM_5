
package Ejercicios;

import java.util.Scanner;


public class BilletesYMonedas {
   public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int L = 0;      int M;
   
        double CxL =0.20;  double TL=0;
        double MA = 0.05;  double TM =0;
        
        System.out.println("Ingrese el total de llamadas telefonica: ");
        L = l.nextInt();
        System.out.println("Ingrese la cantidad de minutos de adicionales de sus llamadas: ");
        M = l.nextInt();
        
        
        TL = L * CxL;
        TM = M * MA;
        double T = TL + TM;
        
        System.out.println("El costo de sus llamadas son: $ " + T);
    }
 
}
