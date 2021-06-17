package Ex;


import java.util.ArrayList;
import java.util.List;

public class GraficoCompuesto implements Grafico{

    List<Grafico> grafic;

    GraficoCompuesto(){
        grafic = new ArrayList<>();
    }
    public void newGrafico(Grafico grafico){
        grafic.add(grafico);
    }
    public boolean quitarGrafico(Grafico grafico){
        return grafic.remove(grafico);
    }

    @Override
    public void dibujar() {

    }

    @Override
    public boolean mover(int x, int y) {
        return false;
    }
}
