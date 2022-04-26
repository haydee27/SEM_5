
package Desarrollo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraIfElse {
    public static void main(String[] args) {
        try{ //Objeto leer de la clase BufferedReader
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese la cantidad de su salario:");
            double salario = Double.parseDouble(leer.readLine());
            ifElse(salario); //ENVIA EL VALOR DE SALARIO A SER EVALUADO AL METODO
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
      
    }

    public static void ifElse(double salario) {
        if(salario> 235){ //La condicion que se evalua y en caso de ser verdadera
            System.out.println("Usted gana mas del salario minimo");
        }else { //En este caso que la condicion anterior no se cumpla se ejecuta lo siguiente
            System.out.println("Usted gana menos del salario minimo");
        }
    }
}
