package Ex;

import java.util.Scanner;

public class EditorGrafico {
        Grafico grafico;
        EditorGrafico(Grafico grafico){
            this.grafico = grafico;
        }
        public boolean mover(int x, int y){
            return grafico.mover(x, y);
        }
        public static int comprobar(String text){
            Scanner valor = new Scanner(System.in);
            System.out.println(text);
            while (!valor.hasNextInt()){
                valor.nextLine();
                System.out.println("Debe ser un numero");
            }
            int valor1 = valor.nextInt();
            valor.nextLine();
            return valor1;
        }
    public static void main (String args[]) throws GraficoException {
            GraficoCompuesto graficoCompuesto = new GraficoCompuesto();
        {
            System.out.println("circulo");
            int x = comprobar("x: ");
            int y = comprobar("y: ");
            int radio = comprobar("Radio: ");
            graficoCompuesto.newGrafico(new Circulo(x, y, radio));
            System.out.println("punto");
            x = comprobar("x: ");
            y = comprobar("y: ");
            graficoCompuesto.newGrafico(new Punto(x, y));
            System.out.println("rectangulo");
            x = comprobar("x: ");
            y = comprobar("y: ");
            int ancho = comprobar("Ancho: ");
            int alto = comprobar("Alto: ");
            graficoCompuesto.newGrafico(new Rectangulo(x, y, ancho, alto));
        }

        EditorGrafico editorgrafico = new EditorGrafico(graficoCompuesto);
        while (true) {
            editorgrafico.grafico.dibujar();
            System.out.println("Opciones: ");
            System.out.println("1.- Mover");
            System.out.println("2.- Salir");
            int opcion =  comprobar("> ");
            if (opcion==2) break;
            if (opcion==1) {
                int x = comprobar("x: ");
                int y = comprobar("y: ");
                if (!editorgrafico.mover(x, y)) {
                    System.out.println("Ojo!!! Estas fuera de pantalla");
                }
    }
}
}
}


