package Examen;

interface Grafico {
    int getX();

    void setX(int x);

    int getY();

    void setY(int y);

    void grafico(Grafic Punto);

}
public class Grafic extends GraficoCompuesto {
    boolean mover;
    public void mover(int x, int y){
        if (x<800 | y<600){
            mover = true;
        }
    }
    public void dibujar(){

    }
}
