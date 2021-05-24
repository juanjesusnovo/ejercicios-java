package Seleccion52;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Ejercicio9 op = new Ejercicio9();
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
        op.comprobar();
        op.operacion();
        System.out.println(cuentas);
        System.out.println("Es moroso?"+moroso);
    }
    Scanner ingresar = new Scanner(System.in);
    Scanner cuenta = new Scanner(System.in);
    float nuevoSaldo;
    public void comprobar () {
        System.out.println("Introduzca el ingreso/extraccion y la cuenta: ");
        while (!ingresar.hasNextFloat()) {
            System.out.println("La operacion introducida no es válida");
            ingresar.nextLine();
        }
        ingresar.hasNextFloat();
        while (!cuenta.hasNextFloat()) {
            System.out.println("La cuenta introducida no es válida");
            cuenta.nextLine();
        }
        ingresar.hasNextFloat();
    }
    public void operacion() {
        if (ingresar > 0) {
            nuevoSaldo = cuentas[cuenta].getSaldo() + ingresar;
        }
        if (ingresar < 0) {
            nuevoSaldo = cuentas[cuenta].getSaldo() - ingresar;
        }
        cuentas[cuenta].setSaldo(nuevoSaldo);
    }
}
