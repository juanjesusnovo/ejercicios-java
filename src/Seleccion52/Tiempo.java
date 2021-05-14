package Seleccion52;

public class Tiempo {
    private int hora;
    private int minuto = 0;
    private int segundo = 0;

    public Tiempo(int hora){
        this.hora = hora;
    }
    public Tiempo(int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
    }
    public Tiempo(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "Tiempo{" + hora + "h" + "" + minuto + "m" + "" + segundo + "s" + '}';
    }
}
