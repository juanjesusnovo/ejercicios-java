package Ex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestPunto {
    Punto punto;

    @BeforeEach
    void preparar(){
        Punto punto = new Punto(10, 40);
    }
@Test
void mover(){
    assert punto.mover(3,28)==true;
    assert punto.getX() == 13;
    assert punto.getY() == 68;
    assert punto.mover(900,40)==false;
}
@Test
void dibujar(){
    punto.dibujar();
}
}