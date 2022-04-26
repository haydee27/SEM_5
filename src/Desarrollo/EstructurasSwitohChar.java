
package Desarrollo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructurasSwitohChar {
    public static void main(String[] args) {
        try{ //Objeto leer de la clase BufferedReade
            BufferedReader l = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar el estado civil de la persona:");
            String estadocivil = l.readLine(); //Dato de tipo String
            //toUpperCase combierte el contenido a mayusculas a cahrAt extrae el caracter de la posicion 0
            switchChar(estadocivil.toUpperCase().charAt(0));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void switchChar(char estadocivil) {
        String mensaje;
        switch(estadocivil){ //valor o caracter a evaluar
            case 'S' : //En este caso que el valor sea "S"
            mensaje = "soltero/a";   
            break; //Detiene el proceso si era el valor ingresado
            case 'C' : //En este caso que el valor sea "C" y asi sucesivamente
            mensaje = "casado/a";
            break;
            case 'D' :
                mensaje = "divorciado/a";
            break;
             case 'A' :
                mensaje = "acompañado/a";
            break;
             case 'F' :
                mensaje = "Forever Alone";
            break;
             default:// Si no se cumple ninguno de los anteriores
                 mensaje = "Estado Civil erroneo!";
        }
        System.out.println("Su estado civil es: " + mensaje);
    }
}
