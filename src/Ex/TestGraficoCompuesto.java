package Ex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestGraficoCompuesto {
    Punto punto;
    Circulo circulo;
    Rectangulo rectangulo;
    GraficoCompuesto graficoCompuesto;
    @BeforeEach
    void preparar(){
        Punto punto = new Punto(10,10);
        Circulo circulo = new Circulo(10,10,20);
        Rectangulo rectangulo = new Rectangulo(10,10,20,20);
        GraficoCompuesto graficoCompuesto = new GraficoCompuesto();
        graficoCompuesto.newGrafico(punto);
        graficoCompuesto.newGrafico(circulo);
        graficoCompuesto.newGrafico(rectangulo);
        graficoCompuesto.quitarGrafico(circulo);
    }
    @Test
    void mover(){
        assert graficoCompuesto.mover(10,10)==true;
        graficoCompuesto.dibujar();
    }
    @Test
    void dibujar(){
        graficoCompuesto.dibujar();
    }
}