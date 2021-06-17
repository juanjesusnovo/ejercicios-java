package Seleccion52;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Persona {
    private String DNI;
    private Cuenta[] Cuentas = new Cuenta[3];

    public  Persona(String DNI){
        this.DNI = DNI;
    }
    public Persona(String DNI, Cuenta[] cuentas) {
        this.DNI = DNI;
        this.Cuentas = cuentas;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Cuenta[] getCuentas() {
        return Cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        Cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI='" + DNI + '\'' +
                ", Cuentas=" + Arrays.toString(Cuentas) +
                '}';
    }
}
