
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class masa_corporal {
    public static void main (String[] args){
      try{
            BufferedReader leer = new BufferedReader ( new InputStreamReader(System.in));
            System.out.println("ESCRIBA SU PESO EN KILOGRAMOS: ");
            double P = Double.parseDouble(leer.readLine());
            System.out.println("ESCRIBA SU ALTURA EN METROS: ");
            double E =Double.parseDouble(leer.readLine());
            
            calcularMasaCorporal(P, E);
      }catch(IOException | NumberFormatException e){
          System.out.println(e.getMessage());
        }
  }
  
  public static void calcularMasaCorporal(double P, double E){
       double Imc;
       
          Imc= P / (E*E);
           
          if (Imc<18){
               System.out.println("Peso bajo.Necesario valorar signos de desnutrición ");
            }else if (18<Imc&&Imc<=24.9 ){
                System.out.println("Peso normal");
            }else if (25<Imc&&Imc<26.9){
                System.out.println("Sobrepeso");
            }else if (27==Imc){
                System.out.println("Obesidad");
            }else if (27<Imc&&Imc<=29.9){
                System.out.println("Obesidad grado I ");
            }else if (30<Imc&&Imc<=39.9){
                System.out.println("Obesidad grado II ");
            }else if (40<Imc){
                System.out.println("Obesidad grado III Extrema o Mórbida. ");
            }
          
          System.out.println("El indice de masa corporal es : " + Imc);
  }
}
