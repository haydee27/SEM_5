
package Desarrollo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraSwitchInt {
    public static void main(String[] args) {
      try{// objeto leer de la clase BufferedReader
          BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
          System.out.println("Ingrese un numero entre 1 y 5:");
          int numero = Integer.parseInt(leer.readLine());//Datos tipo int
          switchInt(numero); 
      }catch(Exception e){
          System.out.println(e.getMessage());
      }
    }
    
    public static void switchInt(int numero) {// Metodo para el switch
        String nombreDelNumero;
        switch(numero){//valor o carater a evaluar
            case 1://En el caso que el valor sea 1
                nombreDelNumero = "UNO";
                break;//Detiene el proceso si era el valor ingresado
            case 2://En el caso qu el valor sea 2 y asi sucesivamente
                nombreDelNumero = "DOS";
                break;
            case 3:
                nombreDelNumero = "TRES";
                break;
            case 4:
                nombreDelNumero = "CUATRO";
                break;
            case 5:
                nombreDelNumero = "CINCO";
                break;
            default: // si no se cumple ninguno de loas anteriores
                nombreDelNumero = "Numero no valido";   
        }
        System.out.println("El numero ingresado es: " + nombreDelNumero);
    }
}

