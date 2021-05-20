package Seleccion52;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Persona p1 = new Persona("1213737321");
        Cuenta[] cuentas = new Cuenta[3];
        cuentas[0] = new Cuenta("12390871247",0);
        cuentas[1] = new Cuenta("1238929140",700);
        for(int i = 0;i<cuentas.length;i++){
            if(cuentas[i]==null){
                cuentas[i] = new Cuenta("1278398211",-32);
                break;
            }
        }
        boolean moroso = false;
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null) {
                moroso = cuentas[i].getSaldo() < 0;
                if (moroso) {
                    break;
                }
            }
        }
        System.out.println(cuentas);
        System.out.println("Es moroso?"+moroso);
    }
    Scanner ingresar = new Scanner(System.in);
    Scanner cuenta = new Scanner(System.in);
    public void accion (){
        if (ingresar > 0){

        }
        if (ingresar == 0){

        }
        else{
            break;
        }
    }
}
