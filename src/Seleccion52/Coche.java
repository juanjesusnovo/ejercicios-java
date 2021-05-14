package Seleccion52;

public class Coche {
    private String color, marca, modelo, matricula;
    private int caballos, puertas;

    public Coche (String color, String marca, String modelo, int caballos, int puertas, String matricula){
        super();
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.caballos = caballos;
        this.puertas = puertas;
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", caballos=" + caballos +
                ", puertas=" + puertas +
                '}';
    }
}
