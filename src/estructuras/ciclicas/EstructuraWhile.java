
package estructuras.ciclicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraWhile {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar un numero limite de repeticion:");
            String limite = leer.readLine();
            if (limite == null){ //Evalua si el valor string no esta vacio
                System.out.println("Dato invalido");
            }else{
                //Envio de parametro al metodo correspondiente haciendo la conversion o casting de datos
                instruccionWhileSencillo(Integer.parseInt(limite));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }    
    }
    
    public static void instruccionWhileSencillo(int valorLimite){
        int i = 1; //valor inicial del contador
        while(i <= valorLimite){//Repetir mientras no se cumpla la condicion 
            System.out.println("El valor de la repeticion es: " + i);
            i++; //Incremento de 1 por cada interacion 
        }
    }
}
