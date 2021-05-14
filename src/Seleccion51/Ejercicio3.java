package Seleccion51;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] arg){
        Scanner entrada = new Scanner(System.in);

        System.out.print("La calificación se realizará a través de los siguientes parámetros:");
        System.out.println("Puntuación Calificación\n" +
                ">= 0.9 Sobresaliente\n" +
                ">= 0.8 Notable\n" +
                ">= 0.7 Bien\n" +
                ">= 0.6 Suficiente\n" +
                "< 0.6 Insuficiente\n");
        System.out.println("Introduzca la nota del alumno: ");
        while(!entrada.hasNextFloat()){
            entrada.nextLine();
            System.out.println("La nota debe ser un número");
        }

        while(true){
            try{
                float nota = entrada.nextFloat();
                entrada.nextLine();
                if (nota<0.6){
                    System.out.println("La calificación es: Insuficiente");
                    break;
                }
                if (nota>=0.6 && nota<0.7){
                    System.out.println("La calificación es: Suficiente");
                    break;
                }
                if (nota>=0.7 && nota<0.8){
                    System.out.println("La calificación es: Bien");
                    break;
                }
                if (nota>=0.8 && nota<0.9){
                    System.out.println("La calificación es: Notable");
                    break;
                }
                if (nota>=0.9 && nota<1){
                    System.out.println("La calificación es: Sobresaliente");
                    break;
                }
                if (nota<0 || nota>1){
                    System.out.println("La calificación debe estar comprendida entre 0,0 y 1,0");
                }
            }
            catch (Exception E){
                System.out.println("Ha dado excepcion");
            }
        }
    }
}
