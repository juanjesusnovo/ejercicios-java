package Ex;

public class Circulo extends Punto{
    private int radio;

    public Circulo(int x, int y, int radio) {
        super(x, y);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
