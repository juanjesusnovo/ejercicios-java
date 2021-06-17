package Seleccion52;

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
        cuentas[0].depositar(200);
        for (Cuenta x: cuentas) {
            System.out.println(x.toString());
            System.out.println(x.getSaldo());
            boolean moroso = false;
            if (x != null) {
                moroso = x.getSaldo() < 0;
            }
            System.out.println("Es moroso?" + moroso);
        }
    }
}
