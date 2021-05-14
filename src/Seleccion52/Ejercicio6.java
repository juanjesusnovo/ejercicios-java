package Seleccion52;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Ejercicio6 operacion = new Ejercicio6();
        operacion.comprobador();
        operacion.area();
        operacion.perimetro();
    }
        Scanner base1 = new Scanner(System.in);
        Scanner altura1 = new Scanner(System.in);
        float area, perimetro, base, altura;

        public void comprobador () {
            System.out.println("Introduzca la base y la altura: ");
            while (!base1.hasNextFloat()) {
                System.out.println("La base introducida no es válida");
                base1.nextLine();
            }
            base = base1.nextFloat();
            while (!altura1.hasNextFloat()) {
                System.out.println("La altura introducida no es válida");
                altura1.nextLine();
            }
            altura = altura1.nextFloat();
        }
        public void area () {
            area = base * altura;
            System.out.println("El área del rectángulo es:");
            System.out.println(area);
        }
        public void perimetro () {
            perimetro = (2 * base) + (2 * altura);
            System.out.println("El perímetro del rectángulo es:");
            System.out.println(perimetro);
        }
    }
