package Seleccion52;

public class Ejercicio7 {

    public static void main (String[] args){
        Coche coche1 = new Coche("rojo", "peugeot", "2008", 120, 4, "1298HGQ");
        Coche coche2 = new Coche("verde", "citroen", "c4", 100, 4, "1227JKL");
        Coche coche3 = new Coche("rojo", "rayo", "mcqueen", 20000, 2, "velocidad");
        coche1.setColor("Morado");
        coche3.getMarca();
        coche2.setMatricula("1076TFQ");
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);
    }

}
