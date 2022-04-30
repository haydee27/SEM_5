
package Ejercicios;


import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
       Scanner l = new Scanner(System.in);
       double V;
        System.out.println("Ingrese el costo de su venta: $ ");
        V= l.nextDouble();
        
        
    }
    public static void Comision(double V){
       double C = 0;
        double R= 0.10;
        double S, SN = 0;
        if(V > 3000){ 
            C= (V * 0.10) + 300; 
            S = C * R ;
            SN = C- S;
            
            System.out.println("Su salario liquido es: $ " + C);
            System.out.println("Su salario menos retencion de renta es: $ " + SN);
        }else if(V >=1000 && V <= 2999){
            C = (V * 0.08) + 300;
            S = C * R;
            SN = C- S;
            System.out.println("Su salario liquido es: $ "+ C);
            System.out.println("Su salario menos retencion de renta es: " + SN);
        }else if(V>= 1 && V <=999) {
             C = (V * 0.05) + 300;
            S = C * R;
            SN = C- S;
            System.out.println("Su salario liquido es: $ "+ C);
            System.out.println("Su salario menos retencion de renta es: " + SN);  
        }else{
            System.out.println("Datos incorrectos");
        }
        }
        
    }
    

