package Seleccion52;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Tiempo tiempofinal = new Tiempo(0,0);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la hora: ");
        while (!entrada.hasNextInt()){
            entrada.nextLine();
            System.out.println("El dato introducido no es válido");
        int hora = entrada.nextInt();
        entrada.nextLine();
        int minuto = 0;
        System.out.println("Introduce los minutos: ");
        while (true) {
            String x = entrada.nextLine();
            if (x.equals("")) {
                tiempofinal = new Tiempo(hora);
                break;
            } else {
                try {
                    minuto = Integer.parseInt(x);
                    entrada.nextLine();
                    int segundo = 0;
                    System.out.println("Introduce los segundos: ");
                    while (true) {
                        String y = entrada.nextLine();
                        if (y.equals("")) {
                            tiempofinal = new Tiempo(hora, minuto);
                            break;
                        } else {
                            try {
                                segundo = Integer.parseInt(y);
                                tiempofinal = new Tiempo(hora, minuto, segundo);
                                break;
                            }
                            catch (Exception e){
                                System.out.println("El valor introducido no es valido");
                            }
                        }
                    }
                }
                catch (Exception e){
                    System.out.println("El valor introducido no es valido");
                }
            }
        }
        }
        System.out.println("La hora es: "+ tiempofinal.toString());
    }

}
