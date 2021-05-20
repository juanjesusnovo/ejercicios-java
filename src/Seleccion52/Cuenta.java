package Seleccion52;

public class Cuenta {
    public String Numero;
    public int Saldo;
    public Cuenta(String Numero, int Saldo){
        this.Numero = Numero;
        this.Saldo = Saldo;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int saldo) {
        Saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "Numero='" + Numero + '\'' +
                ", Saldo=" + Saldo +
                '}';
    }
}
