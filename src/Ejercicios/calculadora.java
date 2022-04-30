
package Ejercicios;

import java.util.Scanner;


public class calculadora {
    public static void main(String [] args){
      Scanner l = new Scanner(System.in); 
      
      int n1, n2;
        String O;
      
       System.out.println("Seleccione que opcion desea realizar:");
       System.out.println("1. si desea Sumar: ");
       System.out.println("2. si desea restar: ");
       System.out.println("3. si desea multiplicar: ");
       System.out.println("4. si desea dividir: ");
       O = l.nextLine();

        
      Operaciones(O.toUpperCase().charAt(0));
   
   }
   public static void Operaciones( char O){
       double Ope = 0.0;
       int n1, n2;
       Scanner le = new Scanner(System.in);
       switch(O){
           case '1':
               System.out.println("Ingrese el primer numero: ");
               n1 = le.nextInt();
               System.out.println("Ingrese el segundo numero: ");
               n2 = le.nextInt();
               Ope = n1 + n2;
               System.out.println("La resultado de la suma es: " + Ope);
           break;
           case '2':
                System.out.println("Ingrese el primer numero: ");
               n1 = le.nextInt();
               System.out.println("Ingrese el segundo numero: ");
               n2 = le.nextInt();
               Ope = n1 - n2;
               System.out.println("La resultado de la resta es: " + Ope);
           break;
           case '3':
                System.out.println("Ingrese el primer numero: ");
               n1 = le.nextInt();
               System.out.println("Ingrese el segundo numero: ");
               n2 = le.nextInt();
               Ope = n1 * n2;
               System.out.println("La resultado de la multiplicacion es: " + Ope);
           break;
           case '4':
               try{
                System.out.println("Ingrese el primer numero: ");
               n1 = le.nextInt();
               System.out.println("Ingrese el segundo numero: ");
               n2 = le.nextInt();
              
                    Ope = n1 / n2;
               System.out.println("La resultado de la division es: " + Ope);  
               
                   System.out.println("Su division no se puede realizar");
               
                   System.out.println("");
               
               }catch(ArithmeticException e){
                   Ope= 0;
                   System.out.println(e.getMessage());
                   System.out.println("Error matematico......");

               }
               break; 
           default: System.out.println("Esa opcion no existe.");
               
       } 
   }
}
