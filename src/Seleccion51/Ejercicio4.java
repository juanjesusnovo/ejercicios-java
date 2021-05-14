package Seleccion51;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner entrada1 = new Scanner(System.in);

        System.out.println("Introduce un número: ");

        while(!entrada1.hasNextInt()){
            entrada1.nextLine();
            System.out.println("La nota debe ser un número");
        }

        int numero1 = entrada1.nextInt();
        entrada1.nextLine();

        Scanner entrada2 = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int numero2 = entrada2.nextInt();
        entrada2.nextLine();

        Scanner entrada3 = new Scanner(System.in);

        System.out.println("Introduce la operación a realizar [+, -, *, /]");
        String operacion = entrada3.next();

        while(true){
            int numero3 = 0;
            if (operacion  == "+"){
                numero3 = (numero1 + numero2);
                System.out.println(numero3);
                break;
            }
            if (operacion == "-"){
                numero3 = numero1 + numero2;
                System.out.println(numero3);
                break;
            }
            if (operacion == "*"){
                numero3 = numero1 * numero2;
                System.out.println(numero3);
                break;
            }
            if (operacion == "/"){
                numero3 = numero1 / numero2;
                System.out.println(numero3);
                break;
            }
        }
    }
}
